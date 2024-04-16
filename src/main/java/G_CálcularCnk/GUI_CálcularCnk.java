package G_CálcularCnk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_CálcularCnk extends JFrame {
    private JTextField textFieldN;
    private JTextField textFieldK;
    private JButton button;

    public GUI_CálcularCnk() {
        setLayout(new FlowLayout());

        add(new JLabel("Valor n:"));
        textFieldN = new JTextField(10);
        add(textFieldN);

        add(new JLabel("Valor k:"));
        textFieldK = new JTextField(10);
        add(textFieldK);

        button = new JButton("Calcular C(n, k)");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int n = Integer.parseInt(textFieldN.getText());
            int k = Integer.parseInt(textFieldK.getText());
            CálcularCnk calcularCnk = new CálcularCnk();
            int resultado = calcularCnk.calcularCnk(n, k);
            JOptionPane.showMessageDialog(null, "El valor de C(" + n + ", " + k + ") es " + resultado + ".");
        }
    }

    public static void main(String[] args) {
        GUI_CálcularCnk gui = new GUI_CálcularCnk();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Cálculo de C(n, k)");
    }
}