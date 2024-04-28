package com.soria.academia2.service;

import com.soria.academia2.entity.Profesor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProfesorService {

    public List<Profesor> listarProfesor();

    public Optional<Profesor> listarProfesorPorId(Integer id);

    public void guardar(Profesor profesor);

    public void actualizar(Profesor profesor);

    public void eliminar(Integer id);

}
