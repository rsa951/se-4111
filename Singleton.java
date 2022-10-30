package proj;

public class Singleton {
 
		private static Singleton ins; 
		
		private Singleton(
				) {}

		public static Singleton getInstance() {
		 if (ins== null) { 
			 ins = new Singleton(); 
		} 
		return ins;
	
}
}