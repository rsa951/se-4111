import java.awt.BorderLayout;import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SettingsView { 
	
	 private JFrame frame;
	 
	 //shahad
    private JLabel settingShLabel;
	 
	 private JTextField settingShTextfield;
	 
	 private JButton settingShSaveButton;
	 
	 private JButton settingShPrintButton;
	 
	 //Ashwaq
	    private JLabel settingASHLabel;
		 
		 private JTextField settingASHTextfield;
		 
		 private JButton settingASHSaveButton;
		 
		 private JButton settingASHPrintButton;
		 
		 //Rema
		    private JLabel settingRELabel;
			 
			 private JTextField settingRETextfield;
			 
			 private JButton settingRESaveButton;
			 
			 private JButton settingREPrintButton;
			 
	 
	 public SettingsView() {
	 
		  frame = new JFrame("Settings");
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 120);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);  
		  
		 
		  // Create UI elements/shahad
		  settingShLabel = new JLabel("shahad Setting :");
		  settingShTextfield = new JTextField();
		  settingShSaveButton = new JButton("Save shahad setting ");
		  settingShPrintButton = new JButton("Print to Console!");
		  	  
		  // Create UI elements/Ashwaq
		  settingASHLabel = new JLabel("Ashwaq Setting :");
		  settingASHTextfield = new JTextField();
		  settingASHSaveButton = new JButton("Save Ashwaq setting ");
		  settingASHPrintButton = new JButton("Print to Console!");
		  // Create UI elements/Rema
		  settingRELabel = new JLabel("Rema Setting :");
		  settingRETextfield = new JTextField();
		  settingRESaveButton = new JButton("Save Rema setting ");
		  settingREPrintButton = new JButton("Print to Console!");
		  
		  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingShLabel).addComponent(settingASHLabel).addComponent(settingRELabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingShTextfield).addComponent(settingASHTextfield).addComponent(settingRETextfield))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingShSaveButton).addComponent(settingASHSaveButton).addComponent(settingRESaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingShPrintButton).addComponent(settingASHPrintButton).addComponent(settingREPrintButton)));
		  layout.setVerticalGroup(layout.createSequentialGroup()
				  
.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingShLabel).addComponent(settingShTextfield).addComponent(settingShSaveButton).addComponent(settingShPrintButton))
.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingASHLabel).addComponent(settingASHTextfield).addComponent(settingASHSaveButton).addComponent(settingASHPrintButton))
.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingRELabel).addComponent(settingRETextfield).addComponent(settingRESaveButton).addComponent(settingREPrintButton)));

		  frame.getContentPane().setLayout(layout);
		  
		 } 
	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
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
	  return settingShSaveButton;
	 } 
	 
	 public void setSettingShSaveButton(JButton settingShSaveButton) {
	  this.settingShSaveButton = settingShSaveButton;
	 } 
	 
	 
	 public JButton getSettingShPrintButton() {
	  return settingShPrintButton;
	 }
	 public void setShPrintButton(JButton print) {
		  this.settingShPrintButton = print;
		 }

//Ashwaq
public JLabel getSettingASHLabel() {
	  return settingASHLabel;
	 } 

public void setSettingASHLabel(JLabel settingASHLabel) {
	  this.settingASHLabel = settingASHLabel;
	 } 


public JTextField getSettingASHTextfield() {
 return settingASHTextfield;
} 

public void setSettingASHTextfield(JTextField settingASHTextfield) {
 this.settingASHTextfield = settingASHTextfield;
} 

public JButton getSettingASHSaveButton() {
 return settingASHSaveButton;
} 

public void setSettingASHSaveButton(JButton settingASHSaveButton) {
 this.settingASHSaveButton = settingASHSaveButton;
} 



public JButton getSettingASHPrintButton() {
 return settingASHPrintButton;
}
public void setASHPrintButton(JButton print) {
	  this.settingASHPrintButton = print;
	 }



	//Rema
		 public JLabel getSettingRELabel() {
			  return settingShLabel;
			 } 
		 
		 public void setSettingRELabel(JLabel settingRELabel) {
			  this.settingRELabel = settingRELabel;
			 } 
		 
		 
		 public JTextField getSettingRETextfield() {
		  return settingRETextfield;
		 } 
		 
		 public void setSettingRETextfield(JTextField settingRETextfield) {
		  this.settingRETextfield = settingRETextfield;
		 } 

		 public JButton getSettingRESaveButton() {
		  return settingRESaveButton;
		 } 
		 
		 public void setSettingRESaveButton(JButton settingRESaveButton) {
			 this.settingRETextfield = settingRETextfield;
		 } 
		 
		 
		 public JButton getSettingREPrintButton() {
		  return settingREPrintButton;
		 }
		 public void setREPrintButton(JButton print) {
			  this.settingREPrintButton = print;
			 }
}
	