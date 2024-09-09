package br.edu.infnet.tp3webclient.controller;

import br.edu.infnet.tp3webclient.model.Weather;
import br.edu.infnet.tp3webclient.model.dto.WeatherResponse;
import br.edu.infnet.tp3webclient.service.WeatherWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherWebClient weatherWebClient;

    @GetMapping
    public Mono<WeatherResponse> getWeather(@RequestBody Weather weather) {
        return weatherWebClient.getWeather(weather);
    }
}
