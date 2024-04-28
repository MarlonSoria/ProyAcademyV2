package com.soria.academia2.repository;

import com.soria.academia2.entity.TipoCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCursoRepository extends JpaRepository<TipoCurso,Integer> {
}
