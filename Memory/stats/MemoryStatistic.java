package it.castelli.Memory.stats;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Cisse Halid 4CI
 * @version 1.7
 */
@SuppressWarnings("serial")
public class MemoryStatistic extends JFrame {
    private JFrame frame = new JFrame("Statistiche");
    private JPanel panel = new JPanel();
    private JLabel mediaTentavi = new JLabel("");
    private JLabel numPartiteFacili = new JLabel("");
    private JLabel numPartiteMedio = new JLabel("");
    private JLabel numPartiteDifficili = new JLabel("");

    public MemoryStatistic(String username) {
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(Color.BLACK);

        mediaTentavi.setForeground(Color.WHITE);
        mediaTentavi.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        numPartiteFacili.setForeground(Color.WHITE);
        numPartiteFacili.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        numPartiteMedio.setForeground(Color.WHITE);
        numPartiteMedio.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        numPartiteDifficili.setForeground(Color.WHITE);
        numPartiteDifficili.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        Object[][] staticheFinali = null;
        try {
            //togni non dimenticare di cambiare il file path, al posto del nome utente "halid", metti quello del profilo loggato
            staticheFinali = getStatistiche("src\\it\\castelli\\Memory\\usr\\Stats.txt", username);

            mediaTentavi.setText("Media tentativi: " + String.format("%.2f", (Double)staticheFinali[0][0]));
            numPartiteFacili.setText("Partite Easy fatte: " + staticheFinali[0][1]);
            numPartiteMedio.setText("Partite Medium fatte: " + staticheFinali[0][2]);
            numPartiteDifficili.setText("Partite Hard fatte: " + staticheFinali[0][3]);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "La felicita, un bicchiere di vino con un panino, la felicita...", JOptionPane.ERROR_MESSAGE);
        }

        panel.add(mediaTentavi);
        panel.add(numPartiteFacili);
        panel.add(numPartiteMedio);
        panel.add(numPartiteDifficili);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static Object[][] getStatistiche(String filePath, String nomeUtente) throws IOException {
        File file = new File(filePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String linee;
        int numPartite = 0;
        int totTentativi = 0;
        int numFacili = 0;
        int numMedie = 0;
        int numDifficili = 0;
        while ((linee = bufferedReader.readLine()) != null) {
            String[] stats = linee.split(",");
            String user = stats[0];
            if (user.equals(nomeUtente)) {
                int tentativi = Integer.parseInt(stats[2]);
                totTentativi += tentativi;
                numPartite++;
                String difficolta = stats[1];
                if (difficolta.equals("Easy")) {
                    numFacili++;
                } else if (difficolta.equals("Medium")) {
                    numMedie++;
                } else if (difficolta.equals("Hard")) {
                    numDifficili++;
                }
            }
        }
        bufferedReader.close();

        Object[][] dati = new Object[numPartite][3];
        bufferedReader = new BufferedReader(new FileReader(file));
        int righe = 0;
        while ((linee = bufferedReader.readLine()) != null) {
            String[] stat = linee.split(",");
            String user = stat[0];
            if (user.equals(nomeUtente)) {
                String difficolta = stat[1];
                int tentativi = Integer.parseInt(stat[2]);
                dati[righe][0] = difficolta;
                dati[righe][1] = tentativi;
                righe++;
            }
        }
        bufferedReader.close();

        double mediaTentativi = Math.round((double) totTentativi / (double) numPartite);

        Object[][] statistiche = new Object[1][4];
        statistiche[0][0] = mediaTentativi;
        statistiche[0][1] = numFacili;
        statistiche[0][2] = numMedie;
        statistiche[0][3] = numDifficili;
        return statistiche;
    }
}