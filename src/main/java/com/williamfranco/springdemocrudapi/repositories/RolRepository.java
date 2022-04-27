package com.williamfranco.springdemocrudapi.repositories;

import com.williamfranco.springdemocrudapi.models.RolModel;
import com.williamfranco.springdemocrudapi.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface RolRepository extends CrudRepository<RolModel, Long> {

}
