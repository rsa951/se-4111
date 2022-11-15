public class SettingsModel {
	private static SettingsModel uniqueInstance;

	// other useful instance variables here

		private SettingsModel() {
		}
		
	
		private int shaconfig;
		private int ASHconfig;
		private int REconfig;
		
		public static SettingsModel getInstance() {
			if (uniqueInstance == null) {
				uniqueInstance = new SettingsModel();
			}
			
		
		
			return uniqueInstance;
		}
	
	//shahad
		
		public void setShconfig(int con) {
			assert con>0;
			shaconfig=con;
			} 
		
		public int getShconfig() {
		return shaconfig;	
		}
	
//Ashwaq

		public void setASHconfig(int con) {
			assert con>0;
			ASHconfig=con;
			} 
		
		public int getASHconfig() {
		return ASHconfig;	
		}

		//Rema

				public void setREconfig(int con) {
					assert con>0;
					REconfig=con;
					} 
				
				public int getREconfig() {
				return REconfig;	
				}
		
	}