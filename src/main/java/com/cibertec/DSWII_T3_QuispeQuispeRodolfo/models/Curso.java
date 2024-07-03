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
public class Curso {


    @Id
    private  String idcurso;
    private String nomcurso;
    private Integer credito;


}
