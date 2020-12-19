import java.io.*;
import java.lang.Character.*;

public class Leer{
    
    private String inputCad;
    private boolean error;
    
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
    //Se usa el IOException porque BufferedReader readLine() lanza o throws IOException
    
    //Lectura de datos tipo cadena segun su funcion
    public String DatosCad(){
        do{
            try{
                error = false;
                System.out.print("Contraseña: ");
                inputCad = br.readLine();
            }
            catch(IOException e ){
                System.out.println(e);
                error = true;
            }
        }while (error);
        return inputCad;
    }
}