package com.soria.academia2.service;

import com.soria.academia2.entity.Matricula;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MatriculaService {

    public List<Matricula> listarMatricula();

    public Optional<Matricula> listarMatriculaPorId(Integer id);

    public void guardar(Matricula matricula);

    public void actualizar(Matricula matricula);

    public void eliminar(Integer id);


}
