package com.example.proyecto_crud.Service.AlumnoServiceIMPL;

import com.example.proyecto_crud.Entity.Alumno;
import com.example.proyecto_crud.Repository.AlumnoRepo;
import com.example.proyecto_crud.Service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ASIMPL implements AlumnoService {

    @Autowired
    private AlumnoRepo repo;

    @Override
    public List<Alumno> ConsultarAlumno() {
        List<Alumno> all = (List<Alumno>) this.repo.findAll();
        return all;
    }

    @Override
    public Alumno CrearAlumno(Alumno alumno) {
        alumno.setEmail(alumno.getEmail());
        return this.repo.save(alumno);
    }

    @Override
    public Alumno modificarAlumno(Alumno alumno) {
        return this.repo.save(alumno);
    }

    @Override
    public Alumno BuscarAlumno(int id) {
        return (Alumno) this.repo.findById(id).get();
    }

    @Override
    public void EliminarAlumno(int id) {
        this.repo.deleteById(id);
    }
}
