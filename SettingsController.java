
public class SettingsController { 
	
	private SettingsModel model;
	private SettingsView view; 
 
	 public SettingsController(SettingsModel m, SettingsView v) {
	  model = m;
	  view = v;
	  initView();
	  initViewSh();
	  initViewASH();
	 } 
	 
	 public void initView() {
	  view.getSettingOneTextfield().setText(Integer.toString(model.getConfig1()));
	  
	 } 
	
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
	  
	 } 
	 
	 private void saveSettingOne() {
	  model.setConfig1(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  } 
	 
	 
	 private void printToConsole() {
	  System.out.println(model.getConfig1());
	 }
	 
	 
	 
	 //shahad
	 
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
	 
	 
	 
	
}
	 
	
}