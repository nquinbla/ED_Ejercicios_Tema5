package H_BasesADN;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GUI_BasesADN extends JFrame {
    private JButton buttonGenerar;
    private JButton buttonContar;
    private JList<String> listADN;
    private DefaultListModel<String> listModel;
    private BasesADN basesADN = new BasesADN();
    private List<String> adnList = new ArrayList<>();

    public GUI_BasesADN() {
        setLayout(new FlowLayout());

        buttonGenerar = new JButton("Generar ADN");
        add(buttonGenerar);

        listModel = new DefaultListModel<>();
        listADN = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listADN);
        add(scrollPane);

        buttonContar = new JButton("Contar genes");
        add(buttonContar);

        event e = new event();
        buttonGenerar.addActionListener(e);
        buttonContar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonGenerar) {
                String adn = basesADN.generarADN(1000);  // Genera una cadena de ADN de longitud 1000
                adnList.add(adn);
                listModel.addElement(adn);
            } else if (e.getSource() == buttonContar) {
                int totalGenes = adnList.stream().mapToInt(basesADN::contarGenes).sum();
                JOptionPane.showMessageDialog(null, "Número total de genes en las cadenas de ADN: " + totalGenes);
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