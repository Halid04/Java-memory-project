package it.castelli.Memory.usr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import it.castelli.Memory.home.HomeFrame;
import it.castelli.Memory.resources.styles.RoundedBorder;

/**
 * @see javax.swing.JFrame
 * @see javax.swing.JPanel
 * @see javax.swing.JLabel
 * @see javax.swing.JButton
 * @see java.awt.Font
 * @see it.castelli.Memory.usr.RulesFrame
 * @see it.castelli.Memory.resources.styles.RoundedBorder
 * @author Maltempi Elisabetta 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class RulesPanel extends JPanel{
	private JLabel title= new JLabel("*Regole*");
	private JLabel text= new JLabel();
	private Font titleFont = new Font(null,Font.ROMAN_BASELINE,20);
	private Font textFont = new Font(null,Font.ITALIC,20);
	private JButton home= new JButton("HomePage");
	private RulesFrame frame;
	private RoundedBorder buttonsBorder = new RoundedBorder(10);
	
	RulesPanel(RulesFrame frame){
		this.frame=frame;
		setLabelProperties();
		setButtonProperties();
		setPanelProperties();
	}
	

	private void setButtonProperties() {
		home.setPreferredSize(new Dimension(100,30));
		home.setBounds(380, 420,100, 30);
		home.setFocusPainted(false);
		home.setContentAreaFilled(false);
		home.setBorder(buttonsBorder);
		//home.setFont(new Font(null, Font.PLAIN, 10));
		home.setForeground(Color.white);
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new HomeFrame();
				frame.dispose();
			}      	
        });
		home.setVisible(true);
	}

	private void setLabelProperties() {
		title.setBounds(185, 10, 150, 40);
		title.setForeground(Color.white);
		title.setFont(titleFont);
		text.setText("<html>Le regole sono semplici: il giocatore seleziona due tessere e preme il tasto conferma,<br> se le tessere sono diverse verranno rigirate mentre se sono uguali rimarranno scoperte;<br>il punteggio totale è dato dal numero delle 'giocate' totali</html>  ");
		text.setBounds(125, 60, 250, 200);
		text.setForeground(Color.white);
		title.setVisible(true);
		text.setVisible(true);
	}
	
	private void setPanelProperties() {
		this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);
        this.setLayout(null);
        this.add(home);
        this.add(title);
        this.add(text);
     
        this.setVisible(true);
	}
}