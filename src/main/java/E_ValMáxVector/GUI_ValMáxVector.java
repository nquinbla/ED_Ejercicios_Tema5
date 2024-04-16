package E_ValMáxVector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_ValMáxVector extends JFrame {
    private JTextField textFieldX;
    private JTextField textFieldY;
    private JButton button;
    private JLabel label;

    public GUI_ValMáxVector() {
        setLayout(new FlowLayout());

        add(new JLabel("Valor x:"));
        textFieldX = new JTextField(10);
        add(textFieldX);

        add(new JLabel("Valor y:"));
        textFieldY = new JTextField(10);
        add(textFieldY);

        button = new JButton("Calcular x*y");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int x = Integer.parseInt(textFieldX.getText());
            int y = Integer.parseInt(textFieldY.getText());
            ValMáxVector valMáxVector = new ValMáxVector();
            int resultado = valMáxVector.calcularMultiplicacion(x, y);
            JOptionPane.showMessageDialog(null, "El resultado de " + x + "*" + y + " es " + resultado + ".");
        }
    }

    public static void main(String[] args) {
        GUI_ValMáxVector gui = new GUI_ValMáxVector();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Cálculo de x*y");
    }
}