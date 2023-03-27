package it.castelli.Memory.resources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Find a user into the "database" or<br>
 * Add a new username if it doesn't exists<br><br>
 * Constructor:
 * <ul>
 * 	<li>Finder()</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>findUsername(usr : String) : public boolean</li>
 * 	<li>findPassword(psw : String) : public boolean</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>usrFound : private boolean</li>
 * 	<li>pswFound : private boolean</li>
 * </ul>
 * @see java.io.IOException
 * @see java.io.FileReader
 * @see java.io.BufferedReader
 * @see it.castelli.Memory.usr.LoginPanel
 * @see it.castelli.Memory.usr.SignupPanel
 * @author Claudio
 * @version 1.2
 */
public class Finder {
	private boolean usrFound = false;
	private boolean pswFound = false;
	
	/**
	 * Finder constructor
	 * @see it.castelli.Memory.resources.Finder
	 */
	public Finder(){
		
	}
	
	/**
	 * Finds the username in the "database"<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>readLine</li>
	 * 	<li>split</li>
	 * 	<li>close</li>
	 * </ul>
	 * @see java.io.BufferedReader
	 * @see java.io.FileReader
	 * @see java.io.IOException
	 * @param usr : String
	 * @return usrFound : boolean
	 */
	public boolean findUsername(String usr) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\it\\castelli\\Memory\\usr\\Users.txt"));
			String line = reader.readLine();
			String[] username;
			while(line != null) {
				username = line.split("-");
				if(usr.equals(username[0])) {
					usrFound = true;
					line = null;
				}else {
					usrFound = false;
					line = reader.readLine();
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return usrFound;
	}
	
	/**
	 * Finds the password connected to the specified username<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>readLine</li>
	 * 	<li>split</li>
	 * 	<li>equals</li>
	 * 	<li>findUsername</li>
	 * 	<li>close</li>
	 * </ul>
	 * @see java.io.BufferedReader
	 * @see java.io.FileReader
	 * @see java.io.IOException
	 * @param psw : String
	 * @return pswFound : boolean
	 */
	public boolean findPassword(String usr, String psw) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src\\it\\castelli\\Memory\\usr\\Users.txt"));
			String line = reader.readLine();
			String[] data;
			while(line != null) {
				data = line.split("-");
				if(findUsername(usr)) {
					if(psw.equals(data[1])) {	
						pswFound = true;
						line = null;
					}else {
						pswFound = false;
					}
				}else {
					line = reader.readLine();
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pswFound;
	}
}
