package H_BasesADN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_BasesADN extends JFrame {
    private JButton buttonGenerar;
    private JButton buttonContar;
    private JLabel labelADN;
    private BasesADN basesADN = new BasesADN();
    private String adn;

    public GUI_BasesADN() {
        setLayout(new FlowLayout());

        buttonGenerar = new JButton("Generar ADN");
        add(buttonGenerar);

        labelADN = new JLabel();
        add(labelADN);

        buttonContar = new JButton("Contar genes");
        add(buttonContar);

        event e = new event();
        buttonGenerar.addActionListener(e);
        buttonContar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonGenerar) {
                adn = basesADN.generarADN(1000);  // Genera una cadena de ADN de longitud 1000
                labelADN.setText("ADN generado: " + adn);
            } else if (e.getSource() == buttonContar) {
                int count = basesADN.contarGenes(adn);
                JOptionPane.showMessageDialog(null, "Número de genes en la cadena de ADN: " + count);
            }
        }
    }

    public static void main(String[] args) {
        GUI_BasesADN gui = new GUI_BasesADN();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Generación y conteo de genes en ADN");
    }
}