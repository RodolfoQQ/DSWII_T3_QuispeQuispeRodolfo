package com.cibertec.DSWII_T3_QuispeQuispeRodolfo.repositorys;


import com.cibertec.DSWII_T3_QuispeQuispeRodolfo.models.seguridad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario, Integer> {

    //Select * from usuario where nomusuario = 'lsalvat'
    Usuario findByNomusuario(String nomusuario);
    //Select * from usuario where nombres = 'lsalvat'
    Usuario findByNombres(String nombres);

}
