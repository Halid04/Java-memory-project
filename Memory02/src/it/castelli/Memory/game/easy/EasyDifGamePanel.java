package it.castelli.Memory.game.easy;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import it.castelli.Memory.resources.Card;
import it.castelli.Memory.resources.CardValues;
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
 * @author Elisabetta
 * @version 1.2
 */
@SuppressWarnings("serial")
public class EasyDifGamePanel extends JPanel{
	private ImageCategory category;
    private ArrayList<Card> posizioni= new ArrayList<Card>(0);
    private CardValues values = new CardValues(8, 16, category);
    private Border border= BorderFactory.createLineBorder(Color.WHITE);

    EasyDifGamePanel(ImageCategory category){
    	this.category = category;
    	setCardsProperties();
        setPanelProperties();
    }

    private void setCardsProperties(){
    	this.posizioni = values.generateValues(posizioni);
        for(int i=0;i<this.posizioni.size();i++){
            this.posizioni.get(i).setPreferredSize(new Dimension(50,50));
            switch (i+1){
                case 1:
                    this.posizioni.get(i).setBounds(30,30,50,50);
                    break;
                case 2:
                    this.posizioni.get(i).setBounds(100,30,50,50);
                    break;
                case 3:
                    this.posizioni.get(i).setBounds(170,30,50,50);
                    break;
                case 4:
                    this.posizioni.get(i).setBounds(240,30,50,50);
                    break;
                case 5:
                    this.posizioni.get(i).setBounds(30,100,50,50);
                    break;
                case 6:
                    this.posizioni.get(i).setBounds(100,100,50,50);
                    break;
                case  7:
                    this.posizioni.get(i).setBounds(170,100,50,50);
                    break;
                case 8:
                    this.posizioni.get(i).setBounds(240,100,50,50);
                    break;
                case 9:
                    this.posizioni.get(i).setBounds(30,170,50,50);
                    break;
                case 10:
                    this.posizioni.get(i).setBounds(100,170,50,50);
                    break;
                case 11:
                    this.posizioni.get(i).setBounds(170,170,50,50);
                    break;
                case 12:
                    this.posizioni.get(i).setBounds(240,170,50,50);
                    break;
                case 13:
                    this.posizioni.get(i).setBounds(30,240,50,50);
                    break;
                case 14:
                    this.posizioni.get(i).setBounds(100,240,50,50);
                    break;
                case  15:
                    this.posizioni.get(i).setBounds(170,240,50,50);
                    break;
                case 16:
                    this.posizioni.get(i).setBounds(240,240,50,50);
                    break;
            }
        }
    }

    private void setPanelProperties() {
    	this.setLayout(null);
        addButtons();
        this.setPreferredSize(new Dimension(320,320));
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