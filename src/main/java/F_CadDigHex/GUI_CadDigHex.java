package F_CadDigHex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_CadDigHex extends JFrame {
    private JTextField textFieldHex;
    private JButton button;

    public GUI_CadDigHex() {
        setLayout(new FlowLayout());

        add(new JLabel("Valor hexadecimal:"));
        textFieldHex = new JTextField(10);
        add(textFieldHex);

        button = new JButton("Convertir a decimal");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String hex = textFieldHex.getText();
            CadDigHex hexToDec = new CadDigHex();
            int resultado = hexToDec.CadDigHex(hex, hex.length());
            JOptionPane.showMessageDialog(null, "El valor decimal de " + hex + " es " + resultado + ".");
        }
    }

    public static void main(String[] args) {
        GUI_CadDigHex gui = new GUI_CadDigHex();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Conversión de hexadecimal a decimal");
    }
}