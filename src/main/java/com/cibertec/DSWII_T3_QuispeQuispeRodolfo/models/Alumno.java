package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models;

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
public class Alumno {

    @Id
    private String idalumno;
    private String apealumno;
    private String nomalumno;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "idesp")
    @MapsId("idesp")
    @JsonBackReference
    private Especialidad especialidad;

    private String proce;


}
