package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.Notas;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.repositorys.RepositoryNotas;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceNotas implements  IserviceNotas{

    private RepositoryNotas repositoryNotas;

    @Override
    public List<Object[]> findallnotas() {
        return  repositoryNotas.findAllNotasDto();
    }


}
