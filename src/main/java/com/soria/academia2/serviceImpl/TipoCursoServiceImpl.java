package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.TipoCurso;
import com.soria.academia2.repository.CursoRepository;
import com.soria.academia2.repository.TipoCursoRepository;
import com.soria.academia2.service.TipoCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoCursoServiceImpl implements TipoCursoService {

    @Autowired
    private TipoCursoRepository tipocurRepo;

    @Override
    public List<TipoCurso> listarTipoCurso() {
        return tipocurRepo.findAll();
    }

    @Override
    public Optional<TipoCurso> listarTipoCursoPorId(Integer id) {
        return tipocurRepo.findById(id);
    }

    @Override
    public void guardar(TipoCurso tipoCurso) {
        tipocurRepo.save(tipoCurso);

    }

    @Override
    public void actualizar(TipoCurso tipoCurso) {
        TipoCurso object = tipocurRepo.findById(tipoCurso.getId_tipocurso()).get();
        if (object != null) {
            object.setNombre(tipoCurso.getNombre());
            tipocurRepo.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
        tipocurRepo.deleteById(id);

    }
}
