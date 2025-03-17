package com.soleo.exame_soleo.repository;

import com.soleo.exame_soleo.entity.Prova;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvaRepository extends JpaRepository<Prova, Long> {

List<Prova> findByProfessorId(Long professorId);
}
