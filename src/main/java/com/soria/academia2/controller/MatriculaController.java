package com.soria.academia2.controller;



import com.soria.academia2.entity.Matricula;
import com.soria.academia2.service.MatriculaService;
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
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    MatriculaService maser;

    @GetMapping("/matriculas")
    public List<Matricula> listaMatriculas(){
        return maser.listarMatricula();
    }

    @GetMapping("/matriculas/{id}")
    public Optional<Matricula> listaMatriculaPorId(@PathVariable Integer id){
        return maser.listarMatriculaPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarCurso(@RequestBody Matricula matricula) {
        maser.guardar(matricula);
    }

    @PutMapping("/actualizar")
    public void actualizarMatricula(@RequestBody Matricula matricula) {
        maser.actualizar(matricula);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarMatricula(@PathVariable Integer id) {
        maser.eliminar(id);
    }



}
