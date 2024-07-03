package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotasDto implements  DtoEntity {

    private double exaparcial;
    private double exafinal;
    private String nomcurso;
    private String apealumno;
    private String nomalumno;

}
