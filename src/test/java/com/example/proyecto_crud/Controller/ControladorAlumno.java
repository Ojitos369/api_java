package com.example.proyecto_crud.Controller;

import com.example.proyecto_crud.Entity.Alumno;
import com.example.proyecto_crud.Service.AlumnoServiceIMPL.ASIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class ControladorAlumno {

    @Autowired
    private ASIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarAlumno",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarAlumno(){
        List<Alumno> listaAlumno = this.impl.ConsultarAlumno();
        return ResponseEntity.ok(listaAlumno);
    }
    @PostMapping
    @RequestMapping(value = "CrearAlumno",method = RequestMethod.POST)
    public ResponseEntity<?> CrearAlumno(@RequestBody Alumno alumno){
        Alumno AlumnoCreado = this.impl.CrearAlumno(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlumnoCreado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarAlumno",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarAlumno(@RequestBody Alumno alumno){
        Alumno AlumnoModificado = this.impl.modificarAlumno(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlumnoModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarAlumno/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarAlumno(@PathVariable  int id){
        Alumno alumno = this.impl.BuscarAlumno(id);
        return ResponseEntity.ok(alumno);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarAlumno/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarAlumno(@PathVariable int id){
        this.impl.EliminarAlumno(id);
        return ResponseEntity.ok().build();
    }
}
