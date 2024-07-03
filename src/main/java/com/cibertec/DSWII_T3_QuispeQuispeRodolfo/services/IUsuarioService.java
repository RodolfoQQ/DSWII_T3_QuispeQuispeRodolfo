package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services;

import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.seguridad.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}