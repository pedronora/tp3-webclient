package br.edu.infnet.tp3webclient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HourlyUnitsDTO {
    private String time;
    private String temperature_2m;
}
