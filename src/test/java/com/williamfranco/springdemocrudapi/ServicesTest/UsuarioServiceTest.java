package com.williamfranco.springdemocrudapi.ServicesTest;

import com.williamfranco.springdemocrudapi.models.RolModel;
import com.williamfranco.springdemocrudapi.models.UsuarioModel;
import com.williamfranco.springdemocrudapi.repositories.RolRepository;
import com.williamfranco.springdemocrudapi.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioServiceTest {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    RolRepository rolRepository;

    @Test
    public void testGuardarUsuario(){
        UsuarioModel usuarioModel=new UsuarioModel("aquaman","aqua@gmail.com",99);
        UsuarioModel usuarioModelRegistrado = usuarioRepository.save(usuarioModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<UsuarioModel> usuarioModelBuscado=usuarioRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getId()).isEqualTo(idBuscado);
    }

    @Test
    public void testListarUsuarios(){
        List<UsuarioModel> usuarioModelList=(List<UsuarioModel>) usuarioRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }

    @Test
    public void testInsertarRol(){
        RolModel usuarioRol=new RolModel("Vendedor");
        RolModel RolRegistrado = rolRepository.save(usuarioRol);
        assertNotNull(RolRegistrado);
    }

    @Test
    public void testListarRol(){
        List<RolModel> usuarioModelList=(List<RolModel>) rolRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }
}
