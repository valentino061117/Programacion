package model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


// crear el metodo que permite agrefar un encargo
// los encargos deber teber id unico -> poner avisos
// crear el metodo que permite eliminar un encargo
// para ello se pide el id del encargo y se quita de la lista -> poner aviso

/*
Listar todos los encargos de una tarea
*/

//Buscar un encargo por id y mostrar sus datos

//Completar un encargo -> pasar variable completada a true

//Mostrar un encargo que estan completados

//Completar una tarea -> ina tarea quedara completa si todos sus encargos
//estan completados

//Crear los metodos de: asignar a un encargado un responsable
//Para poder asignar un responsable al encargo, previamente debe esar como intregante de equipo

//cambiar responsable de tarea

//Mostrar tareas por responsable -> DNI


public abstract class Tarea {

    //una tarea tiene asociadas una serie de personas
    // cuando se crea la tarea es necesario pedir cuentas personas (NO QUE PERSONAS)
    // encargaran de la tarea

    // cada tarea puede asignar una persona
    // solo se podra asignar una persona si hay hueco disponible
    // cada vez que se asigne una persona, se debera colocar en el primer hueco
    //disponible
    // si no hay hueco, saltar un aviso
    // en una tarea de pueden quitar responsables. Solo podre quitar una tarea si el DNI
    // que me indicas esta dentro de la lista de responsables. Mostrar aviso tanto para
    // proceso Ok como proceso no OK


    //variables
    private String titulo, descripcion;
    private boolean prioritario, completada;
    private Persona[] encargasdos;
    private ArrayList<Encargo> listaTareas;


    //contructores

    public Tarea(){

    }

    public Tarea(String titulo,String descripcion,int numeroPersonas){
        // completada = false
        this.titulo = titulo;
        this.descripcion = descripcion;
        encargasdos = new Persona[numeroPersonas];
        listaTareas = new ArrayList<>();
    }

    public Tarea(String titulo,String descripcion,boolean prioritario, int numeroPersonas){
        // completada = false
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritario = prioritario;
        encargasdos = new Persona[numeroPersonas];
        listaTareas = new ArrayList<>();
    }

    // enviarRecordatorio -> totalmente diferente en TPro Tper
    public abstract void enviarRecordatorio();

    //metodos -> getter / setter

    public void agregarPersona(Persona persona){
        for (int i = 0; i < encargasdos.length; i++) {
            if (encargasdos[i] == null && !estaDni(persona.getDni())){
                encargasdos[i]=persona;
                System.out.println("Persona agregada correctamente");
                return;
            }
        }
        System.out.println("No hay hueco disponible, tarea completa");
    }

    public boolean estaDni(String dni){
        for (Persona persona : encargasdos){
            if (persona != null && persona.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }
        return false;
    }

    public void quitarResponsable(String dni){
        for (Persona persona:encargasdos){
            if (persona != null && persona.getDni().equalsIgnoreCase(dni)){
                persona = null;
                System.out.println("Persona eliminada correctamente");
                return;
            }
        }
        System.out.printf("la persona con DNI &s no esta en esta tarea%n",dni);
    }

    // mostrar los datos de todos los usuarios que son responsables de dicha tarea
    // en caso de no tener ninguna avisar
    // en caso de tener huecos disponibles, avisar

    public void mostrarResponsables(){
        int numeroHuecos = 0;
        for (Persona persona1 : encargasdos){
            if (persona1 == null){
                numeroHuecos++;
            }else {
                System.out.println(persona1);
            }
        }
        if (numeroHuecos > 0) {
        System.out.printf("Hay %d disponibles%n",numeroHuecos);
        } else if (numeroHuecos == encargasdos.length) {
            System.out.println("No hay responsables asignados");
        } else {
            System.out.println("Todos los responsables estan ubicados");
        }
    }

    private Encargo estaEncargo(int id){
        for (Encargo encargo : listaTareas){
            if (encargo.getId() == id){
                return encargo;
            }
        }

        return null;
    }

    public void agregarEncargo(Encargo encargo){
        if (estaEncargo(encargo.getId())!= null) {
            System.out.println("Error en el proceso, no se puede agregar");
        }else {
            listaTareas.add(encargo);
            System.out.println("Agregado correctamente");
        }
    }

    public void borrarEncargo(int id){
        if (estaEncargo(id) != null){
            listaTareas.remove(estaEncargo(id));
            System.out.println("Borrado correctamente");
        }else {
            System.out.println("No esta en la lista el id especificado");
        }
    }

    public void listarEncargos(){
        for (Encargo encargo : listaTareas){
            encargo.mostrarDatos();
        }
    }

    public void buscarEncargoPorId(int id){
        if (estaEncargo(id)!=null){
            estaEncargo(id).mostrarDatos();
        }else {
            System.out.println("El id no se encuentra en la lista");
        }
    }

    public void listarEncargosCompletados(){
        for (Encargo encargo : listaTareas){
            if (encargo.isCompleta()){
                encargo.mostrarDatos();
            }else {
                System.out.println("No hay encargos completados");
            }
        }
    }

    public void completarEncargo(int id){
        if (estaEncargo(id)!=null && !estaEncargo(id).isCompleta()){
            estaEncargo(id).setCompleta(true);
            System.out.println("Encargo completado correctamente");
        }else {
            System.out.println("El encargo no se puede completar o ya esta completado");
        }
    }

    public void completarTarea(){
        for (Encargo encargo : listaTareas){
            if (!encargo.isCompleta()){
                System.out.println("No se puede completar la tarea");
                return;
            }
        }
        completada = true;
        System.out.println("Tarea completada con exito");
    }


    public boolean borrarEncargo1(int id){
        return listaTareas.remove(estaEncargo(id));
    }

    public Persona[] getEncargasdos() {
        return encargasdos;
    }

    public ArrayList<Encargo> getListaTareas() {
        return listaTareas;
    }

    public void setEncargasdos(Persona[] encargasdos) {
        this.encargasdos = encargasdos;
    }

    public void setListaTareas(ArrayList<Encargo> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isPrioritario() {
        return prioritario;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioritario=" + prioritario +
                ", completada=" + completada +
                '}';
    }
}

// creamos una clase encargos
// tiene una prioridad llamada descripcion
// una propiedad llamada id y una propieada llamada completa