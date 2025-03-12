package com.soleo.exame_soleo.entity;

import com.soleo.exame_soleo.enums.Dificuldade;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Questao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String enunciado;

    @Column(nullable = false)
    private String respostaCerta;

    @Enumerated(EnumType.STRING)
    private Dificuldade dificuldade;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

}
