/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ulera
 */
public class clsCSV {
    
    String archivo = "inventario.csv"; 
    
    public void importarDatos(){
        double totalGeneral = 0;
        
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            
            br.readLine();
            
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                
                //asigacion de valores
                clsArticulo cArticulo= new clsArticulo(
                    datos[0], datos[1], Double.parseDouble(datos[2]));
                //Almacena en artchivos txt
                cArticulo.guardar();
            }
            br.close();
            System.out.println("=================================");
            System.out.println("Se a terminado la importacion");
            
        } catch(IOException e){
            System.out.println("Mensaje de error " + e.getMessage());
        }
    }
    
}
