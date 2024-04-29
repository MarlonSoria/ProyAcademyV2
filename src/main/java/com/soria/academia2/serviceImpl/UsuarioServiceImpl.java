package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.Transaccion;
import com.soria.academia2.entity.Usuario;
import com.soria.academia2.repository.UsuarioRepository;
import com.soria.academia2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuRepo;

    @Override
    public List<Usuario> listarUsuario() {
        return usuRepo.findAll();
    }

    @Override
    public Optional<Usuario> listarUsuarioPorId(Integer id) {
        return usuRepo.findById(id);
    }

    @Override
    public void guardar(Usuario usuario) {
        usuRepo.save(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        Usuario object = usuRepo.findById(usuario.getId_usuario()).get();
        if (object != null) {
            object.setNombre(usuario.getNombre());
            object.setEmail(usuario.getEmail());
            object.setContrasena(usuario.getContrasena());
            object.setDni(usuario.getDni());
            object.setTelefono(usuario.getTelefono());
            object.setFechana(usuario.getFechana());
            object.setTipoUsuario(usuario.getTipoUsuario());
            usuRepo.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
        usuRepo.deleteById(id);

    }
}
