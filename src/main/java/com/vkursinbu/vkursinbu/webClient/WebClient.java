package com.vkursinbu.vkursinbu.webClient;

import com.vkursinbu.vkursinbu.Pojo.PojoVkursi;
import com.vkursinbu.vkursinbu.Pojo.Weather;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WebClient {

    private final org.springframework.web.reactive.function.client.WebClient webClient;

    public WebClient(org.springframework.web.reactive.function.client.WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
//                .baseUrl("https://bank.gov.ua/NBUStatService/v1/statdirectory").build();
                .baseUrl("https://community-open-weather-map.p.rapidapi.com/weather?id=2172797&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html&q=Kiev%2Cua")
                .defaultHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "0e1dba7559mshe0ca0976c3cefd2p1413a2jsn8beb38965b42")
                .build();
    }
    // https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&date=20150203&json

//    public Flux<PojoVkursi> getKurs () {
//        return webClient.get().uri("/exchange?valcode=USD&date=20150203&json").retrieve().bodyToFlux(PojoVkursi.class);
//}

    public Mono<Weather> getWeather () {
        Mono<Weather> weatherMono = webClient.get().uri("").retrieve().bodyToMono(Weather.class);
        return weatherMono;
    }
}
