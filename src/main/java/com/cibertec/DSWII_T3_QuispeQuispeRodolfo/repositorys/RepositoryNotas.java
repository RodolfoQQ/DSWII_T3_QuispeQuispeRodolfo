package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.repositorys;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.Notas;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.dtos.NotasDto;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk.NotasAlumnoCursoPkID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface RepositoryNotas extends JpaRepository<Notas, NotasAlumnoCursoPkID> {


    @Query(value = "SELECT n.exaparcial AS exaparcial, " +
            "n.exafinal AS exafinal, " +
            "c.NomCurso AS nomCurso, " +
            "a.ApeAlumno AS apeAlumno, " +
            "a.NomAlumno AS nomAlumno " +
            "FROM Notas n " +
            "JOIN Curso c ON n.IdCurso = c.IdCurso " +
            "JOIN Alumno a ON n.IdAlumno = a.IdAlumno", nativeQuery = true)
    List<Object[]> findAllNotasDto();


}
