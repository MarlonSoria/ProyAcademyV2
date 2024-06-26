package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.Curso;
import com.soria.academia2.repository.CursoRepository;
import com.soria.academia2.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository curRepo;


    @Override
    public List<Curso> listarCurso() {
        return curRepo.findAll();
    }

    @Override
    public Optional<Curso> listarCursoPorId(Integer id) {
        return curRepo.findById(id);
    }

    @Override
    public void guardar(Curso curso) {
        curRepo.save(curso);


    }

    @Override
    public void actualizar(Curso curso) {
        Curso object = curRepo.findById(curso.getId_curso()).get();
        if (object != null) {
        object.setDescripcion(curso.getDescripcion());
        object.setVacantes(curso.getVacantes());
        object.setPrecio(curso.getPrecio());
        object.setTipoCurso(curso.getTipoCurso());
        curRepo.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
        curRepo.deleteById(id);
    }
}
