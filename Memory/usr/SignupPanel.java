package it.castelli.Memory.usr;

//<Imports for Graphics and Events>
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import it.castelli.Memory.home.HomeFrame;
import it.castelli.Memory.resources.Finder;
import it.castelli.Memory.resources.alerts.Alert;

/**
 * Signup Page Panel<br><br>
 * Constructors:
 * <ul>
 * 	<li>SignupPanel(frame : SignupFrame)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setLabelsProperties() : private void</li>
 * 	<li>setFieldsProperties() : private void</li>
 * 	<li>setButtonEvents() : private void</li>
 * 	<li>setPanelProperties() : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>finder : private Finder</li>
 * 	<li>alert : private Alert</li>
 * 	<li>Singup : private FunctionBtn</li>
 * 	<li>usrnLabel : private LabelForSignupAndLogin</li>
 * 	<li>pswLabel : private LabelForSignupAndLogin</li>
 * 	<li>cpswLabel : private LabelForSignupAndLogin</li>
 * 	<li>username : private JTextField</li>
 * 	<li>pswField : private JPasswordField</li>
 * 	<li>cpswField : private JPasswordField</li>
 * 	<li>fieldDimension : private Dimension</li>
 * 	<li>frame : private SignupFrame</li>
 * 	<li>fieldsFont : private Font</li>
 * 	<li>panelSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JPanel
 * @see javax.swing.JButton
 * @see javax.swing.JLabel
 * @see javax.swing.JTextField
 * @see javax.swing.JPasswordField
 * @see java.awt.Font
 * @see java.awt.Dimension
 * @see java.awt.Color
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see it.castelli.Memory.resources.alerts.Alert
 * @see it.castelli.Memory.usr.FunctionBtn
 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
 * @see it.castelli.Memory.resources.Finder
 * @see it.castelli.Memory.usr.SignupFrame
 * @see it.castelli.Memory.home.HomeFrame
 * @author Togni Claudio 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class SignupPanel extends JPanel {
	private Finder finder = new Finder();
	private Alert alert = new Alert();
	private FunctionBtn Signup = new FunctionBtn("Signup");
	private LabelForSignupAndLogin usrnLabel = new LabelForSignupAndLogin("Username");
	private LabelForSignupAndLogin pswLabel = new LabelForSignupAndLogin("Password");
	private LabelForSignupAndLogin cpswLabel = new LabelForSignupAndLogin("Confirm Password");
	private JTextField username = new JTextField();
	private JPasswordField pswField = new JPasswordField();
	private JPasswordField cpswField = new JPasswordField();
	private Dimension fieldDimension = new Dimension(300,30);
	private SignupFrame frame;
	private Font fieldsFont = new Font("Arial", Font.PLAIN, 20);
	private Dimension panelSize = new Dimension(600,400);
	
	/**
	 * SignupPage Panel contructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setLabelsProperties</li>
	 * 	<li>setFieldsProperties</li>
	 * 	<li>setButtonEvents</li>
	 * 	<li>setPanelProperties</li>
	 * </ul>
	 * @param frame : SignupFrame
	 */
	SignupPanel(SignupFrame frame){
		this.frame = frame;
		setLabelsProperties();
		setFieldsProperties();
		setButtonEvents();
		setPanelProperties();
	}
	
	/**
	 * Labels for Signup Panel Page<br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>toggleVisibility</b></li>
	 * </ul>
	 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
	 */
	private void setLabelsProperties() {
		//Username Label
		usrnLabel.setBounds(240, 10, 120, 20);
		usrnLabel.setForeground(Color.white);
		usrnLabel.toggleVisibility();
		
		//Password Label
		pswLabel.setBounds(240, 80, 120, 20);
		pswLabel.setForeground(Color.white);
		pswLabel.toggleVisibility();
		
		//ConfirmPassowrd Label
		cpswLabel.setBounds(240, 150, 200, 20);
		cpswLabel.setForeground(Color.white);
		cpswLabel.toggleVisibility();
	}
	
	/**
	 * TextField and PasswordFields for Signup Panel Page<br>
	 * Methods used:
	 * <ul>
	 * 	<li>setEditable</li>
	 * 	<li>setFont</li>
	 * 	<li>setPreferredSize</li>
	 * 	<li>setBounds</li>
	 * 	<li>setVisible</li>
	 * </ul>
	 * @see javax.swing.JTextField
	 * @see javax.swing.JPasswordField
	 * @see java.awt.Font
	 * @see java.awt.Dimension
	 */
	private void setFieldsProperties() {
		//Username TextField
		username.setEditable(true);
		username.setFont(fieldsFont);
		username.setForeground(Color.black);
		username.setPreferredSize(fieldDimension);
		username.setBounds(150, 40, 300, 30);
		username.setVisible(true);
		
		//Password TextField
		pswField.setEditable(true);
		pswField.setFont(fieldsFont);
		pswField.setForeground(Color.black);
		pswField.setPreferredSize(fieldDimension);
		pswField.setBounds(150, 110, 300, 30);
		pswField.setVisible(true);
		
		//Confirm Password TextField
		cpswField.setEditable(true);
		cpswField.setFont(fieldsFont);
		cpswField.setForeground(Color.black);
		cpswField.setPreferredSize(fieldDimension);
		cpswField.setBounds(150,180, 300, 30);
		cpswField.setVisible(true);
	}
	
	/**
	 * Signup Button actionListener Settings<br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>addActionListener</b></li>
	 * 	<li><b>getWidth</b></li>
	 * 	<li><b>getHeight</b></li>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>toggleVisibility</b></li>
	 * 	<li><b>getText</b></li>
	 * 	<li><b>setText</b></li>
	 * 	<li><b>getPassword</b></li>
	 * 	<li><b>equals</b></li>
	 * 	<li><b>findUsername</b></li>
	 * </ul>
	 * Alerts:
	 * <ul>
	 * 	<li><b>notValidUsername</b></li>
	 * 	<li><b>notValidPassword</b></li>
	 * 	<li><b>notValidPasswordLength</b></li>
	 * 	<li><b>notValidConfirmPassword</b></li>
	 *  <li><b>notMatchingPasswords</b></li>
	 *  <li><b>userAlreadyRegistered</b></li>
	 * </ul>
	 * @see javax.swing.JTextField
	 * @see javax.swing.JPasswordField
	 * @see java.awt.event.ActionListener
	 * @see java.awt.event.ActionEvent
	 * @see it.castelli.Memory.usr.FunctionBtn
	 * @see it.castelli.Memory.resources.Finder
	 * @see it.castelli.Memory.resources.alerts.Alert
	 * @see it.castelli.Memory.home.HomeFrame
	 * @see it.castelli.Memory.usr.SignupFrame
	 */
	private void setButtonEvents() {
		Signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				if(username.getText().equals("")) {
					alert.notValidUsername();
				}else {
					String psw = new String(pswField.getPassword());
					String cpsw = new String(cpswField.getPassword());
					if(psw.length() == 0) {
						alert.notValidPassword();
					}else {
						if(psw.length() < 8) {
							alert.notValidPasswordLength();
							pswField.setText("");
						}else {
							if(cpsw.length() == 0) {
								alert.notValidConfirmPassword();
							}else {
								if(!psw.equals(cpsw)) {
									alert.notMatchingPassowords();
									cpswField.setText("");
									pswField.setText("");
								}else {
									boolean found = finder.findUsername(username.getText());
									if(found) {
										alert.userAlreadyRegistered();
									}else {
										try {
											FileWriter file = new FileWriter(new File("src\\it\\castelli\\Memory\\usr\\Users.txt"), true);
											file.write(username.getText() + "-" + psw + "\n");
											file.flush();
											file.close();
										} catch (IOException e1) {
											e1.printStackTrace();
										}
										alert.registeredUser();
										new HomeFrame();
										frame.disposePage();
									}
								}
							}
						}
					}
				}
			}	
		});
		Signup.setBounds(250, 240, 100, 30);
		Signup.setForeground(Color.white);
		Signup.toggleVisibility(true);
	}
	
	/**
	 * Registration Panel Settings.<br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setLayout</b></li>
	 * 	<li><b>setBackground</b></li>
	 * 	<li><b>add</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * Items used:
	 * <ul>
	 * 	<li><b>Dimension</b></li>
	 * 	<li><b>Color</b></li>
	 * 	<li><b>FunctionBtn</b></li>
	 * 	<li><b>usrnLabel</b></li>
	 * 	<li><b>pswLabel</b></li>
	 * 	<li><b>cpswLabel</b></li>
	 * 	<li><b>username</b></li>
	 * 	<li><b>pswField</b></li>
	 * 	<li><b>cpswField</b></li>
	 * </ul>
	 * @see javax.swing.JPanel
	 * @see javax.swing.JLabel
	 * @see javax.swing.JButton
	 * @see javax.swing.JTextField
	 * @see javax.swing.JPasswordField
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 * @see it.castelli.Memory.usr.FunctionBtn
	 */
	private void setPanelProperties() {
		this.setPreferredSize(panelSize);
		this.setLayout(null);
		this.setBackground(Color.black);
		
		this.add(Signup);
		this.add(usrnLabel);
		this.add(pswField);
		this.add(cpswField);
		this.add(username);
		this.add(cpswLabel);
		this.add(pswLabel);
		
		this.setVisible(true);
	}
}