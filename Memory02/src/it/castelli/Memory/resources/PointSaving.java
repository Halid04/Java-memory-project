package it.castelli.Memory.resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Constructors:
 * <ul>
 * 	<li>PointSaving(username : String, Tentativi : int, difficoltà : String)</li>
 * </ul>
 * @see java.io.FileWriter
 * @see java.io.IOException
 * @see it.castelli.Memory.game.easy.EasyDifGameFrame
 * @see it.castelli.Memory.game.medium.MediumDifGameFrame
 * @see it.castelli.Memory.game.hard.HardDifGameFrame
 * @author Cisse
 * @version 1.0
 */
public class PointSaving {

	/**
	 * PointSaving constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>write</li>
	 * 	<li>close</li>
	 * </ul>
	 * @param username : String
	 * @param Tentativi : int
	 * @param difficoltà : String
	 */
	public PointSaving(String username, int Tentativi, String difficoltà) {
		try {
			FileWriter writer = new FileWriter("src\\it\\castelli\\Memory\\usr\\Stats.txt", true);
			writer.write(username + " - " + Tentativi + " - " + difficoltà);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
