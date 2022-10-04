import hsa.Console;

public class digitos1
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	  int num;
	  int cent;
	  int dec;

	do
	{
	    c.print ("ingrese numero de 1 al 999(ingrese 0 para salir):");
	      num = c.readInt();
	    if (num>=100){
		 
		  c.println (" "+num);
		  dec=(int)(num/10);
		  c.println (" "+dec);
		  cent=(int)(num/100);
		  c.println (" "+cent);
		  c.println ("tiene tres digitos");
		      }
	      else 
		    if (num>=10){
		    c.println (" "+num);
		     dec=(int)(num/10);
		  c.println (" "+dec);
		  c.println ("tiene dos digitos");
		   
		      }
		   else 
		    if (num<10){
		  c.println ("tiene un digito");
		    c.println (" "+num);
		      }
		  
		  
		  
		  
	}
	while (num!=0);


    }
}
