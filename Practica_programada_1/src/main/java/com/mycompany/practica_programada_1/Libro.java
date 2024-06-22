package com.mycompany.practica_programada_1;

import javax.security.auth.AuthPermission;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class Libro implements ToString {

    protected Autor autor;
    protected String titulo;
    protected String fechaDePublicacion;
    protected disposicion estadoDelibro;
    protected genero tiposDeGenero;
    protected String fecha_del_prestamo;
    protected String fecha_aprox_de_devolucion;
    protected Ususario owner;

    public enum disposicion {
        libre,
        prestado
    }

    public enum genero {
        Revistas,
        Mangas,
        Libros_de_literatura,
        Libros_de_ciencia,
        Comics
    }

    public Libro(Autor autor, String titulo, String fechaDePublicacion, disposicion estadoDelibro, genero tiposDeGenero) {
        this.autor = autor;
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
        this.estadoDelibro = estadoDelibro;
        this.tiposDeGenero = tiposDeGenero;
    }

    public Libro createLibro() { // funcion mediante la cual se crea un libro 
        Libro newLibro = new Libro();// se crea un libro 
        Autor newAutor = new Autor();// se crea un autor 

        newLibro.setAutor(newAutor.createAutor()); // mediante una funcion se llenan los datos del autor 
        newLibro.setTitulo(JOptionPane.showInputDialog("Ingrese el nombre del titulo")); // se pregunta el titulo del liro
        newLibro.setTiposDeGenero(seleccionarGenero());// se muestran las opciones de genero 
        newLibro.setFechaDePublicacion(JOptionPane.showInputDialog("Ingrese la fecha de publicacion"));// se pide que ingrese la fecha de publicacion del libro 
        newLibro.setEstadoDelibro(disposicion.libre);// se setea el estado del libro como libre 
        return newLibro;
    }

    public String getFecha_del_prestamo() {
        return fecha_del_prestamo;
    }

    public void setFecha_del_prestamo(String fecha_del_prestamo) {
        this.fecha_del_prestamo = fecha_del_prestamo;
    }

    public String getFecha_aprox_de_devolucion() {
        return fecha_aprox_de_devolucion;
    }

    public void setFecha_aprox_de_devolucion(String fecha_aprox_de_devolucion) {
        this.fecha_aprox_de_devolucion = fecha_aprox_de_devolucion;
    }

    public Ususario getOwner() {
        return owner;
    }

    public void setOwner(Ususario owner) {
        this.owner = owner;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public disposicion getEstadoDelibro() {
        return estadoDelibro;
    }

    public void setEstadoDelibro(disposicion estadoDelibro) {
        this.estadoDelibro = estadoDelibro;
    }

    public genero getTiposDeGenero() {
        return tiposDeGenero;
    }

    public void setTiposDeGenero(genero tiposDeGenero) {
        this.tiposDeGenero = tiposDeGenero;
    }

    @Override// to String para mostar de manera ordenada el contenido del libro 
    public String toString() {
        return "El Libro contiene la siguente informacion: " + "autor: " + autor + ", titulo: " + titulo + ", fechaDePublicacion: " + fechaDePublicacion + ", estadoDelibro: " + estadoDelibro + ", tiposDeGenero: " + tiposDeGenero + "\n";
    }

    public Libro.genero seleccionarGenero() {// fucino por la cual se puede sellecionar de los generos mencionados en el enum
        JComboBox<Libro.genero> generoDropdown = new JComboBox<>(Libro.genero.values()); // se crea un combobox
        JOptionPane.showMessageDialog(null, generoDropdown, "Seleccione un género", JOptionPane.QUESTION_MESSAGE);// se muestran las opciones
        return (Libro.genero) generoDropdown.getSelectedItem();// se devuelve la opcion seleccionada 
    }

}
