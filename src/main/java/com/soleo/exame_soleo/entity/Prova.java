package com.soleo.exame_soleo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "provas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataCriacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario professor;

    @ManyToMany
    @JoinTable(name = "prova_questoes", joinColumns = @JoinColumn(name = "prova_id"), inverseJoinColumns = @JoinColumn(name = "questao_id"))
    private List<Questao> questoes;

}
