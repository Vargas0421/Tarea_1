/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_programada_1;

public abstract class Persona {// se crea la clase persona de manera abstracta para que sea implementada en las clases que lo necesiten 
// se crean atributos y metodos necesarios para ambas clases autor y usuario 
    protected String name;
    protected String lastName;

    public Persona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
