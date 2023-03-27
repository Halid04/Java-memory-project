package it.castelli.Memory.usr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import it.castelli.Memory.home.HomeFrame;
import it.castelli.Memory.home.HomePanel;
import it.castelli.Memory.resources.Finder;
import it.castelli.Memory.resources.alerts.Alert;

/**
 * LoginFrame and LoginPanel are used to create a login form to allow players<br>
 * who want to play to login. The LoginPanel class contains the login<br>
 * form and handles user input. When the user submits their credentials,<br>
 * the LoginPanel class sends the data to the server for authentication.<br>
 * If the user is authenticated successfully, the login window is closed and<br>
 * the main application window is displayed.<br><br>
 * Constructors:
 * <ul>
 * 	<li>LoginPanel(frame : LoginFrame)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setLabelsProperties : private void</li>
 * 	<li>setFieldsProperties : private void</li>
 * 	<li>setButtonEvents : private void</li>
 * 	<li>setPanelProperties : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>usrLabel : private LabelForSignupAndLogin</li>
 * 	<li>pswLabel : private LabelForSignupAndLogin</li>
 * 	<li>username : private JTextField</li>
 * 	<li>pswField : private JPasswordField</li>
 * 	<li>fieldDimension : private Dimension</li>
 * 	<li>Login : private FunctionBtn</li>
 *  <li>alert : private Alert</li>
 * 	<li>finder : private Finder</li> 
 * 	<li>frame : private LoginFrame</li>
 * 	<li>fieldsFont : private Font</li>
 * 	<li>panelSize : private Dimension</li>
 * </ul>
 * @see javax.swing.JPanel
 * @see javax.swing.JTextField
 * @see javax.swing.JPasswordField
 * @see javax.swing.JLabel
 * @see javax.swing.JButton
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see it.castelli.Memory.resources.Finder
 * @see it.castelli.Memory.resources.alerts.Alert
 * @see it.castelli.Memory.usr.FunctionBtn
 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
 * @see it.castelli.Memory.usr.LoginFrame
 * @see it.castelli.Memory.home.HomeFrame
 * @author Cisse
 * @version 1.6
 */
@SuppressWarnings("serial")
public class LoginPanel extends JPanel{
	private LabelForSignupAndLogin usrLabel = new LabelForSignupAndLogin("Username");
	private LabelForSignupAndLogin pswLabel = new LabelForSignupAndLogin("Password");
	private JTextField username = new JTextField();
	private JPasswordField pswField = new JPasswordField();
	private Dimension fieldDimension = new Dimension(300,30);
	private FunctionBtn Login = new FunctionBtn("Login");
	private Alert alert = new Alert();
	private Finder finder = new Finder();
	private LoginFrame frame;
	private Font fieldsFont = new Font("Arial", Font.PLAIN, 20);
	private Dimension panelSize = new Dimension(600,400);

	/**
	 * A constructor that initializes the labels, fields and button<br>
	 * and sets the panel properties.<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setLabelProperties</li>
	 * 	<li>setFieldsProperties</li>
	 * 	<li>setButtonEvents</li>
	 * 	<li>setPanelProperties</li>
	 * </ul>
	 * @see it.castelli.Memory.usr.LoginFrame
	 */
	LoginPanel(LoginFrame frame){
		this.frame = frame;
		setLabelsProperties();
		setFieldsProperties();
		setButtonEvents();
		setPanelProperties();
	}
	
	/**
	 * A method that sets the properties of the labels.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>toggleVisibility</b></li>
	 * </ul>
	 * @see it.castelli.Memory.usr.LabelForSignupAndLogin
	 */
	private void setLabelsProperties() {
		//Username Label
		usrLabel.setBounds(240, 10, 120, 20);
		usrLabel.toggleVisibility();
		
		//Password Label
		pswLabel.setBounds(240, 80, 120, 20);
		pswLabel.toggleVisibility();
	}
	
	/**
	 * A method that sets the properties of the TextFields.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li>setEditable</li>
	 * 	<li>setFont</li>
	 *	<li>setPreferredSize</li>
	 *	<li>setBounds</li>
	 *	<li>setVisible</li>
	 * </ul>
	 * @see javax.swing.JTextField
	 * @see javax.swing.JPasswordField
	 */
	private void setFieldsProperties() {
		//Username TextField
		username.setEditable(true);
		username.setFont(fieldsFont);
		username.setPreferredSize(fieldDimension);	
		username.setBounds(150, 40, 300, 30);
		username.setVisible(true);
		
		//Password TextField
		pswField.setEditable(true);
		pswField.setFont(fieldsFont);
		pswField.setPreferredSize(fieldDimension);
		pswField.setBounds(150, 110, 300, 30);
		pswField.setVisible(true);
	}
	
	/**
	 * A method that sets the events of the login button.<br><br>
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
	 * </ul>
	 * @see javax.swing.JTextField
	 * @see javax.swing.JPasswordField
	 * @see java.awt.event.ActionListener
	 * @see java.awt.event.ActionEvent
	 * @see it.castelli.Memory.usr.FunctionBtn
	 * @see it.castelli.Memory.resources.Finder
	 * @see it.castelli.Memory.resources.alerts.Alert
	 * @see it.castelli.Memory.usr.LoginFrame
	 * @see it.castelli.Memory.home.HomeFrame
	 */
	private void setButtonEvents() {
		Login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				if(username.getText().equals("")) {
					alert.notValidUsername();
				}else {
					if(!finder.findUsername(username.getText())) {
						String psw = new String(pswField.getPassword());
						if(psw.length() == 0) {
							alert.notValidPassword();
						}else {
							if(finder.findPassword(username.getText(), psw)) {
								alert.successfulLogin(username.getText());
								new HomeFrame(username.getText());
								frame.disposePage();
								HomePanel.setLoggedIn(true);
							}else {
								alert.wrongPassword();
								pswField.setText("");
							}
						}
					}
				}
			}	
		});
		Login.setBounds(250, 240, 100, 30);
		Login.toggleVisibility(true);
	}
	
	/**
	 * A method that sets the properties of the panel.<br><br>
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
	 * 	<li><b>panelSize</b></li>
	 * 	<li><b>Color</b></li>
	 * 	<li><b>FunctionBtn</b></li>
	 * 	<li><b>usrnLabel</b></li>
	 * 	<li><b>pswLabel</b></li>
	 * 	<li><b>username</b></li>
	 * 	<li><b>pswField</b></li>
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
		
        this.add(usrLabel);
        this.add(pswLabel);
        this.add(username);
        this.add(pswField);
        this.add(Login);
        
        this.setVisible(true);
	}
}