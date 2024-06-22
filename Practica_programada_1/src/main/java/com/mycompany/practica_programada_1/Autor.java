/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_programada_1;

import javax.swing.JOptionPane;

public class Autor extends Persona implements ToString {// hereda de Persona e implementa funciones de ToString 

    protected String nacionalidad;
    protected String fehcaDeNacimineto;

    public Autor() {
    }

    public Autor(String nacionalidad, String fehcaDeNacimineto, String name, String lastName) {
        super(name, lastName);
        this.nacionalidad = nacionalidad;
        this.fehcaDeNacimineto = fehcaDeNacimineto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFehcaDeNacimineto() {
        return fehcaDeNacimineto;
    }

    public void setFehcaDeNacimineto(String fehcaDeNacimineto) {
        this.fehcaDeNacimineto = fehcaDeNacimineto;
    }

    public Autor createAutor() {// funcion mediante la cual se crea un autor 
        Autor newAutor = new Autor();// se crea un nuevo autor 
        newAutor.setFehcaDeNacimineto(JOptionPane.showInputDialog("ingrese la feha de nacimiento del autor en el sigueinte formato dd/mm/year"));// se setea la fecha de nacimiento 
        newAutor.setName(JOptionPane.showInputDialog("Ingrese el nombre del autor"));// se setea el nombre 
        newAutor.setLastName(JOptionPane.showInputDialog("Ingrese el apellido del autor"));//se setea el apellido 
        newAutor.setNacionalidad(JOptionPane.showInputDialog("Ingrese la nacionalidad del autor "));// se setea la nacionalidad
        return newAutor;
    }

    @Override
    public String toString() {
        return "El Autor con el nombre: " + name + ", apellidos: " + lastName + ", con la nacionalidad: " + nacionalidad + ", y nacio en: =" + fehcaDeNacimineto + "\n";
    }

}
