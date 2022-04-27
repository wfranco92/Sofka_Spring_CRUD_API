package com.williamfranco.springdemocrudapi.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuario_rol",
            joinColumns = {@JoinColumn(name = "fk_usuario", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="fk_rol", nullable = false)}
    )
    private List<RolModel> roles;

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<RolModel> getRoles() {
        return roles;
    }

    public void setRoles(List<RolModel> roles) {
        this.roles = roles;
    }

    public UsuarioModel(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    public UsuarioModel() {

    }

}