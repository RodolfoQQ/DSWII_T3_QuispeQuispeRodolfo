package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.services;


import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.seguridad.Usuario;
import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.repositorys.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}