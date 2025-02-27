package com.aula.projeto.suporte.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.nimbus.State;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Call implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOpen = LocalDate.now();

    private String priority;
    private String status;
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;







}
