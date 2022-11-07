package proj;

public class singleton {
		
		 
		private static singleton ins; 
		private int shaconfig; 
		
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
		/*
		 * this function is to set an int number to shaconfig
		 * @param con1 value to set new value
		 */
		public void setShconfig(int con1) {
			assert(shaconfig % 1 == 0)
			shaconfig=con1;
			} 	
		/*
		 * this function is to get an int number of shaconfig
		 * @return shaconfig value 
		 */
		
		public int getShconfig() {
		return shaconfig;	
		} 	
}
