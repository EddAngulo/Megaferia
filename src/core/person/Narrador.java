/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.book.Audiolibro;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Narrador extends Persona {
    
    private ArrayList<Audiolibro> libros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
}
