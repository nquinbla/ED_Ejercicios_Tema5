package A_SumaNumNaturales;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_SumaNumNaturales extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public GUI_SumaNumNaturales() {
        setLayout(new FlowLayout());

        label = new JLabel("Introduce un número:");
        add(label);

        textField = new JTextField(10);
        add(textField);

        button = new JButton("Calcular suma");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(textField.getText());
            SumaNumNaturales fr = new SumaNumNaturales();
            int suma = fr.sumaRecursiva(num);
            JOptionPane.showMessageDialog(null, "La suma de los primeros " + num + " números naturales es " + suma);
        }
    }

    public static void main(String[] args) {
        GUI_SumaNumNaturales gui = new GUI_SumaNumNaturales();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Suma recursiva");
    }
}