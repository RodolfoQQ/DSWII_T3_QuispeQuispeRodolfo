package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk.NotasAlumnoCursoPkID;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
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

    private Double exaparcial;
    private Double exafinal;


    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    @JsonBackReference
    private Alumno alumno;

    @ManyToOne
    @MapsId("idcurso")
    @JoinColumn(name = "idcurso")
    @JsonBackReference
    private  Curso curso;

}
