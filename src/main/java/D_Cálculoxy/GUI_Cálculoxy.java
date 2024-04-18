package D_Cálculoxy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Cálculoxy extends JFrame {
    private JTextField textFieldX;
    private JTextField textFieldY;
    private JButton button;
    private JLabel label;

    public GUI_Cálculoxy() {
        setLayout(new FlowLayout());

        add(new JLabel("Valor x:"));
        textFieldX = new JTextField(10);
        add(textFieldX);

        add(new JLabel("Valor y:"));
        textFieldY = new JTextField(10);
        add(textFieldY);

        button = new JButton("Calcular x^y");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double x = Double.parseDouble(textFieldX.getText());
                double y = Double.parseDouble(textFieldY.getText());
                Cálculoxy cálculo = new Cálculoxy();
                double resultado = cálculo.calcularPotencia((int) x, (int) y);
                JOptionPane.showMessageDialog(null, "El resultado de la operación es " + resultado);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
            }
        }
    }

    public static void main(String[] args) {
        GUI_Cálculoxy gui = new GUI_Cálculoxy();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Cálculo de x^y");
    }
}