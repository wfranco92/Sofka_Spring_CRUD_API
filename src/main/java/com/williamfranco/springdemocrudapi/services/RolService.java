package com.williamfranco.springdemocrudapi.services;

import com.williamfranco.springdemocrudapi.models.RolModel;
import com.williamfranco.springdemocrudapi.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> obtenerRoles(){
        return (ArrayList<RolModel>) rolRepository.findAll();
    }
    public RolModel guardarRol(RolModel rol){
        return rolRepository.save(rol);
    }
    public Optional<RolModel> obtenerPorId(Long id_rol){
        return rolRepository.findById(id_rol);
    }

    public boolean eliminarRol(Long id_rol) {
        try{
            rolRepository.deleteById(id_rol);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
