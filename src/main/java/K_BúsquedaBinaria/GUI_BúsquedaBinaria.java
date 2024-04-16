package K_BúsquedaBinaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI_BúsquedaBinaria extends JFrame {
    private JTextField textFieldPalabra;
    private JButton buttonSeleccionarArchivo;
    private JButton buttonBuscar;
    private JLabel labelArchivo;
    private BúsquedaBinaria búsquedaBinaria = new BúsquedaBinaria();
    private File archivo;

    public GUI_BúsquedaBinaria() {
        setLayout(new FlowLayout());

        add(new JLabel("Palabra a buscar:"));
        textFieldPalabra = new JTextField(20);
        add(textFieldPalabra);

        buttonSeleccionarArchivo = new JButton("Seleccionar archivo");
        add(buttonSeleccionarArchivo);

        labelArchivo = new JLabel("No se ha seleccionado ningún archivo");
        add(labelArchivo);

        buttonBuscar = new JButton("Buscar");
        add(buttonBuscar);

        event e = new event();
        buttonSeleccionarArchivo.addActionListener(e);
        buttonBuscar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (e.getSource() == buttonSeleccionarArchivo) {
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    archivo = fileChooser.getSelectedFile();
                    labelArchivo.setText("Archivo seleccionado: " + archivo.getPath());
                }
            } else if (e.getSource() == buttonBuscar) {
                if (archivo != null) {
                    String palabra = textFieldPalabra.getText();
                    try {
                        boolean encontrado = búsquedaBinaria.buscarPalabra(archivo.getPath(), palabra);
                        if (encontrado) {
                            JOptionPane.showMessageDialog(null, "La palabra '" + palabra + "' fue encontrada en el archivo.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La palabra '" + palabra + "' no fue encontrada en el archivo.");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al buscar la palabra: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona un archivo.");
                }
            }
        }
    }

    public static void main(String[] args) {
        GUI_BúsquedaBinaria gui = new GUI_BúsquedaBinaria();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Búsqueda de palabra en archivo");
    }
}