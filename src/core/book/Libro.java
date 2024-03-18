/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.book;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public abstract class Libro {
    
    protected String titulo;
    protected ArrayList<Autor> autores;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected double valor;
    protected Editorial editorial;
    
}
