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