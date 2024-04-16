package I_OrdenarAlfabeticamente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_OrdenarAlfabeticamente extends JFrame {
    private JTextField textFieldEntrada;
    private JTextField textFieldSalida;
    private JButton buttonOrdenar;
    private OrdenarAlfabeticamente ordenarAlfabeticamente = new OrdenarAlfabeticamente();

    public GUI_OrdenarAlfabeticamente() {
        setLayout(new FlowLayout());

        add(new JLabel("Archivo de entrada:"));
        textFieldEntrada = new JTextField(20);
        add(textFieldEntrada);

        add(new JLabel("Archivo de salida:"));
        textFieldSalida = new JTextField(20);
        add(textFieldSalida);

        buttonOrdenar = new JButton("Ordenar");
        add(buttonOrdenar);

        event e = new event();
        buttonOrdenar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String archivoEntrada = textFieldEntrada.getText();
            String archivoSalida = textFieldSalida.getText();
            try {
                ordenarAlfabeticamente.ordenarArchivo(archivoEntrada, archivoSalida);
                JOptionPane.showMessageDialog(null, "Archivo ordenado con éxito.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al ordenar el archivo: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        GUI_OrdenarAlfabeticamente gui = new GUI_OrdenarAlfabeticamente();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Ordenar archivo alfabéticamente");
    }
}