package proj;

public class Shahadsingleton {

		 
private static Shahadsingleton ins; 
		
private Shahadsingleton() {
System.out.println("shahad abdullah");
	}

public static Shahadsingleton getInstance() {
if (ins== null) { 
	ins = new Shahadsingleton(); 
} 
return ins;
	
}
}	
	
	

