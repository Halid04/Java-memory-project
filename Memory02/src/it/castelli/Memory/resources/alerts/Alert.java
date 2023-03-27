package it.castelli.Memory.resources.alerts;
import javax.swing.JOptionPane;

/**
 * Game Alerts<br><br>
 * Constructors:
 * <ul>
 * 	<li>Alert()</li>
 * </ul>
 * Methods --> Alert Types:
 * <ul>
 * 	<li>notValidUsername() : public void</li>
 * 	<li>notValidPassword() : public void</li>
 * 	<li>notValidPasswordLength() : public void</li>
 * 	<li>notValidConfirmPassword() : public void</li>
 * 	<li>notMatchingPassowords() : public void</li>
 * 	<li>userAlreadyRegistered() : public void</li>
 * 	<li>registeredUser() : public void</li>
 * 	<li>wrongPassword() : public void</li>
 * 	<li>userNotFound() : public void</li>
 * 	<li>cardAlreadyFound() : public void</li>
 * 	<li>twoCardsTurned() : public void</li>
 * 	<li>cardAlreadyTurned() : public void</li>
 * 	<li>gameCompleted(tentativi : int) : public void</li>
 * 	<li>successfulLogin(username : String) : public void</li>
 * </ul>
 * @see javax.swing.JOptionPane
 * @see it.castelli.Memory.usr.LoginPanel
 * @see it.castelli.Memory.usr.SignupPanel
 * @author Claudio
 * @version 1.6
 */
@SuppressWarnings("serial")
public class Alert extends JOptionPane{
	
	/**
	 * Alerts constructor
	 * @see javax.swing.JOptionPane
	 * @see it.castelli.resources.alerts.Alert
	 */
	public Alert(){
		
	}
	
	/**
	 * Empty username field into Login or Signup page
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void notValidUsername() {
		this.showMessageDialog(null, "Devi inserire un username!!", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Empty password field into Login or Signup page
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void notValidPassword() {
		this.showMessageDialog(null, "Devi inserire una password!!", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Not valid password length into Signup page
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void notValidPasswordLength() {
		this.showMessageDialog(null, "La password deve essere lunga almeno 8 caratteri!", "Memory", JOptionPane.WARNING_MESSAGE);
	}
	
	/**
	 * Empty confirmPassword field Signup page
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void notValidConfirmPassword() {
		this.showMessageDialog(null, "Devi inserire la password nel campo di conferma della password", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Not matching passwords into Signup page
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void notMatchingPassowords() {
		this.showMessageDialog(null, "Le due password non sono uguali!!", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * This user is already registered into the database
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void userAlreadyRegistered() {
		this.showMessageDialog(null, "Questo utente è già registrato!!", "Memory", JOptionPane.WARNING_MESSAGE);
	}
	
	/**
	 * Successful registration operation
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void registeredUser() {
		this.showMessageDialog(null, "Registrazione completata!!", "Memory", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * The password from Login Page is not matching with the password<br>
	 * Registered into the database
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void wrongPassword() {
		this.showMessageDialog(null, "Password errata!!", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * The username from Login Page isn't registered<br>
	 * Into the database
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void userNotFound() {
		this.showMessageDialog(null, "Questo utente non esiste", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * You have already found the couple of this card<br>
	 * So you have to select another card
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void cardAlreadyFound() {
		this.showMessageDialog(null, "Non puoi girare questa carta!", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * You already turned two cards<br>
	 * So you have to press the Confirm button
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void twoCardsTurned() {
		this.showMessageDialog(null, "Non puoi girare più di due carte", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * The card is already turned<br>
	 * So you have to select another card
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void cardAlreadyTurned() {
		this.showMessageDialog(null, "Questa carta è già girata", "Memory", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * You found all the couples<br>
	 * So you have to go back to the HomePage
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void gameCompleted(int tentativi) {
		String message = "Complimenti, hai trovato tutte le coppie!! Tentativi: " + tentativi;
 		this.showMessageDialog(null, message, "Memory", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Successful login operation
	 * @see javax.swing.JOptionPane
	 */
	@SuppressWarnings("static-access")
	public void successfulLogin(String username) {
		String message = "Bentornato " + username;
		this.showMessageDialog(null, message, "Memory", JOptionPane.INFORMATION_MESSAGE);
	}
}
