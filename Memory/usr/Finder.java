package it.castelli.Memory.usr;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import it.castelli.Memory.resources.alerts.Alert;

/**
 * Find a user into the "database" or<br>
 * Add a new username if it doesn't exists
 * @see java.io.IoException
 * @see java.io.FileReader
 * @see java.io.BufferedReader
 * @see it.castelli.Memory.usr.LoginPanel
 * @see it.castelli.Memory.usr.SignupPanel
 * @see it.castelli.Memory.usr.Users
 * @see it.castelli.Memory.resources.alerts.Alert
 * @author Claudio
 * @version 1.0
 */
public class Finder {
	private Alert alert = new Alert();
	private boolean found = false;
	
	Finder(){
		
	}
	
	public boolean findUsername(String usr) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Users.txt"));
			String line = reader.readLine();
			String[] username;
			while(line != null) {
				username = line.split("-");
				if(usr.equals(username[0])) {
					alert.userAlreadyRegistered();
					found = true;
					line = null;
				}else {
					found = false;
					line = reader.readLine();
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return found;
	}
}
