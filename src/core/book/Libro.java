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

    public Libro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, double valor, Editorial editorial) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public String getFormato() {
        return formato;
    }

    public double getValor() {
        return valor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
}
