package com.example.proyecto_crud.Service;

import com.example.proyecto_crud.Entity.Profesor;

import java.util.List;

public interface ProfesorService {

    public List<Profesor> ConsultarProfesor();

    public Profesor CrearAlumno(Profesor profesor);
    public Profesor ModificarPersona(Profesor profesor);

    Profesor CrearProfesor(Profesor profesor);

    abstract Profesor BuscarProfesor(int id);
    public void EliminarProfesor(int id);
}
