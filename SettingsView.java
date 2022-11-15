import java.awt.BorderLayout;import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SettingsView { 
	
	 private JFrame frame;
	 
	 //Setting One needed View elements
	 private JLabel settingOneLabel;
	 
	 private JTextField settingOneTextfield;
	 
	 private JButton settingOneSaveButton;
	 
	 private JButton settingOnePrintButton;
	 
	 //shahad
    private JLabel settingShLabel;
	 
	 private JTextField settingShTextfield;
	 
	 private JButton settingShSaveButton;
	 
	 private JButton settingShPrintButton;
	 
	 
	 
	 public SettingsView() {
	 
		  frame = new JFrame("Settings");
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 120);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);  
		  
		  // Create UI elements
		  settingOneLabel = new JLabel("Setting One:");
		  settingOneTextfield = new JTextField();
		  settingOneSaveButton = new JButton("Save setting one");
		  settingOnePrintButton = new JButton("Print to Console!");
		  	  
		  // Create UI elements/shahad
		  settingShLabel = new JLabel("shahad Setting :");
		  settingShTextfield = new JTextField();
		  settingShSaveButton = new JButton("Save shahad setting ");
		  settingShPrintButton = new JButton("Print to Console!");
		  	  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneLabel).addComponent(settingShLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneTextfield).addComponent(settingShTextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneSaveButton).addComponent(settingShSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOnePrintButton).addComponent(settingShPrintButton)));
		  layout.setVerticalGroup(layout.createSequentialGroup()
				  

		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingOneLabel).addComponent(settingOneTextfield).addComponent(settingOneSaveButton).addComponent(settingOnePrintButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingShLabel).addComponent(settingShTextfield).addComponent(settingShSaveButton).addComponent(settingShPrintButton)));
		  
		  frame.getContentPane().setLayout(layout);
		  
		 } 
	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 } 
	 
	 public JLabel getSettingOneLabel() {
	  return settingOneLabel;
	 } 
	 
	 public void setSettingOneLabel(JLabel settingOneLabel) {
	  this.settingOneLabel = settingOneLabel;
	 } 
	 
	 	 
	 public JTextField getSettingOneTextfield() {
	  return settingOneTextfield;
	 } 
	 
	 public void setSettingOneTextfield(JTextField settingOneTextfield) {
	  this.settingOneTextfield = settingOneTextfield;
	 } 
	 
	 
	 
	 public JButton getSettingOneSaveButton() {
	  return settingOneSaveButton;
	 } 
	 
	 public void setSettingOneSaveButton(JButton settingOneSaveButton) {
	  this.settingOneSaveButton = settingOneSaveButton;
	 } 
	 
	 	 
	 public JButton getSettingOnePrintButton() {
	  return settingOnePrintButton;
	 } 
	 
	 public void setPrintButton(JButton print) {
	  this.settingOnePrintButton = print;
	 }
	 
 //shahad
	 public JLabel getSettingShLabel() {
		  return settingShLabel;
		 } 
	 
	 public void setSettingShLabel(JLabel settingShLabel) {
		  this.settingShLabel = settingShLabel;
		 } 
	 
	 
	 public JTextField getSettingShTextfield() {
	  return settingShTextfield;
	 } 
	 
	 public void setSettingShTextfield(JTextField settingShTextfield) {
	  this.settingShTextfield = settingShTextfield;
	 } 

	 public JButton getSettingShSaveButton() {
	  return settingOneSaveButton;
	 } 
	 
	 public void setSettingShSaveButton(JButton settingShSaveButton) {
	  this.settingShSaveButton = settingShSaveButton;
	 } 
	 
	 
	 public JButton getSettingShPrintButton() {
	  return settingShPrintButton;
	 }
	 public void setShPrintButton(JButton print) {
		  this.settingOnePrintButton = print;
		 }}
	