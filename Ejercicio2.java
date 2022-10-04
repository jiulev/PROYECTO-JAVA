// The "Ejercicio2
import java.awt.*;
import hsa.Console;

public class Ejercicio2

{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
     ;
	int i;
       int valor;

	c = new Console ();
	
	
	c.print ("ingrese un numero y visualizara los pares desde el valor ingresado hasta el cero");
       valor = c.readInt ();
       i=valor;
       while (i >= 0){
	
	if (valor%2==0 ){
	   valor=valor-2;
	    c.println("  " +i);
	}
	else if(valor%2!=0)  {
	    valor=valor-1;
	    i=valor;
	    c.println("    " +i);
	}
	
	i = i -2;

       }
}
} 
 
