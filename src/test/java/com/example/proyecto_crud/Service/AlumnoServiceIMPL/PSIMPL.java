package com.example.proyecto_crud.Service.ProfesorServiceIMPL;

import com.example.proyecto_crud.Entity.Profesor;
import com.example.proyecto_crud.Repository.ProfesorRepo;
import com.example.proyecto_crud.Service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements ProfesorService {

    @Autowired
    private ProfesorRepo repo;

    @Override
    public List<Profesor> ConsultarProfesor() {
        return (List<Profesor>) this.repo.findAll();
    }

    @Override
    public Profesor CrearProfesor(Profesor profesor) {
        profesor.setEmail(profesor.getEmail());
        return this.repo.save(profesor);
    }

    @Override
    public Profesor modificarProfesor(Profesor profesor) {
        return this.repo.save(profesor);
    }

    @Override
    public Profesor BuscarProfesor(int id) {
        return (Profesor) this.repo.findById(id).get();
    }

    @Override
    public void EliminarProfesor(int id) {
        this.repo.deleteById(id);
    }
}
