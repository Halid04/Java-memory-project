package it.castelli.Memory.cardselection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import it.castelli.Memory.game.easy.EasyDifGameFrame;
import it.castelli.Memory.game.hard.HardDifGameFrame;
import it.castelli.Memory.game.medium.MediumDifGameFrame;
import it.castelli.Memory.resources.GameDifficulty;
import it.castelli.Memory.resources.ImageCategory;

/**
 * @see javax.swing.JPanel
 * @see javax.swing.JButton
 * @see javax.swing.JLabel
 * @see javax.swing.ImageIcon
 * @see java.awt.Image
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.awt.Font
 * @see it.castelli.Memory.cardselection.CardSelectionFrame
 * @see it.castelli.Memory.resources.GameDifficulty
 * @author Maltempi Elisabetta 4CI
 * @author Togni Claudio 4CI
 * @version 1.6
 */
@SuppressWarnings("serial")
public class CardSelectionPanel extends JPanel{
	private Dimension panelSize = new Dimension(500,250);
	private Color panelBackground = Color.black;
	private JButton art= new JButton();
	private JButton animal= new JButton();
	private JButton disney= new JButton();
	private JLabel title= new JLabel("selezionare: ");
	private ImageIcon artImage= new ImageIcon(new ImageIcon("src\\it\\castelli\\Memory\\resources\\Immagini\\art.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
	private ImageIcon animalImage= new ImageIcon(new ImageIcon("src\\it\\castelli\\Memory\\resources\\Immagini\\animal.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
	private ImageIcon DisneyImage= new ImageIcon(new ImageIcon("src\\it\\castelli\\Memory\\resources\\Immagini\\Disney.png").getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
	private GameDifficulty difficulty;
	private String username = null;
	private Dimension labelSize = new Dimension(200,20);
	private Font labelFont = new Font(null,Font.ROMAN_BASELINE,20);
	private Dimension buttonSize = new Dimension(100,100);
	private CardSelectionFrame frame;
	
	CardSelectionPanel(GameDifficulty difficulty, CardSelectionFrame frame){
		this.difficulty = difficulty;
		this.frame = frame;
		setLabelProperties();
		setButtonsProperties();
		setPanelProperties();
	}
	
	CardSelectionPanel(GameDifficulty difficulty, String username, CardSelectionFrame frame){
		this.difficulty = difficulty;
		this.username = username;
		this.frame = frame;
		setLabelProperties();
		setButtonsProperties();
		setPanelProperties();
	}
	
    private void setLabelProperties() {
    	title.setPreferredSize(labelSize);
        title.setFont(labelFont);
        title.setBounds(200,20,200,20);
        title.setForeground(Color.white);
    }
    
    private void setButtonsProperties() {
    	animal.setPreferredSize(buttonSize);
        animal.setBounds(82,75,100,100);
        animal.setBackground(Color.black);
        animal.setBorder(null);
        animal.setIcon(animalImage);
        animal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(difficulty) {
					case EASY:
						if(username != null) {
							new EasyDifGameFrame(true, username, ImageCategory.ANIMALS);
						}else {
							new EasyDifGameFrame(ImageCategory.ANIMALS);
						}
						break;
					case MEDIUM:
						if(username != null) {
							new MediumDifGameFrame(true, username, ImageCategory.ANIMALS);
						}else {
							new MediumDifGameFrame(ImageCategory.ANIMALS);
						}
						break;
					case HARD:
						if(username != null) {
							new HardDifGameFrame(true, username, ImageCategory.ANIMALS);
						}else {
							new HardDifGameFrame(ImageCategory.ANIMALS);
						}
						break;
				}
				frame.disposePage();
			}
        });
        animal.setVisible(true);

        art.setPreferredSize(buttonSize);
        art.setBounds(200,75,100,100);
        art.setBackground(Color.black);
        art.setBorder(null);
        art.setIcon(artImage);
        art.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(difficulty) {
					case EASY:
						if(username != null) {
							new EasyDifGameFrame(true, username, ImageCategory.ART);
						}else {
							new EasyDifGameFrame(ImageCategory.ART);
						}
						break;
					case MEDIUM:
						if(username != null) {
							new MediumDifGameFrame(true, username, ImageCategory.ART);
						}else {
							new MediumDifGameFrame(ImageCategory.ART);
						}
						break;
					case HARD:
						if(username != null) {
							new HardDifGameFrame(true, username, ImageCategory.ART);
						}else {
							new HardDifGameFrame(ImageCategory.ART);
						}
						break;
				}
				frame.disposePage();
			}
        });
        art.setVisible(true);

        disney.setPreferredSize(buttonSize);
        disney.setBounds(318,75,100,100);
        disney.setBackground(Color.black);
        disney.setBorder(null);
        disney.setIcon(DisneyImage);
        disney.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(difficulty) {
					case EASY:
						if(username != null) {
							new EasyDifGameFrame(true, username, ImageCategory.DISNEY);
						}else {
							new EasyDifGameFrame(ImageCategory.DISNEY);
						}
						break;
					case MEDIUM:
						if(username != null) {
							new MediumDifGameFrame(true, username, ImageCategory.DISNEY);
						}else {
							new MediumDifGameFrame(ImageCategory.DISNEY);
						}
						break;
					case HARD:
						if(username != null) {
							new HardDifGameFrame(true, username, ImageCategory.DISNEY);
						}else {
							new HardDifGameFrame(ImageCategory.DISNEY);
						}
						break;
				}
				frame.disposePage();
			}    	
        });
        disney.setVisible(true);
    }

    private void setPanelProperties() {
    	this.setPreferredSize(panelSize);
        this.setBackground(panelBackground);
        this.add(art);
        this.add(animal);
        this.add(disney);
        this.add(title);
        this.setLayout(null);
        this.setVisible(true);
    }
}