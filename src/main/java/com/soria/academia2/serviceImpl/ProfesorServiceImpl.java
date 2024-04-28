package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.Matricula;
import com.soria.academia2.entity.Profesor;
import com.soria.academia2.repository.MatriculaRepository;
import com.soria.academia2.repository.ProfesorRepository;
import com.soria.academia2.service.ProfesorService;

import java.util.List;
import java.util.Optional;

public class ProfesorServiceImpl implements ProfesorService {

    private ProfesorRepository proRepo;


    @Override
    public List<Profesor> listarProfesor() {
        return proRepo.findAll();
    }

    @Override
    public Optional<Profesor> listarProfesorPorId(Integer id) {
        return proRepo.findById(id);
    }

    @Override
    public void guardar(Profesor profesor) {
        proRepo.save(profesor);

    }

    @Override
    public void actualizar(Profesor profesor) {
        Profesor object = proRepo.findById(profesor.getId_profesor()).get();
        if (object != null) {
            object.setNombre(profesor.getNombre());
            object.setDni(profesor.getDni());
            object.setEmail(profesor.getEmail());
            object.setDni(profesor.getDni());
            object.setTelefono(profesor.getTelefono());
            object.setFechana(profesor.getFechana());
            object.setCurso(profesor.getCurso());
            proRepo.save(object);

        }

    }

    @Override
    public void eliminar(Integer id) {
        proRepo.deleteById(id);
    }
}
