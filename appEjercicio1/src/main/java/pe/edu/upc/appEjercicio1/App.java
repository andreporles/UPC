package pe.edu.upc.appEjercicio1;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	Scanner s=new Scanner(System.in);
        System.out.println( "Hello World!" );
        String[] arrnombres=new String[3];
        
        for (int i = 0; i < arrnombres.length; i++) {
        	  System.out.println( "Nombre"+(i+1) );
        	  arrnombres[i]=s.nextLine();
        	
		}
    }
}
