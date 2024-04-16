package B_ListaNumDosVal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_ListaNumDosVal extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldD;
    private JButton button;
    private JTextArea textArea;

    public GUI_ListaNumDosVal() {
        setLayout(new FlowLayout());

        add(new JLabel("Valor a:"));
        textFieldA = new JTextField(10);
        add(textFieldA);

        add(new JLabel("Valor d:"));
        textFieldD = new JTextField(10);
        add(textFieldD);

        button = new JButton("Imprimir números");
        add(button);

        textArea = new JTextArea(5, 20);
        add(new JScrollPane(textArea));

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(textFieldA.getText());
            int d = Integer.parseInt(textFieldD.getText());
            ListaNumDosVal lndv = new ListaNumDosVal();
            textArea.setText("");
            imprimirNumerosEnTextArea(a, d, lndv);
        }

        private void imprimirNumerosEnTextArea(int a, int d, ListaNumDosVal lndv) {
            if (a <= d) {
                textArea.append(a + "\n");
                imprimirNumerosEnTextArea(a + 1, d, lndv);
            }
        }
    }

    public static void main(String[] args) {
        GUI_ListaNumDosVal gui = new GUI_ListaNumDosVal();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Lista de números entre dos valores");
    }
}