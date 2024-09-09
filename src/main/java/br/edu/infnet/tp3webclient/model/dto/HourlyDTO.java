package br.edu.infnet.tp3webclient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HourlyDTO {
    private List<String> time;
    private List<Double> temperature_2m;
}
