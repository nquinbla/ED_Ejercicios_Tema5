package C_CantidadDígitos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_CantidadDígitos extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public GUI_CantidadDígitos() {
        setLayout(new FlowLayout());

        label = new JLabel("Introduce un número:");
        add(label);

        textField = new JTextField(10);
        add(textField);

        button = new JButton("Contar dígitos");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(textField.getText());
            CantidadDígitos cd = new CantidadDígitos();
            int cantidad = cd.contarDigitos(num);
            JOptionPane.showMessageDialog(null, "El número " + num + " tiene " + cantidad + " dígitos.");
        }
    }

    public static void main(String[] args) {
        GUI_CantidadDígitos gui = new GUI_CantidadDígitos();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Cantidad de dígitos");
    }
}