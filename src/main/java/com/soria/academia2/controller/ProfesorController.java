package com.soria.academia2.controller;


import com.soria.academia2.entity.Profesor;
import com.soria.academia2.service.ProfesorService;
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
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService proser;

    @GetMapping("/profesores")
    public List<Profesor> listaProfesores(){
        return proser.listarProfesor();
    }

    @GetMapping("/profesores/{id}")
    public Optional<Profesor> listarMatriculaPorId(@PathVariable Integer id){
        return proser.listarProfesorPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarProfesor(@RequestBody Profesor profesor) {
        proser.guardar(profesor);
    }

    @PutMapping("/actualizar")
    public void actualizarProfesor(@RequestBody Profesor profesor) {
        proser.actualizar(profesor);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProfesor(@PathVariable Integer id) {
        proser.eliminar(id);
    }



}
