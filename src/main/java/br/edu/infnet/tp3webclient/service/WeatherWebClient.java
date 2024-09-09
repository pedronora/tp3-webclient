package br.edu.infnet.tp3webclient.service;

import br.edu.infnet.tp3webclient.model.Weather;
import br.edu.infnet.tp3webclient.model.dto.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherWebClient {

    private final WebClient webClient;

    public WeatherWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.open-meteo.com/v1").build();
    }

    public Mono<WeatherResponse> getWeather(Weather weather) {
        return webClient.get().uri(uriBuilder -> uriBuilder
                .path("/forecast")
                .queryParam("latitude", weather.getLatitude())
                .queryParam("longitude", weather.getLongitude())
                .queryParam("hourly", "temperature_2m")
                .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }
}
