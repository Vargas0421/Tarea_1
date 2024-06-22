# Práctica Programada 1

### Autor:
**Brandon Josué Vargas Moreira**  
**ID:** 402640854

### Curso:
**Cliente Servidor**

### Descripción del Proyecto:
Este proyecto es una implementación de un sistema básico de gestión de usuarios y libros utilizando Java. El sistema permite crear, mostrar y gestionar usuarios y libros, así como realizar operaciones básicas relacionadas con la biblioteca. Además, incluye una interfaz gráfica de usuario (GUI) para facilitar la interacción con el sistema.

# Problema

Desarrollar un sistema de gestión de biblioteca que permita administrar libros, autores, préstamos y usuarios. El sistema debe cumplir con los siguientes requisitos:

## Funcionalidades

### Libros:
- **Almacenar Información:** Título, autor, fecha de publicación, género y disponibilidad.
- **Tipos de Libros:** Revistas, Mangas, Libros de literatura, Libros de ciencia, Comics, entre otros.
- **Mostrar Listado:** Todos los libros disponibles y prestados.

### Autores:
- **Almacenar Información:** Nombre, apellido, nacionalidad y fecha de nacimiento.
- **Mostrar Listado:** Todos los autores.

### Usuarios:
- **Almacenar Información:** Nombre, apellido, dirección, teléfono y número de identificación.
- **Registro de Nuevos Usuarios:** Permitir el registro de nuevos usuarios.
- **Consulta de Información:** Permitir la consulta de información de usuario.

### Préstamos:
- **Registrar Préstamos:** Registrar préstamos de libros a usuarios.
- **Fechas de Préstamo:** Registrar la fecha de préstamo y la fecha de devolución estimada (puede ser implementado mediante strings).

## Requisitos Técnicos:
- **Programación Orientada a Objetos:** Implementar conceptos básicos en Java, incluyendo clases, objetos, métodos, atributos, constructores, encapsulamiento, herencia, polimorfismo e interfaces.
- **Colecciones de Java:** Utilizar colecciones para almacenar y gestionar información sobre libros, autores, usuarios y préstamos.
- **Manejo de Excepciones:** Implementar el manejo de excepciones para gestionar errores durante la ejecución del programa.
- **Interfaz de Usuario:** Diseñar una interfaz que permita al usuario interactuar con el sistema de manera intuitiva.


### Funcionalidades:
1. **Crear Usuario:** Permite crear un nuevo usuario ingresando información como ID, nombre, apellido, número de teléfono y dirección.
2. **Mostrar Usuarios:** Muestra una lista de todos los usuarios registrados.
3. **Mostrar Libros:** Muestra una lista de todos los libros disponibles en la biblioteca.
4. **Crear Libro Manualmente:** Permite crear un libro de manera manual ingresando la información necesaria.
5. **Mostrar Autores:** Muestra una lista de todos los autores registrados en el sistema.

### Enlace del Diagrama de Clase:
Puedes visualizar el diagrama de clase del proyecto en el siguiente enlace:  
[Diagrama de Clase en Lucidchart](https://lucid.app/lucidchart/afb49bd8-0d71-4a52-901d-debc39f12b8c/edit?invitationId=inv_ad7d6234-1318-4d99-a5af-c4c1156caeb2)

### Prueba de ejecucion:
[Pruebas de ejecucion](https://ufidelitas-my.sharepoint.com/:w:/g/personal/bvargas40854_ufide_ac_cr/EQYlmkQQaYJItecjNpT_oWMBxw9Xtb1xdkvyXr-Y3SRrcw?e=BaYjuF)

### Estructura del Proyecto:
El proyecto está organizado en las siguientes clases:

1. **Usuario:** Clase que representa a un usuario del sistema, heredando de la clase `Persona`. Incluye atributos como ID, número de teléfono, dirección y una lista de libros.
2. **Autor:** Clase que almacena la información de un autor, como nombre, nacionalidad, fecha de nacimiento y apellido.
3. **Libro:** Clase que representa un libro en la biblioteca. Incluye atributos como título, autor, fecha de publicación, estado del libro y género.
4. **Biblioteca:** Clase que gestiona la colección de libros. Incluye métodos para crear libros, mostrar libros y mostrar autores.
5. **Practica_programada_1:** Clase principal que contiene el método `main` y controla el flujo del programa mediante un menú interactivo.

### Ejecución del Proyecto:
Para ejecutar el proyecto, sigue los siguientes pasos:
1. Clona o descarga el repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java preferido (por ejemplo, IntelliJ IDEA, Eclipse).
3. Ejecuta la clase `Practica_programada_1` para iniciar el programa.
4. Utiliza el menú interactivo para acceder a las diferentes funcionalidades del sistema.

### Requisitos del Sistema:
- **Java JDK:** Versión 8 o superior.
- **Entorno de Desarrollo Integrado (IDE):** Se recomienda IntelliJ IDEA o Eclipse para una mejor experiencia de desarrollo.

### Interfaz Gráfica de Usuario (GUI):
La interfaz gráfica está implementada utilizando las librerías Swing de Java. Algunas características de la GUI incluyen:
- **JOptionPane**: Utilizado para mostrar cuadros de diálogo para la entrada y salida de datos.
- **JComboBox**: Utilizado para desplegar listas desplegables de elementos, como usuarios y géneros de libros, permitiendo una selección fácil y rápida.
  

Clona o descarga el repositorio en tu máquina local.
Abre el proyecto en tu entorno de desarrollo Java preferido (por ejemplo, IntelliJ IDEA, Eclipse).
Ejecuta la clase Practica_programada_1 para iniciar el programa.
Utiliza el menú interactivo para acceder a las diferentes funcionalidades del sistema.


### Requisitos del Sistema:
Java JDK: Versión 8 o superior.
Entorno de Desarrollo Integrado (IDE): NeatBens
Contacto: vargasmoreirabranbdon@gamail.com   #83690296
