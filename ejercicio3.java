// The "multiplosdeseis" class.
import java.awt.*;
import hsa.Console;

public class ejercicio3
{
    static Console c;         
    
    public static void main (String[] args)
    {
	int i,serie=23,suma=0;
	int res=0;
	c = new Console ();
    
	for (i=1;i<=15;i++){
	 res=(serie*6);
	 c.println ("  "+serie+"*6");
       
	suma=(suma+res);
	serie=(serie+4); 
       
	} 
	
	
	c.println (" La suma de los resultados de las 15 series es   "+suma);
	
	 
    } 
} 
