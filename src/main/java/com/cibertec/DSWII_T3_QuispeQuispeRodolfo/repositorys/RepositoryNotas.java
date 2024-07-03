package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.repositorys;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.Notas;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.pk.NotasAlumnoCursoPkID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryNotas extends JpaRepository<Notas, NotasAlumnoCursoPkID> {


}
