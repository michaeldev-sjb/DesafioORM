package com.michaedevsjb.DominioORM.entiities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    private Integer id;

    private String name;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    public Participante() {
    }

    public Participante(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

}
