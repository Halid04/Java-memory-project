package it.castelli.Memory.home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import it.castelli.Memory.cardselection.CardSelectionFrame;
import it.castelli.Memory.resources.GameDifficulty;
import it.castelli.Memory.resources.styles.RoundedBorder;
import it.castelli.Memory.stats.MemoryStatistic;
import it.castelli.Memory.usr.LoginFrame;
import it.castelli.Memory.usr.RulesFrame;
import it.castelli.Memory.usr.SignupFrame;

/**
 * The HomePanel class creates the panel containing<br>
 * buttons to start the game with different levels of difficulty,<br>
 * as well as buttons for user login and registration.<br>
 * Extends <b>JPanel</b><br><br>
 * Constructors:
 * <ul>
 * 	<li>HomePanel(frame : HomeFrame)</li>
 * 	<li>HomePanel(frame : HomeFrame, loggedIn : boolean, username : String)</li>
 * </ul>
 * Methods:
 * <ul>
 * 	<li>setLabelProperties : private void</li>
 * 	<li>setButtonsProperties : private void</li>
 * 	<li>setPanelProperties : private void</li>
 * 	<li>toggleVisibility(visibility : boolean) : private void</li>
 * </ul>
 * Attributes:
 * <ul>
 * 	<li>easy : private JButton</li>
 * 	<li>medium : private JButton</li>
 * 	<li>hard : private JButton</li>
 * 	<li>menu : private JButton</li>
 * 	<li>profile : private JButton</li>
 * 	<li>title : private JLabel</li>
 * 	<li>frame : private HomeFrame</li>
 * 	<li>labelFont : private Font</li>
 * 	<li>labelSize : private Dimension</li>
 * 	<li>panelSize : private Dimension</li>
 * 	<li>buttonsBorder : private RoundedBorder</li>
 * 	<li>buttonsSize : private Dimension</li>
 * 	<li>loggedIn : private boolean</li>
 * 	<li>username : private String</li>
 * </ul>
 * @see javax.swing.JPanel
 * @see javax.swing.JLabel
 * @see javax.swing.JButton
 * @see java.awt.Color
 * @see java.awt.Dimension
 * @see java.awt.Font
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see it.castelli.Memory.home.HomeFrame
 * @see it.castelli.Memory.resources.styles.RoundedBorder
 * @see it.castelli.Memory.usr.LoginFrame
 * @see it.castelli.Memory.usr.SignupFrame
 * @see it.castelli.Memory.cardselection.CardSelectionFrame
 * @author Maltempi Elisabetta 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class HomePanel extends JPanel{
	private JButton easy = new JButton("Easy");
	private JButton medium = new JButton("Medium");
	private JButton hard = new JButton("Hard");
	private JButton menu = new JButton("Menu");
	private JButton profile = new JButton("Profile");
	private JLabel title = new JLabel("Seleziona una difficoltà");
	private HomeFrame frame;
	private Font labelFont = new Font(null,Font.PLAIN,18);
	private Dimension labelSize = new Dimension(200,18);
	private Dimension panelSize = new Dimension(500,470);
	private RoundedBorder buttonsBorder = new RoundedBorder(10);
	private Dimension buttonsSize = new Dimension(80,20);
	private String username = "";
	private boolean loggedIn = false;
	private JPanel menuPanel= new JPanel();
	private JButton rules= new JButton("Rules");
	private JButton login = new JButton("Login");
	private JButton signup= new JButton("Signup");

	/**
	 * HomePage Panel constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li>setLabelProperties</li>
	 * 	<li>setButtonsProperties</li>
	 * 	<li>setPanelProperties</li>
	 * </ul>
	 * @param frame : HomeFrame
	 * @see it.castelli.Memory.home.HomeFrame
	 */
	public HomePanel(HomeFrame frame) {
		this.frame = frame;
		setLabelProperties();
		setButtonsProperties();
		setPanelProperties();
	}
	
	/**
	 * HomePage Panel constructor<br><br>
	 * Methods:
	 * <ul>
	 * 	<li></li>
	 * </ul>
	 * @param frame : HomeFrame
	 * @param loggedIn : boolean
	 * @param username : String
	 * @see it.castelli.Memory.home.HomeFrame
	 */
	public HomePanel(HomeFrame frame, boolean loggedIn, String username) {
		this.loggedIn = loggedIn;
		this.username = username;
		this.frame = frame;
		setLabelProperties();
		setButtonsProperties();
		setPanelProperties();
	}

	/**
	 * This method sets the properties of the JLabel 'title'.<br>
	 * It sets the font, foreground color, bounds, preferred size, and visibility.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setFont</b></li>
	 * 	<li><b>setForeground</b></li>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * @see javax.swing.JLabel
	 * @see java.awt.Font
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 */
	private void setLabelProperties() {
		title.setFont(labelFont);
        title.setForeground(Color.white);
        title.setBounds(150,80,200,18);
        title.setPreferredSize(labelSize);
        title.setVisible(true);
	}
	
	/**
	 * This method sets the properties of the JButtons 'easy', 'medium', 'hard',<br>
	 * 'menu', and 'profile'. It sets the text, font, background color, bounds<br>
	 * and adds an ActionListener to them<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>setBorder</b></li>
	 * 	<li><b>setForeground</b></li>
	 * 	<li><b>setBounds</b></li>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setContentAreaFilled</b></li>
	 * 	<li><b>setFocusPainted</b></li>
	 * 	<li><b>addActionListener</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * Buttons:
	 * <ul>
	 * 	<li><b>easy</b></li>
	 * 	<li><b>medium</b></li>
	 * 	<li><b>hard</b></li>
	 * 	<li><b>menu</b></li>
	 * 	<li><b>profile</b></li>
	 * </ul>
	 * @see javax.swing.JButton
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 * @see java.awt.event.ActionListener
	 * @see java.awt.event.ActionEvent
	 * @see it.castelli.Memory.resources.styles.RoundedBorder
	 * @see it.castelli.Memory.resources.GameDifficulty
	 */
	private void setButtonsProperties() {
		//EasyDiff. Game Button
		easy.setPreferredSize(buttonsSize);
        easy.setBounds(200,130,80,20);
        easy.setForeground(new Color(5, 237, 144));
        easy.setContentAreaFilled(false);
        easy.setFocusPainted(false);
        easy.setBorder(buttonsBorder);
        easy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(loggedIn) {
					new CardSelectionFrame(GameDifficulty.EASY, username);
				}else {
					new CardSelectionFrame(GameDifficulty.EASY);
				}
				frame.dispose();
			}      	
        });
        easy.setVisible(true);
        
        //MediumDiff. Game Button
        medium.setPreferredSize(buttonsSize);
        medium.setBounds(200,200,80,20);
        medium.setForeground(new Color(255,152,0));
        medium.setContentAreaFilled(false);
        medium.setFocusPainted(false);
        medium.setBorder(buttonsBorder);
        medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(loggedIn) {
					new CardSelectionFrame(GameDifficulty.MEDIUM, username);
				}else {
					new CardSelectionFrame(GameDifficulty.MEDIUM);
				}
				frame.dispose();
			}      	
        });
        medium.setVisible(true);
        
        //HardDiff. Game Button
        hard.setPreferredSize(buttonsSize);
        hard.setBounds(200,270,80,20);
        hard.setForeground(new Color(168, 5, 5));
        hard.setContentAreaFilled(false);
        hard.setFocusPainted(false);
        hard.setBorder(buttonsBorder);
        hard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(loggedIn) {
					new CardSelectionFrame(GameDifficulty.HARD, username);
				}else {
					new CardSelectionFrame(GameDifficulty.HARD);
				}
				frame.dispose();
			}      	
        });
        hard.setVisible(true);
        
        //Menu Button
        menu.setBounds(5,5,80,20);
        menu.setPreferredSize(buttonsSize);
        menu.setForeground(Color.white);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setBorder(buttonsBorder);
        menu.setVisible(true);
        menu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuPanel.setPreferredSize(new Dimension(200,470));
				menuPanel.setBounds(0, 0, 200, 470);
				menuPanel.setLayout(null);
				//menu.setBounds(205, 5, 80, 20);
				menu.setVisible(false);
				
				rules.setPreferredSize(new Dimension(200,40));
				//rules.setBorder(buttonsBorder);
				rules.setFocusPainted(false);
				rules.setBounds(0,0, 200, 40);
				rules.setVisible(true);
		        rules.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new RulesFrame();
						frame.dispose();

					}      	
		        });
		        
				login.setPreferredSize(new Dimension(200,40));
				//login.setBorder(buttonsBorder);
				login.setFocusPainted(false);
				login.setBounds(0,40, 200, 40);
				login.setVisible(true);
		        login.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new LoginFrame();
						frame.dispose();

					}      	
		        });
		        
				signup.setPreferredSize(new Dimension(200,40));
				//signup.setBorder(buttonsBorder);
				signup.setFocusPainted(false);
				signup.setForeground(getBackground());
				signup.setBounds(0,80, 200, 40);
				signup.setVisible(true);
		        signup.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new SignupFrame();
						frame.dispose();

					}      	
		        });
		        
				menuPanel.add(rules);
				menuPanel.add(login);
				menuPanel.add(signup);
				menuPanel.setVisible(true);
			}      	
        });
        
        //Account Button
        profile.setBounds(400,5,80,20);
        profile.setPreferredSize(buttonsSize);
        profile.setForeground(Color.white);
        profile.setContentAreaFilled(false);
        profile.setFocusPainted(false);
        profile.setBorder(buttonsBorder);
        profile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MemoryStatistic(username);
				frame.disposePage();
			}	
        });
        profile.setVisible(true);
	}

	/**
	 * This method sets the properties of the HomePanel.<br>
	 * It sets the background color, layout, and adds the JButtons and JLabel to it.<br><br>
	 * Methods used:
	 * <ul>
	 * 	<li><b>add</b></li>
	 * 	<li><b>setPreferredSize</b></li>
	 * 	<li><b>setBackground</b></li>
	 * 	<li><b>setLayout</b></li>
	 * 	<li><b>setVisible</b></li>
	 * </ul>
	 * @see javax.swing.JPanel
	 * @see javax.swing.JButton
	 * @see javax.swing.JLabel
	 * @see java.awt.Dimension
	 * @see java.awt.Color
	 */
	private void setPanelProperties() {
		this.setPreferredSize(panelSize);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        
        this.add(title);
        if (loggedIn){
			this.add(profile);
		}     
        this.add(menu);
        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.add(menuPanel);

        this.setVisible(true);
	}
	
	public void toggleVisibility(boolean visibility) {
		this.setVisible(visibility);
	}

}
