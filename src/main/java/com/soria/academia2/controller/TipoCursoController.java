package com.soria.academia2.controller;



import com.soria.academia2.entity.TipoCurso;
import com.soria.academia2.service.TipoCursoService;
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
@RequestMapping("/tipocur")
public class TipoCursoController {

    @Autowired
    TipoCursoService tipocuser;

    @GetMapping("/tipocursos")
    public List<TipoCurso> listaTipoCursos(){
        return tipocuser.listarTipoCurso();
    }

    @GetMapping("/tipocursos/{id}")
    public Optional<TipoCurso> listaTipoCursoPorId(@PathVariable Integer id){
        return tipocuser.listarTipoCursoPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarTipoCurso(@RequestBody TipoCurso tipoCurso) {
        tipocuser.guardar(tipoCurso);
    }

    @PutMapping("/actualizar")
    public void actualizarTipoCurso(@RequestBody TipoCurso tipoCurso) {
        tipocuser.actualizar(tipoCurso);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTipoCurso(@PathVariable Integer id) {
        tipocuser.eliminar(id);
    }


}
