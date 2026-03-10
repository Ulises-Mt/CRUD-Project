package crudproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ulera
 */
public class mClientes {

    public void Insertar(String cadenaCliente) {
        try {
            FileWriter archivo = new FileWriter("listado_clientes.txt", true);
            BufferedWriter buffer = new BufferedWriter(archivo);

            buffer.write(cadenaCliente);
            buffer.newLine();
            buffer.close();

        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public ArrayList<String> Consultar() {
        ArrayList<String> listaRegistros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("listado_clientes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");

                // Formato: No. Cliente, Nombre, Tipo Cliente, Razon Social
                String datoBonito = "No. Cliente: " + datos[0] + ", Nombre: " + datos[1] + ", Tipo: " + datos[2]
                        + ", Razon Social: " + datos[3];

                listaRegistros.add(datoBonito);
            }
        } catch (IOException e) {
            System.err.println("Mensaje de error: " + e.getMessage());
        }

        return listaRegistros;
    }
}
