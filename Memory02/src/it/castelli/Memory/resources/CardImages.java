package it.castelli.Memory.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class is used to set an image based on<br>
 * the card value and card category<br><br>
 * Constructors:
 * <ul>
 * 	<li>CardImages(category : ImageCategory)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>cardImage(Value : int) : public String</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>file : String</li>
 * </ul>
 * @see java.io.BufferedReader
 * @see java.io.FileReader
 * @see java.io.IOException
 * @see it.castelli.Memory.resources.ImageCategory
 * @author Claudio
 * @version 1.4
 */
public class CardImages {
	private String file = "";
	
	/**
	 * CardImages constructor<br>
	 * @param category : ImageCategory
	 * @see it.castelli.Memory.resources.ImageCategory
	 */
	CardImages(ImageCategory category){
		switch(category) {
			case Art:
				file = "ArtImages.txt";
				break;
			case Animals:
				file = "AnimalsImages.txt";
				break;
			case Disney:
				file = "DisneyImages.txt";
				break;
		}
	}
	
	/**
	 * Image selector based on card value and card category<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>readLine</li>
	 * 	<li>split</li>
	 * 	<li>equals</li>
	 * 	<li>close</li>
	 * </ul>
	 * @param Value : int
	 * @return imageName : String
	 * @see java.io.BufferedReader
	 * @see java.io.FileReader
	 * @see java.io.IOException
	 */
	public String cardImage(int Value) {
		String line;
		String[] immagine = new String[2];
		String value = "" + Value;
		String imageName = "";
		boolean setted = false;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			line = reader.readLine();
			while((line != null) && (setted == false)) {
				immagine = line.split("-");
				if(immagine[0].equals(value)) {
					imageName = immagine[1];
					setted = true;
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageName;
	}
}