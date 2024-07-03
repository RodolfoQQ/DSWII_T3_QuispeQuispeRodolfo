package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class PagosAlumnoPKId implements Serializable{

   private String idalumno;
   private String ciclo;
   private Integer  ncuota;

}
