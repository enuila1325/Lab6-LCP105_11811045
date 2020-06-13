package lab6p2_andresnuila;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Universo {

    private String nombre;
    private ArrayList<Ser_Vivo> listaSeres = new ArrayList();
    private File archivo = null;

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public void adminUniverso(String path) {
        archivo = new File(path);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ser_Vivo> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<Ser_Vivo> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", listaSeres=" + listaSeres;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String aux = "";
        for (Ser_Vivo sv : listaSeres) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                aux += sv.getNombre() + ";" + sv.getPoder() + ";" + sv.getAños()
                        + ";" + sv.getPlaneta() + ";" + sv.getRaza() + "\n";
                bw.write(aux);
            } catch (Exception e) {
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            listaSeres = new ArrayList();
            if (archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            Ser_Vivo sv = new Ser_Vivo(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3], datos[4]);
                            listaSeres.add(sv);
                        } catch (Exception ex) {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Universo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Universo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
