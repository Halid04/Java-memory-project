package it.castelli.Memory.resources;

import java.util.ArrayList;

/**
 * Algoritmo di assegnazione del valore alle carte<br><br>
 * Constructors:
 * <ul>
 * 	<li>CardValues(maxValue : int, nCards : int, category : ImageCategory)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>generateValues(cards : ArrayList<"Card">) : public ArrayList<"Card"></li>
 * 	<li>checkValueAndAdd(valore : int) : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>cards : ArrayList<"Card"></li>
 * 	<li>maxValue : int</li>
 * 	<li>nCards : int</li>
 * 	<li>category : ImageCategory</li>
 * </ul>
 * @see java.util.ArrayList
 * @see it.castelli.Memory.resources.Card
 * @see it.castelli.Memory.resources.ImageCategory
 * @author Elisabetta
 * @version 1.4
 */
public class CardValues {
	private ArrayList<Card> cards;
	private int maxValue = 0;
	private int nCards = 0;
	private ImageCategory category;
	
	/**
	 * Cards Value Assignment constructor<br><br>
	 * @see it.castelli.Memory.resources.CardValues
	 * @see it.castelli.Memory.resources.ImageCategory
	 * @param maxValue : int
	 * @param nCards : int
	 * @param category : ImageCategory
	 */
	public CardValues(int maxValue, int nCards, ImageCategory category){
		this.category = category;
		this.maxValue = maxValue;
		this.nCards = nCards;
	}
	
	/**
	 * @see java.util.ArrayList
	 * @see it.castelli.Memory.resources.Card
	 * @see it.castelli.Memory.resources.ImageCategory
	 * @param cards : ArrayList<"Card">
	 * @return cards : ArrayList<"Card">
	 */
	public ArrayList<Card> generateValues(ArrayList<Card> cards) {
		this.cards = cards;
		int valore;
		while(cards.size() < nCards){
            valore = (int) (Math.random()*maxValue+1);
            if(this.cards.size() <= 1){
            	this.cards.add(new Card(valore, this.category));
            }else{
                checkValueAndAdd(valore);
            }
        }
        for(int i = 0; i < this.cards.size(); i++) {
        	this.cards.get(i).setActionListener(this.cards);
        }
        return this.cards;
	}
	
	/**
	 * @param valore : int
	 * @see java.util.ArrayList
	 * @see it.castelli.Memory.resources.Card
	 * @see it.castelli.Memory.resources.ImageCategory
	 */
	private void checkValueAndAdd(int valore){
        int cont = 0;
        for(int i=0;i<this.cards.size();i++){
            if(this.cards.get(i).getValue() == valore){
                cont++;
            }
        }
        if(cont <= 1){
        	this.cards.add(new Card(valore, this.category));
        }
        cont = 0;
    }
	
}
