package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk.PagosAlumnoPKId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Pagos {

    @EmbeddedId
    private PagosAlumnoPKId id;

     private Double monto;
     private Date datetime;



}
