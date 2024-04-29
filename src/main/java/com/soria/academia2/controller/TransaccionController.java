package com.soria.academia2.controller;




import com.soria.academia2.entity.Transaccion;
import com.soria.academia2.service.TransaccionService;
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
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    TransaccionService transer;

    @GetMapping("/transacciones")
    public List<Transaccion> listaTransacciones(){
        return transer.listarTransaccion();
    }

    @GetMapping("/transacciones/{id}")
    public Optional<Transaccion> listaTransaccionPorId(@PathVariable Integer id){
        return transer.listarTransaccionPorId(id);
    }

    @PostMapping("/guardar")
    public void guardarTransaccion(@RequestBody Transaccion transaccion) {
        transer.guardar(transaccion);
    }

    @PutMapping("/actualizar")
    public void actualizarTransaccion(@RequestBody Transaccion transaccion) {
        transer.actualizar(transaccion);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarTransaccion(@PathVariable Integer id) {
        transer.eliminar(id);
    }

}
