package com.soria.academia2.serviceImpl;


import com.soria.academia2.entity.TipoUsuario;
import com.soria.academia2.repository.TipoUsuarioRepository;
import com.soria.academia2.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipousuRepo;


    @Override
    public List<TipoUsuario> listarTipoUsuario() {
        return tipousuRepo.findAll();
    }

    @Override
    public Optional<TipoUsuario> listarTipoUsuarioPorId(Integer id) {
        return tipousuRepo.findById(id);
    }

    @Override
    public void guardar(TipoUsuario tipoUsuario) {
        tipousuRepo.save(tipoUsuario);

    }

    @Override
    public void actualizar(TipoUsuario tipoUsuario) {
        TipoUsuario object = tipousuRepo.findById(tipoUsuario.getId_tipousuario()).get();
        if (object != null) {
            object.setNombre(tipoUsuario.getNombre());
            tipousuRepo.save(object);

        }

    }

    @Override
    public void eliminar(Integer id) {
        tipousuRepo.deleteById(id);
    }
}
