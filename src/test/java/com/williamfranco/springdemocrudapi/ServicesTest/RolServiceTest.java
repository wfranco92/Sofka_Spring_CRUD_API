package com.williamfranco.springdemocrudapi.ServicesTest;

import com.williamfranco.springdemocrudapi.models.RolModel;
import com.williamfranco.springdemocrudapi.models.UsuarioModel;
import com.williamfranco.springdemocrudapi.repositories.RolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class RolServiceTest {
    @Autowired
    RolRepository rolRepository;

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

    @Test
    public void testActualizarRolPorId(){
        Long idBuscado=1L;
        String rol = "comercio";
        RolModel rolModel = new RolModel(rol);
        rolModel.setId_rol(idBuscado);

        rolRepository.save(rolModel);

        Optional<RolModel> rolModelActualizado = rolRepository.findById(idBuscado);
        assertThat(rolModelActualizado.get().getRol()).isEqualTo(rol);
    }

}
