package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface IFileService {
    void guardarArchivo(MultipartFile archivo) throws Exception;
    void guardarArchivos(List<MultipartFile> archivosList) throws Exception;
}
