package F_ValMáxVectCompNum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_ValMáxVectCompNum extends JFrame {
    private JTextField textFieldHex;
    private JButton button;

    public GUI_ValMáxVectCompNum() {
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
            ValMáxVectCompNum hexToDec = new ValMáxVectCompNum();
            int resultado = hexToDec.ValMáxVectCompNum(hex, hex.length());
            JOptionPane.showMessageDialog(null, "El valor decimal de " + hex + " es " + resultado + ".");
        }
    }

    public static void main(String[] args) {
        GUI_ValMáxVectCompNum gui = new GUI_ValMáxVectCompNum();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Conversión de hexadecimal a decimal");
    }
}