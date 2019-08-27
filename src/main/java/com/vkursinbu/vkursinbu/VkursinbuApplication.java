package com.vkursinbu.vkursinbu;

import com.vkursinbu.vkursinbu.webClient.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VkursinbuApplication implements CommandLineRunner {
@Autowired

    WebClient webClient;

    public static void main(String[] args) {
        SpringApplication.run(VkursinbuApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //webClient.getKurs().subscribe(w->System.out.println(w));

      //  webClient.getWeather().subscribe(weather -> System.out.println(weather.getWeather()));
    }


}
