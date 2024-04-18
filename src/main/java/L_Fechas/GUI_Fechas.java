package L_Fechas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;

public class GUI_Fechas extends JFrame {
    private JTextField textFieldDia;
    private JTextField textFieldMes;
    private JTextField textFieldAno;
    private JButton buttonAgregar;
    private JButton buttonListar;
    private JTextArea textAreaFechas;
    private ArrayList<Fecha> fechas = new ArrayList<>();

    public GUI_Fechas() {
        setLayout(new FlowLayout());

        add(new JLabel("Día:"));
        textFieldDia = new JTextField(2);
        add(textFieldDia);

        add(new JLabel("Mes:"));
        textFieldMes = new JTextField(2);
        add(textFieldMes);

        add(new JLabel("Año:"));
        textFieldAno = new JTextField(4);
        add(textFieldAno);

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
                    int dia = Integer.parseInt(textFieldDia.getText());
                    int mes = Integer.parseInt(textFieldMes.getText());
                    int ano = Integer.parseInt(textFieldAno.getText());

                    // Verificar si la fecha es válida
                    LocalDate.of(ano, mes, dia);

                    Fecha fecha = new Fecha(dia, mes, ano);
                    fechas.add(fecha);

                    textFieldDia.setText("");
                    textFieldMes.setText("");
                    textFieldAno.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido para el día, mes y año.");
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "La fecha introducida no es válida.");
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