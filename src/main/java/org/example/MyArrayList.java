package org.example;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements = new Object[10];
    private int size = 0;


    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void set(int index, T element) {
        checkIndex(index);
        elements[index] = element;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }



    public static void main(String[] args) {

        MyArrayList<Empleado> listaEmpleados = new MyArrayList<>();

        listaEmpleados.add(new Empleado("Juan", 30, 25000));
        listaEmpleados.add(new Empleado("Ana", 28, 28000));
        listaEmpleados.add(new Empleado("Luis", 35, 32000));
        listaEmpleados.add(new Empleado("Yana", 28, 31000));

        listaEmpleados.set(1, new Empleado("Olga", 32, 22000));

        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i).dameDatos());
        }
    }
}



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
