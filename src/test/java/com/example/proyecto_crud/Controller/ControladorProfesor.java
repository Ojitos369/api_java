ackage com.example.proyecto_crud.Controller;

import com.example.proyecto_crud.Entity.Alumno;
import com.example.proyecto_crud.Entity.Profesor;
import com.example.proyecto_crud.Service.ProfesorServiceIMPL.ASIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class ControladorProfesor {

    @Autowired
    private ASIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarProfesor",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProfesor(){
        List<Profesor> listaProfesor = this.impl.ConsultarProfesor();
        return ResponseEntity.ok(listaProfesor);
    }
    @PostMapping
    @RequestMapping(value = "CrearProfesor",method = RequestMethod.POST)
    public ResponseEntity<?> CrearProfesor(@RequestBody Profesor profesor){
        Profesor ProfesorCreado = this.impl.CrearProfesor(profesor);
        return ResponseEntity.status(HttpStatus.CREATED).body(AlumnoCreado);
    }
    @PutMapping
    @RequestMapping(value = "ModificarProfesor",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarProfesor(@RequestBody Profesor profesor){
        Profesor ProfesorModificado = this.impl.modificarProfesor(profesor);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProfesorModificado);
    }
    @GetMapping
    @RequestMapping(value = "BuscarProfesor/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarProfesor(@PathVariable  int id){
        Profesor profesor = this.impl.BuscarProfesor(id);
        return ResponseEntity.ok(profesor);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarProfesor/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProfesor(@PathVariable int id){
        this.impl.EliminarProfesor(id);
        return ResponseEntity.ok().build();
    }
}
