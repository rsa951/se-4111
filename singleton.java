package proj;

public class singleton {
		
		 
		private static singleton ins; 
		
		private singleton() {
		}

		public static singleton getInstance() {
		 if (ins== null) { 
			 ins = new singleton(); 
		} 
		return ins;
	
}
}
