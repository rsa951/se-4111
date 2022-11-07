package proj;

public class singleton {
		
		 
		private static singleton ins; 
		private int shaconfig; 
		private int Ashconfig;
		
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
		 * @param con1 value to pass a value into the set function
		 */
		public void setShconfig(int con1) {
			assert(con1 % 1 == 0)
			shaconfig=con1;
			} 
		
		/*
		 * this function is to get and return the shaconfig value
		 * @return shaconfig value 
		 */
		public int getShconfig() {
		return shaconfig;	
		}
		

		/*
		 * this function is to set an int number to Ashconfig 
		 * @param con2 value to pass a value into the set function
		 */
		public void setAshconfig(int con2) {
			assert(con2 % 1 == 0)
			Ashconfig=con2;
			} 
		
		/*
		 * this function is to get and return the Ashconfig value
		 * @return Ashconfig value 
		 */
		public int getAshconfig() {
		return Ashconfig;	
		} 	
		/*
		 * this function is to set an int number to Reconfig 
		 * @param con3 value to pass a value into the set function
		 */
		public void setReconfig(int con3) {
			assert(con3 % 1 == 0)
			Reconfig=con3;
			} 
		
		/*
		 * this function is to get and return the Reconfig value
		 * @return Reconfig value 
		 */
		public int getReconfig() {
		return Reconfig;	
		} 
}
