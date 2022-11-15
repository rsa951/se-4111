
public class SettingsController { 
	
	private SettingsModel model;
	private SettingsView view; 
 
	 public SettingsController(SettingsModel m, SettingsView v) {
	  model = m;
	  view = v;
	  initViewSh();
	  initViewASH();
	  initViewRE();

	 } 
	 
	 //  shahad
	 
	 public void initViewSh() {
		  view.getSettingShTextfield().setText(Integer.toString(model.getShconfig()));
		  
		 }
	 
	 public void initControllerSh() {
		  view.getSettingShSaveButton().addActionListener(e -> saveSettingOneSh());
		  
		  view.getSettingShPrintButton().addActionListener(e -> printToConsoleSh());
		  
		 } 
	 private void saveSettingOneSh() {
		  model.setShconfig(Integer.parseInt(view.getSettingShTextfield().getText()));
		  } 
	 private void printToConsoleSh() {
		  System.out.println(model.getShconfig());
		 }
	 
	 //Ashwaq
	 
	 public void initViewASH() {
		  view.getSettingASHTextfield().setText(Integer.toString(model.getASHconfig()));
		  
		 }
	 
	 public void initControllerASH() {
		  view.getSettingASHSaveButton().addActionListener(e -> saveSettingOneASH());
		  
		  view.getSettingASHPrintButton().addActionListener(e -> printToConsoleASH());
		  
		 } 
	 private void saveSettingOneASH() {
		  model.setASHconfig(Integer.parseInt(view.getSettingASHTextfield().getText()));
		  } 
	 private void printToConsoleASH() {
		  System.out.println(model.getASHconfig());
		 }
	 //Rema

	 public void initViewRE() {
		  view.getSettingRETextfield().setText(Integer.toString(model.getREconfig()));
		  
		 }
	 
	 public void initControllerRE() {
		  view.getSettingRESaveButton().addActionListener(e -> saveSettingOneRE());
		  
		  view.getSettingREPrintButton().addActionListener(e -> printToConsoleRE());
		  
		 } 
	 private void saveSettingOneRE() {
		  model.setREconfig(Integer.parseInt(view.getSettingRETextfield().getText()));
		  } 
	 private void printToConsoleRE() {
		  System.out.println(model.getREconfig());
		 }
	 
	 
	 
	
}
	 
