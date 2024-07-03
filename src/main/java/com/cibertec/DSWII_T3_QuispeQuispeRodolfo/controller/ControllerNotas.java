package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.controller;


import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.dtos.NotasDto;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services.IserviceNotas;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("api/notas")
public class ControllerNotas {

    private IserviceNotas iserviceNotas;



    @GetMapping("/pubs-dto")
    public ResponseEntity<List<?>> pubsdto() {
        List<Object[]> notasEntityList = iserviceNotas.findallnotas();

        if (notasEntityList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<NotasDto> notasDtos= new ArrayList<>();

        for (Object[] obj : notasEntityList) {
            NotasDto notasDto = new NotasDto();
            notasDto.setExaparcial((Double) obj[0]);
            notasDto.setExafinal((Double) obj[1]);
            notasDto.setNomcurso((String) obj[2]);
            notasDto.setApealumno((String) obj[3]);
            notasDto.setNomalumno((String) obj[4]);

            notasDtos.add(notasDto);
        }

        return new ResponseEntity<>( notasDtos, HttpStatus.OK);
    }


}
