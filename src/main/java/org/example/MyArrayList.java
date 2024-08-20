package org.example;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements = new Object[10];
    private int size = 0;


    public static void main(String[] args) {


        class Empleado {
            private String nombre;
            private int edad;
            private double salario;

            public Empleado(String nombre, int edad, double salario) {
                this.nombre = nombre;
                this.edad = edad;
                this.salario = salario;
            }

            public String dameDatos() {
                return "El empleado se llama " + nombre + ". Tiene " + edad + " años. Y un salario de " + salario;
            }
        }
    }
}