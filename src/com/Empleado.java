package com;

public class Empleado{

    String nombre;
    String apellido;
    Integer salario;

    public Empleado(String nombre,String apellido, Integer salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    /**
     * @return the salario
     */
    public Integer getSalario() {
        return salario;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }



}