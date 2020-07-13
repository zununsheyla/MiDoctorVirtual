import java.io.*;
import java.util.*;

class MiArchivo{
 
 public static ArrayList<String> leerTodo(String nombreArchivo){
            String strLine = new String();
   ArrayList<String> arraylist = new ArrayList<String>();
   
            try(FileInputStream fis = new FileInputStream(nombreArchivo);
                    DataInputStream in = new DataInputStream(fis);
                    BufferedReader br = new BufferedReader( new InputStreamReader(in));)
   {
     strLine = br.readLine();
                    while (strLine != null)
                    {
                            
       arraylist.add(strLine);
                            strLine = br.readLine();   
                    }
            }
            catch (Exception e ) 
            {
                    e.printStackTrace();
                    System.exit(1);
            }
   return arraylist;
   
 }
    public static void guardarTodo(String edad,String sexo, String embarazo, String obeso, String fumo, String lesion, String colesterol, String hipertencion){
            try{
                    FileOutputStream fos = new FileOutputStream ("datos_paciente_1.txt");
                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
                    out.write("\n               Edad: "+ edad +" a\u00f1os");out.write("                     Genero: "+sexo);out.write("\n               Embarazo: "+embarazo);
                    out.write("                     Obeso: "+obeso);out.write("\n               Fuma: "+fumo);out.write("                               Lesionado: "+lesion);
                    out.write("\n               Colestertol: "+colesterol);out.write("                      Hipertenci\u00f3n: "+hipertencion);
                    out.close(); 
                }
        catch (Exception e) //Agregar Excepciones
        { 
                    e.printStackTrace();
                    System.exit(1);
        }   
    }

    public static void guardarTodo(String informacion,String nombre){
            try{
                    FileOutputStream fos = new FileOutputStream (nombre);
                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
                    out.write(informacion);
                    out.close(); 
                }
        catch (Exception e) //Agregar Excepciones
        { 
                    e.printStackTrace();
                    System.exit(1);
        }   
    }
     
}

