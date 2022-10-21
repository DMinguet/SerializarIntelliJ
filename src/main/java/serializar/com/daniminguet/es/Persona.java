package serializar.com.daniminguet.es;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class Persona implements Serializable{
    private SimpleStringProperty nombre;
    private SimpleIntegerProperty edad;

    public Persona(String  nombre, int edad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.edad = new SimpleIntegerProperty(edad);
    }

    public Persona() {
        this.nombre=null;
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public int getEdad() {
        return edad.get();
    }

    public SimpleIntegerProperty edadProperty() {
        return edad;
    }
}