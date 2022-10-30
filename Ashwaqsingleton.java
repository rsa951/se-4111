package proj;

public class Ashwaqsingleton {
	
		 
		private static Ashwaqsingleton ins; 
		
		private Ashwaqsingleton() {
			System.out.println("Ashwaq Rajeh");
		}

		public static Ashwaqsingleton getInstance() {
		 if (ins== null) { 
			 ins = new Ashwaqsingleton(); 
		} 
		return ins;
	
}
}

