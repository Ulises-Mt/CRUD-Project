/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudproject;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ulera
 */
public class clsArticulo {
    // atributos que necesito que tenga mi objeto
    private String codigo;
    private String descripcion;
    private Double precio;

    // constructor
    public clsArticulo(String codigo, String descripcion, Double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;

    }
        
    public clsArticulo(){
        
    }
    
    // imprimir en consola los datos del articulo
    public String aTexto() {
        // Solo retornamos la cadena, no imprimimos aquí
        return this.codigo + "|" + this.descripcion + "|" + this.precio;
    }
<<<<<<< HEAD
    public String getDescripcion(){
        return this.descripcion; 
    }
=======
>>>>>>> 696f1116325fbf4c836b0738ba4d4bb526f1bf1f

    // guardar informacion
    public void guardar() {
        mArticulo article = new mArticulo();
        String textoArticulo = this.aTexto(); // Obtenemos el texto una sola vez

        // Enviamos la cadena para guardar en el archivo
        article.Insertar(textoArticulo);

        // Si quieres verlo en consola una sola vez:
        System.out.println(textoArticulo);
    }
    public DefaultListModel<String> llenarLista(){
        mArticulo MArticle = new mArticulo();
        
        ArrayList<String> datos = MArticle.Consultar();
        
        DefaultListModel<String> modelLista = new DefaultListModel<>();
        
        for (String registro: datos){
            modelLista.addElement(registro);
        }
        
        return modelLista;
    }
    
    public void actualizar(String newCOdigo, String newDescripcion, String newPrecio){
        String nuevaLinea  = newCOdigo + "|" + newDescripcion + "|" + newPrecio;
        
        String lineaOriginal = this.codigo + "|" + this.descripcion + "|" + this.precio;
        
        //Imprimir los nuevos valores
        System.out.println("Nuevos valores" + nuevaLinea);
        System.out.println("Valores Originales:" + lineaOriginal);
        
        //Solicita la actualizacion del registro
<<<<<<< HEAD
        mArticulo mArticle = new mArticulo();         
        mArticle.update(lineaOriginal, nuevaLinea, "listado_articulos.txt");
    }
    
    public void eliminar(){
        //registro a eliminar
        String lineaOriginal = this.codigo + "|" + this.descripcion + "|" + this.precio;
        
        //Imprimir los valores
        System.out.println("Valores Originales:" + lineaOriginal);
        
        //Solicita la eliminacion
        mArticulo mArticle = new mArticulo();  
        mArticle.delete(lineaOriginal, "listado_articulos.txt");
    }
=======
        mArticulo mArticle = new mArticulo();
        
        mArticle.update(lineaOriginal, nuevaLinea, "listado_articulos.txt");
    }
>>>>>>> 696f1116325fbf4c836b0738ba4d4bb526f1bf1f
}
