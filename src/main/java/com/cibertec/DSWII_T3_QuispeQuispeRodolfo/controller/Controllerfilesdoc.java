package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.controller;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.dtos.ArchivoDto;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services.IFileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/filesdoc")
public class Controllerfilesdoc {

    private IFileService fileService;

    @PostMapping("/filesdoc")
    public ResponseEntity<String> uploadFiles(@RequestParam("file") MultipartFile file) {
        try {
               if (!file.getOriginalFilename().toLowerCase().endsWith(".doc")) {
                return ResponseEntity.badRequest().body("Solo se permiten archivos .doc");
            }
            if (file.getSize() > 2 * 1024 * 1024) {
                return ResponseEntity.badRequest().body("El tamaño máximo permitido es de 2 MB");
            }
            fileService.guardarArchivo(file);
            return ResponseEntity.ok("Archivo subido correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al subir el archivo");
        }
    }
}
