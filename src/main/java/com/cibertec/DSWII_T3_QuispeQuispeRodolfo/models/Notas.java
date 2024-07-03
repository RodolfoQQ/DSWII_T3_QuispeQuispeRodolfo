package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk.NotasAlumnoCursoPkID;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
public class Notas {

    @EmbeddedId
    private NotasAlumnoCursoPkID id;

    private Integer exaparcial;
    private Integer exafinal;


}
