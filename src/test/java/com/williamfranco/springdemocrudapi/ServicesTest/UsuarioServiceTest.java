package com.williamfranco.springdemocrudapi.ServicesTest;

import com.williamfranco.springdemocrudapi.models.UsuarioModel;
import com.williamfranco.springdemocrudapi.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioServiceTest {
    @Autowired
    UsuarioRepository usuarioRepository;

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
    public void testActualizarUsuarioPorId(){
        Long idBuscado=1L;
        String nombre = "Carlos";
        String email = "email@correo.com";
        int prioridad = 99;
        UsuarioModel usuarioModel = new UsuarioModel(nombre, email, prioridad);
        usuarioModel.setId(idBuscado);

        usuarioRepository.save(usuarioModel);

        Optional<UsuarioModel> usuarioModelActualizado = usuarioRepository.findById(idBuscado);
        assertThat(usuarioModelActualizado.get().getNombre()).isEqualTo(nombre);
    }

    @Test
    public void testEliminarUsuarioPorId() {
        Long idBuscado = 1L;
        boolean isEliminado = usuarioRepository.findById(idBuscado).isPresent();
        usuarioRepository.deleteById(idBuscado);
        boolean isNotEliminado = usuarioRepository.findById(idBuscado).isPresent();
        assertTrue(isEliminado);
        assertFalse(isNotEliminado);
    }
}
