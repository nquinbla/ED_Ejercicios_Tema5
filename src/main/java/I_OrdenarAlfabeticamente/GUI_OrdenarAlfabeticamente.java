package I_OrdenarAlfabeticamente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI_OrdenarAlfabeticamente extends JFrame {
    private JButton buttonSeleccionarEntrada;
    private JButton buttonSeleccionarSalida;
    private JButton buttonOrdenar;
    private JLabel labelArchivoEntrada;
    private JLabel labelArchivoSalida;
    private OrdenarAlfabeticamente ordenarAlfabeticamente = new OrdenarAlfabeticamente();
    private File archivoEntrada;
    private File archivoSalida;

    public GUI_OrdenarAlfabeticamente() {
        setLayout(new FlowLayout());

        buttonSeleccionarEntrada = new JButton("Seleccionar archivo de entrada");
        add(buttonSeleccionarEntrada);

        labelArchivoEntrada = new JLabel("No se ha seleccionado ningún archivo de entrada");
        add(labelArchivoEntrada);

        buttonSeleccionarSalida = new JButton("Seleccionar archivo de salida");
        add(buttonSeleccionarSalida);

        labelArchivoSalida = new JLabel("No se ha seleccionado ningún archivo de salida");
        add(labelArchivoSalida);

        buttonOrdenar = new JButton("Ordenar");
        add(buttonOrdenar);

        event e = new event();
        buttonSeleccionarEntrada.addActionListener(e);
        buttonSeleccionarSalida.addActionListener(e);
        buttonOrdenar.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            if (e.getSource() == buttonSeleccionarEntrada) {
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    archivoEntrada = fileChooser.getSelectedFile();
                    labelArchivoEntrada.setText("Archivo de entrada seleccionado: " + archivoEntrada.getPath());
                }
            } else if (e.getSource() == buttonSeleccionarSalida) {
                if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                    archivoSalida = fileChooser.getSelectedFile();
                    labelArchivoSalida.setText("Archivo de salida seleccionado: " + archivoSalida.getPath());
                }
            } else if (e.getSource() == buttonOrdenar) {
                if (archivoEntrada != null && archivoSalida != null) {
                    try {
                        ordenarAlfabeticamente.ordenarArchivo(archivoEntrada.getPath(), archivoSalida.getPath());
                        JOptionPane.showMessageDialog(null, "Archivo ordenado con éxito.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al ordenar el archivo: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona los archivos de entrada y salida.");
                }
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