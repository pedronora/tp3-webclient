package br.edu.infnet.tp3webclient.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("consultas")
public class Weather {
    private Double latitude;
    private Double longitude;
}
