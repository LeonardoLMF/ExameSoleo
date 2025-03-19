package com.soleo.exame_soleo.service;

import com.soleo.exame_soleo.entity.Materia;
import com.soleo.exame_soleo.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    //Lista todas as materias
    public List<Materia> listarMaterias(){
      return  materiaRepository.findAll();
    }

    //Busca materia por ID
    public Optional<Materia> listarId(Long id){
        return materiaRepository.findById(id);
    }

    //Salvar nova materia
    public Materia salvarMateria(Materia materia){
        return materiaRepository.save(materia);
    }
}
