package com.soria.academia2.controller;



import com.soria.academia2.entity.Usuario;
import com.soria.academia2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuaser;


    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios(){
        return usuaser.listarUsuario();
    }

    @GetMapping("/usuarios/{id}")
    public Optional<Usuario> listaUsuarioPorId(@PathVariable Integer id){
        return usuaser.listarUsuarioPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarUsuario(@RequestBody Usuario usuario) {
        usuaser.guardar(usuario);
    }

    @PutMapping("/actualizar")
    public void actualizarUsuario(@RequestBody Usuario usuario) {
        usuaser.actualizar(usuario);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Integer id) {
        usuaser.eliminar(id);
    }




}
