package com.example.proyecto_crud.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Humano")

public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curp")
    private int curp;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    public int getCurp() {
        return curp;
    }

    public void setCurp(int curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Column(name = "numeroDeCuenta")
    private int numeroDeCuenta;

    @Column(name = "email")
    private String email;

    @Column(name = "materia")
    private String materia;
}