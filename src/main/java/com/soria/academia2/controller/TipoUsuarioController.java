package com.soria.academia2.controller;



import com.soria.academia2.entity.TipoUsuario;
import com.soria.academia2.service.TipoUsuarioService;
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

@Controller
@RestController
@RequestMapping("/tipousu")
public class TipoUsuarioController {

    @Autowired
    TipoUsuarioService tipouser;

    @GetMapping("/tipousuarios")
    public List<TipoUsuario> listaTipoUsuario(){
        return tipouser.listarTipoUsuario();
    }

    @GetMapping("/tipousuarios/{id}")
    public Optional<TipoUsuario> listaTipoUsuarioPorId(@PathVariable Integer id){
        return tipouser.listarTipoUsuarioPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        tipouser.guardar(tipoUsuario);
    }

    @PutMapping("/actualizar")
    public void actualizarTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        tipouser.actualizar(tipoUsuario);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTipoUsuario(@PathVariable Integer id) {
        tipouser.eliminar(id);
    }


}
