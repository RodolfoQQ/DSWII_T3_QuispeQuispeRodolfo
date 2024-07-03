package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.util;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.dtos.DtoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoUtil {

    public DtoEntity convertirADto(Object obj, DtoEntity mapper){
        return new ModelMapper().map(obj, mapper.getClass());
    }
    public Object convertirDtoAEntity(Object obj, DtoEntity mapper){
        return new ModelMapper().map(mapper, obj.getClass());
    }
}
