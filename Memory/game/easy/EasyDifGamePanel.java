package it.castelli.Memory.game.easy;

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
 * Game panel<br>
 * Difficoltà: Facile
 * @see javax.swing.JPanel
 * @see java.awt.Dimension
 * @see java.awt.Color
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see java.util.ArrayList
 * @see it.castelli.Memory.resources.Card
 * @see it.castelli.Memory.resources.CardValues
 * @author Togni Claudio 4CI
 * @author Maltempi Elisabetta 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class EasyDifGamePanel extends JPanel{
	private ImageCategory category;
    private ArrayList<Card> posizioni= new ArrayList<Card>(0);
    private CardValues values;
    private Border border= BorderFactory.createLineBorder(Color.WHITE);
    private JLabel label = new JLabel();

    EasyDifGamePanel(ImageCategory category){
    	this.category = category;
    	this.values = new CardValues(8, 16, category, GameDifficulty.EASY);
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

    private void setCardsProperties(){
    	this.posizioni = values.generateValues(posizioni);
        for(int i=0;i<this.posizioni.size();i++){
            this.posizioni.get(i).setPreferredSize(new Dimension(100,100));
            switch (i+1){
	            case 1:
	                this.posizioni.get(i).setBounds(65,65,100,100);
	                break;
	            case 2:
	                this.posizioni.get(i).setBounds(195,65,100,100);
	                break;
	            case 3:
	                this.posizioni.get(i).setBounds(325,65,100,100);
	                break;
	            case 4:
	                this.posizioni.get(i).setBounds(455,65,100,100);
	                break;
	            case 5:
	                this.posizioni.get(i).setBounds(65,195,100,100);
	                break;
	            case 6:
	                this.posizioni.get(i).setBounds(195,195,100,100);
	                break;
	            case  7:
	                this.posizioni.get(i).setBounds(325,195,100,100);
	                break;
	            case 8:
	                this.posizioni.get(i).setBounds(455,195,100,100);
	                break;
	            case 9:
	                this.posizioni.get(i).setBounds(65,325,100,100);
	                break;
	            case 10:
	                this.posizioni.get(i).setBounds(195,325,100,100);
	                break;
	            case 11:
	                this.posizioni.get(i).setBounds(325,325,100,100);
	                break;
	            case 12:
	                this.posizioni.get(i).setBounds(455,325,100,100);
	                break;
	            case 13:
	                this.posizioni.get(i).setBounds(65,455,100,100);
	                break;
	            case 14:
	                this.posizioni.get(i).setBounds(195,455,100,100);
	                break;
	            case  15:
	                this.posizioni.get(i).setBounds(325,455,100,100);
	                break;
	            case 16:
	                this.posizioni.get(i).setBounds(455,455,100,100);
	                break;
	        }
        }
    }
    
    public void updateLabel(int tentativi) {
    	this.label.setText("Tentativi: " + tentativi);
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