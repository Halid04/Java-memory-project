package it.castelli.Memory.game.hard;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import it.castelli.Memory.resources.Card;
import it.castelli.Memory.resources.CardValues;
import it.castelli.Memory.resources.GameDifficulty;
import it.castelli.Memory.resources.ImageCategory;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 * Game panel<br><br>
 * Constructor:
 * <ul>
 * 	<li></li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li></li>
 * </ul>
 * Attibutes:
 * <ul>
 * 	<li></li>
 * </ul>
 * Difficoltà: Media
 * @see javax.swing.JPanel
 * @see javax.swing.JLabel
 * @see javax.swing.BorderFactory
 * @see javax.swing.border.Border
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.util.ArrayList
 * @see it.castelli.Memory.resources.Card
 * @see it.castelli.Memory.resources.CardValues
 * @see it.castelli.Memory.resources.ImageCategory
 * @author Maltempi Elisabetta 4CI
 * @author Togni Claudio 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class HardDifGamePanel extends JPanel{
	private ImageCategory category;
    private ArrayList<Card> posizioni= new ArrayList<Card>(0);
    private CardValues values;
    private Border border= BorderFactory.createLineBorder(Color.WHITE);
    private JLabel label = new JLabel();

    HardDifGamePanel(ImageCategory category){
    	this.category = category;
    	this.values = new CardValues(32, 64, category, GameDifficulty.HARD);
    	setCardsProperties();
    	setLabelProperties();
        setPanelProperties();
    }
    
    private void setLabelProperties() {
    	this.label.setPreferredSize(new Dimension(100, 20));
    	this.label.setText("Tentativi: 0");
    	this.label.setForeground(Color.black);
    	this.label.setBounds(265,30,100,20);
    }
    
    public void updateLabel(int tentativi) {
    	this.label.setText("Tentativi: " + tentativi);
    }

    private void setCardsProperties(){
    	this.posizioni = values.generateValues(posizioni);
        for(int i=0;i<this.posizioni.size();i++){
            this.posizioni.get(i).setPreferredSize(new Dimension(50,50));
            switch (i+1){
            case 1:
                this.posizioni.get(i).setBounds(47,47,50,50);
                break;
            case 2:
                this.posizioni.get(i).setBounds(112,47,50,50);
                break;
            case 3:
                this.posizioni.get(i).setBounds(177,47,50,50);
                break;
            case 4:
                this.posizioni.get(i).setBounds(242,47,50,50);
                break;
            case 5:
                this.posizioni.get(i).setBounds(307,47,50,50);
                break;
            case 6:
                this.posizioni.get(i).setBounds(372,47,50,50);
                break;
            case 7:
                this.posizioni.get(i).setBounds(437,47,50,50);
                break;
            case 8:
                this.posizioni.get(i).setBounds(502,47,50,50);
                break;
            case 9:
                this.posizioni.get(i).setBounds(47,112,50,50);
                break; 
            case 10:
                this.posizioni.get(i).setBounds(112,112,50,50);
                break;
            case 11:
                this.posizioni.get(i).setBounds(177,112,50,50);
                break;
            case 12:
                this.posizioni.get(i).setBounds(242,112,50,50);
                break;
            case 13:
                this.posizioni.get(i).setBounds(307,112,50,50);
                break;
            case 14:
                this.posizioni.get(i).setBounds(372,112,50,50);
                break;
            case 15:
                this.posizioni.get(i).setBounds(437,112,50,50);
                break;
            case 16:
                this.posizioni.get(i).setBounds(502,112,50,50);
                break;
            case 17:
                this.posizioni.get(i).setBounds(47,177,50,50);
                break;
            case 18:
                this.posizioni.get(i).setBounds(112,177,50,50);
                break;
            case 19:
                this.posizioni.get(i).setBounds(177,177,50,50);
                break;
            case 20:
                this.posizioni.get(i).setBounds(242,177,50,50);
                break;
            case 21:
                this.posizioni.get(i).setBounds(307,177,50,50);
                break;
            case 22:
                this.posizioni.get(i).setBounds(372,177,50,50);
                break;
            case 23:
                this.posizioni.get(i).setBounds(437,177,50,50);
                break;
            case 24:
                this.posizioni.get(i).setBounds(502,177,50,50);
                break;
            case 25:
                this.posizioni.get(i).setBounds(47,242,50,50);
                break;
            case 26:
                this.posizioni.get(i).setBounds(112,242,50,50);
                break;
            case 27:
                this.posizioni.get(i).setBounds(177,242,50,50);
                break;
            case 28:
                this.posizioni.get(i).setBounds(242,242,50,50);
                break;
            case 29:
                this.posizioni.get(i).setBounds(307,242,50,50);
                break;
            case 30:
                this.posizioni.get(i).setBounds(372,242,50,50);
                break;
            case 31:
                this.posizioni.get(i).setBounds(437,242,50,50);
                break;
            case 32:
                this.posizioni.get(i).setBounds(502,242,50,50);
                break;
            case 33:
                this.posizioni.get(i).setBounds(47,307,50,50);
                break;
            case 34:
                this.posizioni.get(i).setBounds(112,307,50,50);
                break;
            case 35:
                this.posizioni.get(i).setBounds(177,307,50,50);
                break;
            case 36:
                this.posizioni.get(i).setBounds(242,307,50,50);
                break;
            case 37:
                this.posizioni.get(i).setBounds(307,307,50,50);
                break;
            case 38:
                this.posizioni.get(i).setBounds(372,307,50,50);
                break;
            case 39:
                this.posizioni.get(i).setBounds(437,307,50,50);
                break;
            case 40:
                this.posizioni.get(i).setBounds(502,307,50,50);
                break;
            case 41:
                this.posizioni.get(i).setBounds(47,372,50,50);
                break;
            case 42:
                this.posizioni.get(i).setBounds(112,372,50,50);
                break;
            case 43:
                this.posizioni.get(i).setBounds(177,372,50,50);
                break;
            case 44:
                this.posizioni.get(i).setBounds(242,372,50,50);
                break;
            case 45:
                this.posizioni.get(i).setBounds(307,372,50,50);
                break;
            case 46:
                this.posizioni.get(i).setBounds(372,372,50,50);
                break;
            case 47:
                this.posizioni.get(i).setBounds(437,372,50,50);
                break;
            case 48:
                this.posizioni.get(i).setBounds(502,372,50,50);
                break;
            case 49:
                this.posizioni.get(i).setBounds(47,437,50,50);
                break;
            case 50:
                this.posizioni.get(i).setBounds(112,437,50,50);
                break;
            case 51:
                this.posizioni.get(i).setBounds(177,437,50,50);
                break;
            case 52:
                this.posizioni.get(i).setBounds(242,437,50,50);
                break;
            case 53:
                this.posizioni.get(i).setBounds(307,437,50,50);
                break;
            case 54:
                this.posizioni.get(i).setBounds(372,437,50,50);
                break;
            case 55:
                this.posizioni.get(i).setBounds(437,437,50,50);
                break;
            case 56:
                this.posizioni.get(i).setBounds(502,437,50,50);
                break;
            case 57:
                this.posizioni.get(i).setBounds(47,502,50,50);
                break;
            case 58:
                this.posizioni.get(i).setBounds(112,502,50,50);
                break;
            case 59:
                this.posizioni.get(i).setBounds(177,502,50,50);
                break;
            case 60:
                this.posizioni.get(i).setBounds(242,502,50,50);
                break;
            case 61:
                this.posizioni.get(i).setBounds(307,502,50,50);
                break;
            case 62:
                this.posizioni.get(i).setBounds(372,502,50,50);
                break;
            case 63:
                this.posizioni.get(i).setBounds(437,502,50,50);
                break;
            case 64:
                this.posizioni.get(i).setBounds(502,502,50,50);
                break;
                
            }
        }
    }

    private void setPanelProperties() {
    	this.setLayout(null);
        addButtons();
        this.add(this.label);
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(new Color(102,178,255));
        this.setBorder(border);
        this.setVisible(true);
    }

    private void addButtons(){
        for(int i = 0; i < posizioni.size(); i++){
            this.add(posizioni.get(i));
        }
    }
    
    public Object getButtons() {
    	return this.posizioni;
    }
    
    public void setButtons(ArrayList<Card> posizioni) {
    	this.posizioni = posizioni;
    }
}
