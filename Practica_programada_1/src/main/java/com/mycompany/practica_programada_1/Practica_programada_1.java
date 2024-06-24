package com.mycompany.practica_programada_1;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Practica_programada_1 {

    public static void main(String[] args) {
        Ususario createUser = new Ususario();
        Biblioteca biblioteca = new Biblioteca();
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de hoy en el formato dd/mm/year");

        //LinkedList<Ususario> listaDeUsusarios = new LinkedList<>();
        biblioteca.crearLibros();
        createUser.inicializarLista();

        boolean continuar = true;
        while (continuar) {
            try {
                String a = JOptionPane.showInputDialog("Opciones de ingreso \n"
                        + "1: Crear un nuevo usuario\n"
                        + "2: Mostrar usuarios \n"
                        + "3: Mostrar libros \n"
                        + "4: Crear un libro de manera manual \n"
                        + "5: Mostrar los autores registrados  \n"
                        + "6: Asignar un libro a un Ususario  \n"
                        + "7: Devolver un libro de un ususario  \n"
                        + "8: Ver la lista de libros de un Usuario  \n"
                        + "9: Ver la lista de libros prestados  \n"
                        + "0: Salir del programa \n");
                int numero = Integer.parseInt(a);

                switch (numero) {
                    case 1 ->
                        createUser.listaDeUsusarios.add(createUser.createUsuario());
                    case 2 ->
                        JOptionPane.showMessageDialog(null, createUser.listaDeUsusarios);
                    case 3 ->
                        JOptionPane.showMessageDialog(null, biblioteca.mostrarLibros());
                    case 4 -> {
                        String mensaje = biblioteca.crearLibroManual();
                        JOptionPane.showMessageDialog(null, mensaje);
                    }
                    case 5 ->
                        JOptionPane.showMessageDialog(null, biblioteca.mostrarAutores());
                    case 6 ->
                        JOptionPane.showMessageDialog(null, biblioteca.asignarLibro(createUser.seleccionarUsuario(), biblioteca.seleccionarLibro(), fecha));
                    case 7 ->{
                        Ususario u = null;
                         u = createUser.seleccionarUsuario();
                        JOptionPane.showMessageDialog(null, biblioteca.devolverLibro(u, biblioteca.seleccionarLibroUsuario(u)));
                    }
                        case 8 ->
                        JOptionPane.showMessageDialog(null, createUser.verListaLibros(createUser.seleccionarUsuario()));
                    case 9 ->
                        JOptionPane.showMessageDialog(null, biblioteca.getLibrosPrestados());
                    case 0 ->
                        continuar = false;
                }
            } catch (Exception a) {
                System.out.println("Error capa 8: " + a.getMessage());
                a.printStackTrace();
            }
        }
    }
}
