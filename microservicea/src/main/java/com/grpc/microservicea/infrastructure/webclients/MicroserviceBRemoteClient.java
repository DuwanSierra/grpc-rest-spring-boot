package com.grpc.microservicea.infrastructure.webclients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MicroserviceBRemoteClient {

    @Value("${microserviceb.url}")
    private String microserviceBUrl;
    @Bean
    public WebClient microserviceBClient() {
        return WebClient
        .builder()
        .baseUrl(microserviceBUrl)
        .exchangeStrategies(ExchangeStrategies
        .builder()
        .codecs(codecs -> codecs
            .defaultCodecs()
            .maxInMemorySize(1024 * 1024 * 1024))
        .build())
            .build();
    }
    
}
