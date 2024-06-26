package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.Matricula;
import com.soria.academia2.repository.MatriculaRepository;
import com.soria.academia2.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository matRepo;

    @Override
    public List<Matricula> listarMatricula() {
        return matRepo.findAll();
    }

    @Override
    public Optional<Matricula> listarMatriculaPorId(Integer id) {
        return matRepo.findById(id);
    }

    @Override
    public void guardar(Matricula matricula) {
        matRepo.save(matricula);

    }

    @Override
    public void actualizar(Matricula matricula) {
        Matricula object = matRepo.findById(matricula.getId_matricula()).get();
        if (object != null) {
            object.setUsuario(matricula.getUsuario());
            object.setCurso(matricula.getCurso());
            object.setFechma(matricula.getFechma());
            object.setEstado(matricula.getEstado());
            object.setCostcurso(matricula.getCostcurso());
            matRepo.save(object);

            
        }
    }

    @Override
    public void eliminar(Integer id) {
        matRepo.deleteById(id);

    }
}
