package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Especialidad {

    @Id
    private String idesp;

    private String nomesp;

    private Double costo;

}
