package com.soria.academia2.controller;

import com.soria.academia2.entity.Curso;
import com.soria.academia2.service.CursoService;
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
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService curser;

    @GetMapping("/cursos")
    public List<Curso> listaCursos(){
        return curser.listarCurso();
    }

    @GetMapping("/cursos/{id}")
    public Optional<Curso> listaCursoPorId(@PathVariable Integer id){
        return curser.listarCursoPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarCurso(@RequestBody Curso curso) {
        curser.guardar(curso);
    }

    @PutMapping("/actualizar")
    public void actualizarCurso(@RequestBody Curso curso) {
        curser.actualizar(curso);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarCurso(@PathVariable Integer id) {
        curser.eliminar(id);
    }


}
