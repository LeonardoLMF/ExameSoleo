package com.soleo.exame_soleo.repository;

import com.soleo.exame_soleo.entity.Questao;
import com.soleo.exame_soleo.enums.Dificuldade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {
    List<Questao> findByMateriaId(Long materiaId);

    List<Questao> findByMateriaIdAndDificuldade(Long materiaID, Dificuldade dificuldade);
}
