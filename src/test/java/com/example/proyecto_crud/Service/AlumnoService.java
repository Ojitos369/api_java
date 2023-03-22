package com.example.proyecto_crud.Service;

import com.example.proyecto_crud.Entity.Alumno;

import java.util.List;

public interface AlumnoService {

    public List<Alumno> ConsultarAlumno();

    public Alumno CrearAlumno(Alumno alumno);
    public Alumno modificarAlumno(Alumno alumno);
    public Alumno BuscarAlumno(int id);
    public void EliminarAlumno(int id);
}
