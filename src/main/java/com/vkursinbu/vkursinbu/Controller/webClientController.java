package com.vkursinbu.vkursinbu.Controller;

import com.vkursinbu.vkursinbu.Pojo.PojoVkursi;
import com.vkursinbu.vkursinbu.Pojo.Weather;
import com.vkursinbu.vkursinbu.webClient.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class webClientController {

    @Autowired
    WebClient webClient;



//    @GetMapping ("/client")
//    public Flux<PojoVkursi> getClient () {
//        return webClient.getKurs();
//
//    }

@GetMapping ("/weather")
    public Mono<Weather> getKievWeather () {
//    response.getHeaders().add("x-rapidapi-host","community-open-weather-map.p.rapidapi.com");
//    response.getHeaders().add("x-rapidapi-key","0e1dba7559mshe0ca0976c3cefd2p1413a2jsn8beb38965b42");

         return    webClient.getWeather();
}
}
