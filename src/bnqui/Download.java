/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnqui;

/**
 *
 * @author igfernan
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

/**
 * Ejemplo de descarga de un fichero de imagen desde la web.
 * 
 * @author chuidiang
 * 
 */
public class Download {

	/**
	 * Descarga un fichero jpeg y lo guarda en e:/foto.jpg
	 * 
     * @param Jornada
     * @param dia
     * @throws java.io.IOException
	 */
    
    
	public static void extrae(String Jornada, String dia) throws IOException {

                        String urltxt = "";
                        
                        urltxt = "http://www.loteriasyapuestas.es/f"
                                + "/loterias/documentos/Quiniela/"
                                + "Estad%C3%ADsticas%20de%20pron%C3%B3sticos"
                                + "/Temporada%202016_2017/pronos_1X2_0"
                                + Jornada +"_16-17_" + dia + ".txt";
                                
			URL url = new URL(urltxt);

			// establecemos conexion
			URLConnection urlCon = url.openConnection();

			// Se obtiene el inputStream de la foto web y se abre el fichero
			// local.
                        InputStream is = null;
                        is = urlCon.getInputStream();
//                        try {
//                            is = urlCon.getInputStream();
//                        } catch (IOException ioe) {
//                            if (urlCon instanceof HttpURLConnection) {
//                                HttpURLConnection httpConn = (HttpURLConnection) urlCon;
//                                int statusCode = httpConn.getResponseCode();
//                                if (statusCode != 200) {
//                                    is = httpConn.getErrorStream();
//                                }
//                            }
//                        }
//			 
                        
			FileOutputStream fos = new FileOutputStream("D:/Cap_Qv1.1/estadistica.txt");

			// Lectura de la foto de la web y escritura en fichero local
			byte[] array = new byte[1000]; // buffer temporal de lectura.
			int leido = is.read(array);
			while (leido > 0) {
				fos.write(array, 0, leido);
				leido = is.read(array);
			}

			// cierre de conexion y fichero.
			is.close();
			fos.close();

	}
        
   public static String[][] leer_estadisticas() {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("D:/Cap_Qv1.1/estadistica.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         int numlin;
         int numcampo;
         int equipo;
         String[][] porcentajes = new String[14][5];

         // Lectura del fichero
         String linea = null;
         numlin = 1;
         
         String sTextoBuscado = ";";
         
         while((linea=br.readLine())!=null)
            if (numlin > 2 && numlin < 17 ){
                numcampo=1;
                
                StringTokenizer st  = new StringTokenizer(linea,sTextoBuscado);
                while (st.hasMoreTokens())
                    
                switch (numcampo){
                        case 1:
                            StringTokenizer st2  = new StringTokenizer(st.nextToken(),"-");
                            equipo=3;
                            while (st2.hasMoreTokens()){
                                
                            if (equipo == 4) {
                                String equipostr = st2.nextToken();
                            porcentajes[numlin-3][equipo] = equipostr.substring(0, equipostr.indexOf(".."));
                            }else{
                            porcentajes[numlin-3][equipo] = st2.nextToken();
                                    }
                            equipo++;}
/*                            porcentajes[numlin-3][4] = st2.nextToken();*/
                            numcampo++;
                            break;
                        case 3:
                            porcentajes[numlin-3][0] = st.nextToken(); 
                            numcampo++;
                            break;
                        case 4:
                            porcentajes[numlin-3][1] = st.nextToken(); 
                            numcampo++;
                            break;
                        case 5:
                            porcentajes[numlin-3][2] = st.nextToken(); 
                            numcampo++;
                            break;
                        default: st.nextToken();
                            numcampo++;
                            break;
                }
                
             numlin++;
            }else{
            numlin++;           
            }
         return porcentajes;
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
            return null;
   }

    private static void Switch(int numcampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


