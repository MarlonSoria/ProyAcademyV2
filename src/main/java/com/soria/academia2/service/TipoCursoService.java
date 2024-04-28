package com.soria.academia2.service;

import com.soria.academia2.entity.TipoCurso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoCursoService {

    public List<TipoCurso> listarTipoCurso();

    public Optional<TipoCurso> listarTipoCursoPorId(Integer id);

    public void guardar(TipoCurso tipoCurso);

    public void actualizar(TipoCurso tipoCurso);

    public void eliminar(Integer id);

}
