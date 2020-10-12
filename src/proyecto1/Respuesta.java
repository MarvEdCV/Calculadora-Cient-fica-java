
package proyecto1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Respuesta {
    
    public void Respuesta() {
      }    
    //public Respuesta() {
    //}
    public void escribirArchivoFavoritos(String res,String op){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = new Date();
            String CadenaDatos = "";
            CadenaDatos = res+","+op+","+formato.format(fecha);
            //guardar datos en el archivo
            FileWriter fichero;
            PrintWriter pw;
            try{
                fichero = new FileWriter("Datos.txt",true);
                pw = new PrintWriter(fichero);
                pw.println(CadenaDatos);
                pw.close();
                fichero.close();
                JOptionPane.showMessageDialog(null, "Agregado a Favoritos");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocurrio un error en la creacion de favorito");
            }
        }
    public void escribirArchivoHistorial(String res,String op){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = new Date();
            String CadenaDatos = "";
            CadenaDatos = res+","+op+","+formato.format(fecha);
            //guardar datos en el archivo
            FileWriter fichero;
            PrintWriter pw;
            try{
                fichero = new FileWriter("Datos1.txt",true);
                pw = new PrintWriter(fichero);
                pw.println(CadenaDatos);
                pw.close();
                fichero.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocurrio un error en la agregracion al historial");
            }
        }
}
