package com.soria.academia2.service;

import com.soria.academia2.entity.Curso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CursoService {

    public List<Curso> listarCurso();

    public Optional<Curso> listarCursoPorId(Integer id);

    public void guardar(Curso curso);

    public void actualizar(Curso curso);

    public void eliminar(Integer id);

}
