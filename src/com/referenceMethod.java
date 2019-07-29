package com;

import java.util.function.Function;

public class referenceMethod {

    public static void exampleMethod(){
        Empleado empleado  = new Empleado("gcorte","mondra",1250);        
        printAll(empleado, Empleado::getApellido);
    }

    /**
     * @param  T is class,
     * @param referenceMethod is the method,reference for the class
     */
    public static <T> void  printAll(T clas,Function<T,String> referenceMethod){
        System.out.println("Imprimiendo " + referenceMethod.apply(clas));
    }
}