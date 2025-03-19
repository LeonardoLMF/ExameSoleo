package com.soleo.exame_soleo.service;

import com.soleo.exame_soleo.entity.Materia;
import com.soleo.exame_soleo.entity.Questao;
import com.soleo.exame_soleo.enums.Dificuldade;
import com.soleo.exame_soleo.repository.QuestaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestaoService {

    private QuestaoRepository questaoRepository;

    //Lista todas as questões
    public List<Questao> listarQuestoes(){
        return questaoRepository.findAll();
    }

    //Busca por ID
    public Optional<Questao> buscarId(Long id){
        return questaoRepository.findById(id);
    }

    //Cadastrar nova questão
    public Questao salvarQuestao(Questao questao){
        return questaoRepository.save(questao);
    }

    //Buscar questões por materia
    public List<Questao> buscarPorMateria(Long materiaId){
        return questaoRepository.findByMateriaId(materiaId);
    }

    //Busca Questões por materia e dificuldade
    public List<Questao> buscarPorMateriaEDificuldade(Long materiaId, Dificuldade dificuldade){
        return questaoRepository.findByMateriaIdAndDificuldade(materiaId, dificuldade);
    }

}
