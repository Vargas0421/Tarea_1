package com.mycompany.practica_programada_1;

import java.util.LinkedList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Ususario extends Persona implements ToString { // la calse ususario hereda de la la clase persona y utiliza una interfaz para usar metodos que son necesaios

    LinkedList<Ususario> listaDeUsusarios = new LinkedList<>(); // se crea la lista de ususarios

    public void inicializarLista() { // se crea la lista de ususarios para que cunado corramos el codig oeste tenga informacion cargada
        listaDeUsusarios.add(new Ususario(12, 88215908, "Heredia", "Carlos", "Vargas"));
        listaDeUsusarios.add(new Ususario(02, 7898799, "Heredia", "marco", "Vargas"));
        listaDeUsusarios.add(new Ususario(04, 9889878, "Heredia", "calraass", "Vargas"));
        listaDeUsusarios.add(new Ususario(34, 980989, "Heredia", "Charlie", "Vargas"));
    }

    protected int id;
    protected int phoneNumber;
    protected String address;
    protected LinkedList<Libro> libros = new LinkedList<>();

    public Ususario(int id, int phoneNumber, String address, String name, String lastName) {
        super(name, lastName);
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Ususario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public Ususario createUsuario() { // Metodo por el cual se crea un ususario de forma manual
        Ususario newUser = new Ususario(); // se cre un ususario
        boolean idUnico = false; // creamos una variable tipo booleana para la verificacion del id 
        while (!idUnico) {// se realiza mientras sea diferente de false osea mientras sea "true"
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));// se pide el id
            idUnico = true; //cambiamos el valor de la variable boleana a true 
            for (Ususario usuario : listaDeUsusarios) {// se recorre la lista con un foreach
                if (id == usuario.getId()) { // si el id ya existe
                    idUnico = false;// se le cambia el valor a la variable boleana para que se reitere la operacion 
                    JOptionPane.showMessageDialog(null, "El ID ya existe. Ingrese un ID diferente.");// se muestra el mensaje de error 
                    break;// se termina la ejeucion y se vuelve a preguntar el id 
                }
            }
            if (idUnico) {// se no ser el mismo la varibale siempre fue true 
                newUser.setId(id);// se setea el nuevo ususario
            }
        }
        newUser.setName(JOptionPane.showInputDialog("Ingrese su nombre")); // se pide el nombre y se setea con un set
        newUser.setLastName(JOptionPane.showInputDialog("Ingrese su apellido")); // se pide el apellido y se setea con un set 
        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono")); //se pide el numero de telefono 
        newUser.setPhoneNumber(number);// se modifica la informacino de lo que se recibio y se setea por medio de un set 
        newUser.setAddress(JOptionPane.showInputDialog("Ingrese su direccion"));
        return newUser;// se devuelve 
    }

    public Ususario seleccionarUsuario() {// mediante esta funcion permite seleccionar un usuario mediante el uso de swing
        JComboBox<Ususario> usuariosDropdown = new JComboBox<>(); // se crea un jcomboboc
        for (Ususario usuario : listaDeUsusarios) {// se recorre la lista de usuario con un for each 
            usuariosDropdown.addItem(usuario);// se anade acda usuario al combobox
        }
        int opcion = JOptionPane.showConfirmDialog(null, usuariosDropdown, "Seleccione un usuario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        // si la opcion es valida se devuelve el usuario como parametro 
        if (opcion == JOptionPane.OK_OPTION) {
            return (Ususario) usuariosDropdown.getSelectedItem();
        }
        return null;
    }

    public LinkedList<Libro> verListaLibros(Ususario u) { // esta variable basicamente es un get pero de un usuario especifico, ya que recibe uno como parametro 
        return u.getLibros();
    }

    @Override
    public String toString() { // el soStringpara mostar datos 
        return "Ususario con el id:" + id + ", nombre: " + name + ", apellidos: " + lastName + ", numero de telefono: " + phoneNumber + " y la direccion: " + address + "\n";
    }

}
