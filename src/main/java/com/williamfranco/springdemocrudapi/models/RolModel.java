package com.williamfranco.springdemocrudapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rol")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_rol;

    private String rol;
    private Long id_usuario;

    public RolModel(Long id_rol, String rol, Long id_usuario) {
        this.id_rol = id_rol;
        this.rol = rol;
        this.id_usuario = id_usuario;
    }
/*
    @ManyToMany(mappedBy = "rol")
    private List<UsuarioModel> usuarios;*/

    public RolModel(){

    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
