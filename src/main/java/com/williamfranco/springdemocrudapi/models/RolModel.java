package com.williamfranco.springdemocrudapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_rol;
    private String rol;
    @ManyToMany(mappedBy = "roles")
    private List<UsuarioModel> users;

    public RolModel(String rol) {
        this.rol = rol;
    }
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

    public List<UsuarioModel> getUsers() {
        return users;
    }

    public void setUsers(List<UsuarioModel> users) {
        this.users = users;
    }
}
