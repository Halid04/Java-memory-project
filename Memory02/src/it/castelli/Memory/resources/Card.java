package it.castelli.Memory.resources;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import it.castelli.Memory.resources.alerts.Alert;

/**
 * Cards for Memory Game<br><br>
 * Contructors:
 * <ul>
 * 	<li>Card(Value : int)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setPath() : private void</li>
 * 	<li>getValue() : public int</li>
 * 	<li>setValue(value : int) : public void</li>
 * 	<li>isTurned() : public boolean</li>
 * 	<li>setTurned(turned : boolean) : public void</li>
 * 	<li>getButton() : public Object</li>
 * 	<li>isFound() : public boolean</li>
 * 	<li>setFound(found : boolean) : public void</li>
 * 	<li>turnCard() : public void</li>
 * 	<li>setActionListener(buttons : ArrayList<"Card">) : public void</li>
 * 	<li>coverCard() : public void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>buttons : private ArrayList<"Card"></li>
 * 	<li>Value : private int</li>
 * 	<li>turned : private boolean</li>
 * 	<li>found : private boolean</li>
 * 	<li>alert : private Alert</li>
 * 	<li>img : private CardImages</li>
 * 	<li>sfondo : private ImageIcon</li>
 * 	<li>path : private String</li>
 * </ul>
 * @see javax.swing.JButton
 * @see javax.swing.ImageIcon
 * @see java.awt.Image
 * @see java.awt.event.ActionEvent
 * @see java.awt.event.ActionListener
 * @see java.util.ArrayList
 * @see it.castelli.Memory.resources.alerts.Alert
 * @see it.castelli.Memory.resources.CardImages
 * @author Elisabetta
 * @version 1.7
 */
@SuppressWarnings("serial")
public class Card extends JButton {
	@SuppressWarnings("unused")
	private ArrayList<Card> buttons;
    private int Value;
    private boolean turned = false;
    private boolean found = false;
    private Alert alert = new Alert();
    private ImageCategory category;
    private CardImages img = new CardImages(category);
    private String path;
    private ImageIcon sfondo = new ImageIcon(new ImageIcon("Immagini\\Art\\" + "sfondo.jpeg").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
    
    /**
     * Card constructor<br><br>
     * Methods:
     * <ul>
     * 	<li>setPath</li>
     * </ul>
     * @param Value : int
     * @param category : ImageCategory
     */
    public Card(int Value, ImageCategory category){
    	this.category = category;
    	setPath();
        this.Value = Value;
        this.setIcon(sfondo);
    }
    
    /**
     * Sets the path where to find the images based<br>
     * On the category
     * @see it.castelli.Memory.resources.Card
     * @see it.castelli.Memory.resources.ImageCategory
     */
    private void setPath() {
    	switch(this.category) {
    		case Art:
    			path = "Immagini\\Art\\";
    			break;
    		case Animals:
    			path = "Immagini\\Animals\\";
    			break;
    		case Disney:
    			path = "Immagini\\Disney\\";
    			break;
    	}
    }

    /**
     * Returns the specified card value
     * @see it.castelli.Memory.resources.Card
     * @return Value : int
     */
    public int getValue() {
        return this.Value;
    }

    /**
     * Assigns a value to the specified card
     * @see it.castelli.Memory.resources.Card
     * @param value : int
     */
    public void setValue(int value) {
        Value = value;
    }

    /**
     * Returns the specified card value "Turned"
     * @see it.castelli.Memory.resources.Card
     * @return turned : boolean
     */
    public boolean isTurned() {
        return this.turned;
    }

    /**
     * Sets the specified card value "Turned" on true or false
     * @see it.castelli.Memory.resources.Card
     * @param turned : boolean
     */
    public void setTurned(boolean turned) {
        this.turned = turned;
    }
    
    /**
     * Returns the specified card
     * @see it.castelli.Memory.resources.Card
     * @return Card : Card
     */
    public Object getButton() {
    	return this;
    }
  
    /**
     * Returns the specified card value "Found"
     * @see it.castelli.Memory.resources.Card
     * @return found : boolean
     */
    public boolean isFound() {
		return this.found;
	}

    /**
     * Sets the specified card value "Found" on true or false
     * @see it.castelli.Memory.resources.Card
     * @param found : boolean
     */
	public void setFound(boolean found) {
		this.found = found;
	}
	
	/**
	 * Turns the specified card<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setIcon</li>
	 * 	<li>setVisible</li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see java.awt.Color
     * @see it.castelli.Memory.resources.Card
     * @see it.castelli.Memory.resources.CardImages
     */
	public void turnCard() {
		this.setIcon(new ImageIcon(new ImageIcon(path + img.cardImage(this.Value)).getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
		this.setVisible(true);
	}

	/**
	 * Sets the actionListener at all the cards into the ArrayList<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>addActionListener</li>
	 * 	<li>cardAlreadyTurned</li>
	 * 	<li>cardAlreadyFound</li>
	 * 	<li>equals</li>
	 * 	<li>isTurned</li>
	 * 	<li>setTurned</li>
	 * 	<li>turnCard</li>
	 * 	<li>twoCardsTurned</li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see java.util.ArrayList
	 * @see java.awt.event.ActionEvent
	 * @see java.awt.event.ActionListener
     * @see it.castelli.Memory.resources.Card
     * @see it.castelli.Memory.resources.alerts.Alert
     * @param buttons : ArrayList<Card>
     */
	public void setActionListener(ArrayList<Card> buttons) {
    	this.buttons = buttons;
    	this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int cont = 0;
				if(isTurned()) {
					alert.cardAlreadyTurned();
				}else {
					if(isFound()) {
						alert.cardAlreadyFound();
					}else {
						for(int i = 0; i < buttons.size(); i++) {
							if(!buttons.get(i).equals(getButton())) {
								if(buttons.get(i).isTurned()) {
									cont++;
								}
							}
						}
						if(cont <= 1) {
							setTurned(true);
							turnCard();
						}else {
							alert.twoCardsTurned();
						}
					}
				}
			}
        });
    }
	
	/**
	 * Covers the specified card<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setIcon</li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see javax.swing.ImageIcon
	 * @see it.castelli.Memory.resources.Card
	 */
	public void coverCard() {
		this.setIcon(sfondo);
	}	
}