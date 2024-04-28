package com.soria.academia2.service;

import com.soria.academia2.entity.TipoUsuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoUsuarioService {

    public List<TipoUsuario> listarTipoUsuario();

    public Optional<TipoUsuario> listarTipoUsuarioPorId(Integer id);

    public void guardar(TipoUsuario tipoUsuario);

    public void actualizar(TipoUsuario tipoUsuario);

    public void eliminar(Integer id);



}
