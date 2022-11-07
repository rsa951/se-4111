package proj;

public class singleton {
		
		 
		private static singleton ins; 
		
		private singleton() {
			System.out.print("shahad abdullah");
			System.out.print("Ashwaq Rajeh");
			System.out.print("Reema Aldawood");
			
		}

		public static singleton getInstance() {
		 if (ins== null) { 
			 ins = new singleton(); 
		} 
		return ins;
	
}
		
		
		
}
