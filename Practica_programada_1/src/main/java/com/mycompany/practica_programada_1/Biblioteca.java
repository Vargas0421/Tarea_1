package com.mycompany.practica_programada_1;

import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Biblioteca extends Libro implements ToString {// hereda de Libro e implementa ToString 

    protected LinkedList<Libro> libreria; // se crea la lista de libros
    protected LinkedList<Libro> librosPrestados = new LinkedList<>();// se crea la lista de libros prestados 
    

    public Biblioteca() { // se crea el constructor de la biblioteca
        libreria = new LinkedList<>();
    }
   
    public void crearLibros() { // se crea ya una lista de libros para que cuando cargue el programa ya tenga informacino 
        libreria.add(new Libro(new Autor("Nicaraguense", "10/02/2001", "Carlos", "Virila"), "LaFlor", "21/2/1990", Libro.disposicion.libre, Libro.genero.Libros_de_ciencia));
        libreria.add(new Libro(new Autor("Costarricense", "15/05/1985", "Ana", "Gonzalez"), "El Bosque Encantado", "11/06/2005", Libro.disposicion.libre, Libro.genero.Comics));
        libreria.add(new Libro(new Autor("Mexicano", "08/03/1975", "Luis", "Martinez"), "Historia de México", "15/09/2010", Libro.disposicion.libre, Libro.genero.Mangas));
        libreria.add(new Libro(new Autor("Argentino", "22/07/1992", "María", "Pérez"), "Literatura Argentina", "05/11/2015", Libro.disposicion.libre, Libro.genero.Libros_de_literatura));
        libreria.add(new Libro(new Autor("Colombiano", "30/01/1968", "Juan", "García"), "Ciencia y Tecnología", "18/12/2000", Libro.disposicion.libre, Libro.genero.Libros_de_ciencia));
        libreria.add(new Libro(new Autor("Peruano", "25/12/1980", "Sofia", "Ramirez"), "Fantasía Andina", "01/04/1999", Libro.disposicion.libre, Libro.genero.Revistas));
        libreria.add(new Libro(new Autor("Chileno", "09/09/1999", "Pedro", "López"), "Historia de Chile", "10/10/2012", Libro.disposicion.libre, Libro.genero.Libros_de_ciencia));
        libreria.add(new Libro(new Autor("Ecuatoriano", "14/04/1977", "Gabriela", "Mendoza"), "Leyendas de Ecuador", "20/03/2007", Libro.disposicion.libre, Libro.genero.Libros_de_literatura));

    }

    public StringBuilder getLibrosPrestados() { // funcion mediante la cual se obtiene la la lisat de libros prestados con la informacin requerida 
        StringBuilder librosPrestados = new StringBuilder(); // se crea un Stringbuilder
        for (Libro libro : this.librosPrestados) {// se recorre la lista de libros prestados 
            librosPrestados.append("El libro " + libro.getTitulo() + " esta bajo el ususario " + libro.getOwner().getName() + " lo adquirio en " + libro.getFecha_del_prestamo() + " y se espera que lo devuelva en " + libro.fecha_aprox_de_devolucion);
        }
        return librosPrestados;
    }
    
    

    public Libro seleccionarLibro() {// metodo por el cual se puede seleecionar un libro 
        JComboBox<Libro> librosDropdown = new JComboBox<>(); // se crea un combobox 
        for (Libro libro : libreria) { // se recorre la libreria (lista de libros)
            librosDropdown.addItem(libro);// se muestra todas las opciones
        }
        int opcion = JOptionPane.showConfirmDialog(null, librosDropdown, "Seleccione un usuario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.OK_OPTION) {
            return (Libro) librosDropdown.getSelectedItem(); // se devuelve dicho libro para ser utilizado en otras funciones 
        }
        return null;
    }

    public Libro seleccionarLibroUsuario(Ususario u) { // misma funcion que la de arriba pero toma la lisa de cada usuario la cual se encuntra en los atributos del mismo 
        JComboBox<Libro> librosDropdown = new JComboBox<>();// se crea un combobox  
        for (Libro libro : u.getLibros()) {// se recorre la libreria (lista de libros de cada usuario)
            librosDropdown.addItem(libro);// se muestra todas las opciones
        }
        int opcion = JOptionPane.showConfirmDialog(null, librosDropdown, "Seleccione un usuario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == JOptionPane.OK_OPTION) {
            return (Libro) librosDropdown.getSelectedItem();// se devuelve dicho libro para ser utilizado en otras funciones 
        }
        return null;
    }

    public String crearLibroManual() { // funcion por la cual se puede crear un libro manual 
        Libro libroCreado = new Libro();// se crea un nuevo libro 
        libroCreado = libroCreado.createLibro();// se llama la funcino de la clase libro 
        libreria.add(libroCreado);// se crea el libro se agrega a la libreria 
        return "El libro " + libroCreado.getTitulo() + " se ha creado correctamente";// se muetra un mensaje de confirmacion
    }

    public String asignarLibro(Ususario u, Libro l, String a) { // funcino por la cual se asigna un libro a una persona
        u.getLibros().add(l);// se toma la lista de libros del ususario
        l.setOwner(u);
        l.setFecha_del_prestamo(a);
        l.setFecha_aprox_de_devolucion(JOptionPane.showInputDialog("Ingrese lka fecha aproximada de devolucion en el formato dd/mm/year"));
        l.setEstadoDelibro(Libro.disposicion.prestado);// se cambia la disposicion del libro 
        librosPrestados.add(l);// se agrega el libro prestadoa a la lista de libros prestados 
        return null;
    }

    public String devolverLibro(Ususario u, Libro l) { // funcino por la cual se devuelve un libro 
        u.getLibros().remove(l);// se elimina el libro de la lista de libros del ususario
        l.setOwner(null);
        l.setFecha_del_prestamo(null);
        l.setFecha_aprox_de_devolucion(null);
        librosPrestados.remove(l);// se remueve el libro de la ista de libros prestados 
        l.setEstadoDelibro(Libro.disposicion.libre);// se le cambai la disposicion al libre a libre otra vez 
        return null;
    }

    public String mostrarAutores() {// funcion por la cual se muestra la lista de autores basada en la lista de libros 
        StringBuilder autores = new StringBuilder(); // se crea un Stringbuilder
        for (Libro libro : libreria) {// se recorre la lista de libros 
            autores.append(libro.getAutor().toString()).append("\n");// se agreaga cada autor de la lista de libros 
        }
        return autores.toString();// se muestran los autores 
    }

    public LinkedList mostrarLibros() { // funcino pro la cual se muestran los libros 
        LinkedList<Libro> libros = new LinkedList<>(); // se crea una lista de libros 
        for (Libro libro : libreria) {// se recorre la lista de libros original 
            if (libro.getEstadoDelibro() == estadoDelibro.libre) { // si el estado del libro es libre
                libros.add(libro);// se agrega a la lista 
            }
        }
        return libros;// se devuelve la lista de libros 
    }
}
