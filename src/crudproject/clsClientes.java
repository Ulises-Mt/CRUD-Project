package crudproject;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ulera
 */
public class clsClientes {
    private int noCliente;
    private String nombre;
    private String tipoCliente;
    private String razonSocial;

    public clsClientes(int noCliente, String nombre, String tipoCliente, String razonSocial) {
        this.noCliente = noCliente;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.razonSocial = razonSocial;
    }

    public clsClientes() {
    }

    public String aTexto() {
        return this.noCliente + "|" + this.nombre + "|" + this.tipoCliente + "|" + this.razonSocial;
    }

    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void guardar() {
        mClientes model = new mClientes();
        String textoCliente = this.aTexto();
        model.Insertar(textoCliente);
        System.out.println("Cliente guardado: " + textoCliente);
    }

    public DefaultListModel<String> llenarLista() {
        mClientes model = new mClientes();
        ArrayList<String> datos = model.Consultar();
        DefaultListModel<String> modelLista = new DefaultListModel<>();

        for (String registro : datos) {
            modelLista.addElement(registro);
        }

        return modelLista;
    }
}
