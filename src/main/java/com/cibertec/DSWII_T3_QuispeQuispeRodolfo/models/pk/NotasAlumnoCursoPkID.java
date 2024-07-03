package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class NotasAlumnoCursoPkID implements Serializable {

    private  String idalumno;
    private  String idcurso;
}
