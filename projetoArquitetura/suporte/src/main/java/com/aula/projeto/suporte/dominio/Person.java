package com.aula.projeto.suporte.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Person {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cpf")
    private String cpf;
}

