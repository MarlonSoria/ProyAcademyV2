package com.soria.academia2.serviceImpl;

import com.soria.academia2.entity.Curso;
import com.soria.academia2.entity.Transaccion;
import com.soria.academia2.repository.CursoRepository;
import com.soria.academia2.repository.TransaccionRepository;
import com.soria.academia2.service.TransaccionService;

import java.util.List;
import java.util.Optional;

public class TransaccionServiceImpl implements TransaccionService {

    private TransaccionRepository tranRepo;

    @Override
    public List<Transaccion> listarTransaccion() {
        return tranRepo.findAll();
    }

    @Override
    public Optional<Transaccion> listarTransaccionPorId(Integer id) {
        return tranRepo.findById(id);
    }

    @Override
    public void guardar(Transaccion transaccion) {
        tranRepo.save(transaccion);

    }

    @Override
    public void actualizar(Transaccion transaccion) {
        Transaccion object = tranRepo.findById(transaccion.getId_transaccion()).get();
        if (object != null) {
            object.setMatricula(transaccion.getMatricula());
            object.setFechatran(transaccion.getFechatran());
            object.setMonto(transaccion.getMonto());
            object.setMetodopa(transaccion.getMetodopa());
            tranRepo.save(object);
        }

    }

    @Override
    public void eliminar(Integer id) {
        tranRepo.deleteById(id);

    }
}
