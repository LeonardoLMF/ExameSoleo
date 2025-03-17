package com.soleo.exame_soleo.repository;

import com.soleo.exame_soleo.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{
}
