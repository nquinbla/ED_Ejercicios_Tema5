package L_Fechas;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GUI_Fechas extends JFrame {
    private List<Fecha> fechas;
    private JTextField diaField;
    private JTextField mesField;
    private JTextField añoField;
    private JTextArea textArea;

    public GUI_Fechas() {
        this.fechas = new ArrayList<>();

        setTitle("Gestión de Fechas \uD83D\uDDD3\uFE0F\u200B");
        setSize(400, 190);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        diaField = new JTextField(2);
        mesField = new JTextField(2);
        añoField = new JTextField(4);
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Crear el panel con BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dia = Integer.parseInt(diaField.getText());
                int mes = Integer.parseInt(mesField.getText());
                int año = Integer.parseInt(añoField.getText());
                Fecha fecha = new Fecha(dia, mes, año);
                if (fecha.esValida()) {
                    fechas.add(fecha);
                    diaField.setText("");
                    mesField.setText("");
                    añoField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton listarButton = new JButton("Listar");
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(fechas);
                textArea.setText("");
                for (Fecha fecha : fechas) {
                    textArea.append(fecha + "\n");
                }
            }
        });

        add(new JLabel("Día:"));
        add(diaField);
        add(new JLabel("Mes:"));
        add(mesField);
        add(new JLabel("Año:"));
        add(añoField);
        add(agregarButton);
        add(listarButton);
        add(scrollPane);
    }

    private class Fecha implements Comparable<Fecha> {
        private int dia;
        private int mes;
        private int año;

        public Fecha(int dia, int mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }

        public boolean esValida() {
            if (mes < 1 || mes > 12) {
                return false;
            }
            if (dia < 1 || dia > 31) {
                return false;
            }
            if (mes == 2) {
                if (esBisiesto() && dia > 29) {
                    return false;
                } else if (!esBisiesto() && dia > 28) {
                    return false;
                }
            }
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                return false;
            }
            return true;
        }

        private boolean esBisiesto() {
            return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
        }

        @Override
        public int compareTo(Fecha otraFecha) {
            if (this.año != otraFecha.año) {
                return this.año - otraFecha.año;
            } else if (this.mes != otraFecha.mes) {
                return this.mes - otraFecha.mes;
            } else {
                return this.dia - otraFecha.dia;
            }
        }

        @Override
        public String toString() {
            return dia + "/" + mes + "/" + año;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI_Fechas().setVisible(true);
            }
        });
    }
}