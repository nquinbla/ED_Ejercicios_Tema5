package L_Fechas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class GUI_Fechas extends JFrame {
    private JTextField textFieldFecha;
    private JButton buttonAgregar;
    private JButton buttonListar;
    private JTextArea textAreaFechas;
    private ArrayList<Fecha> fechas = new ArrayList<>();

    public GUI_Fechas() {
        setLayout(new FlowLayout());

        add(new JLabel("Fecha (dd/MM/yyyy):"));
        textFieldFecha = new JTextField(10);
        add(textFieldFecha);

        buttonAgregar = new JButton("Agregar fecha");
        add(buttonAgregar);

        buttonListar = new JButton("Listar fechas");
        add(buttonListar);

        textAreaFechas = new JTextArea(10, 20);
        textAreaFechas.setEditable(false);
        add(new JScrollPane(textAreaFechas));

        event e = new event();
        buttonAgregar.addActionListener(e);
        buttonListar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonAgregar) {
                try {
                    Fecha fecha = new Fecha(textFieldFecha.getText());
                    fechas.add(fecha);
                    textFieldFecha.setText("");
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Por favor, introduce la fecha en el formato dd/MM/yyyy.");
                }
            } else if (e.getSource() == buttonListar) {
                Collections.sort(fechas);
                textAreaFechas.setText("");
                for (Fecha fecha : fechas) {
                    textAreaFechas.append(fecha + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        GUI_Fechas gui = new GUI_Fechas();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Gestión de fechas");
    }
}