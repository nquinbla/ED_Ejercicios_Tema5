import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JButton buttonSumaNumNaturales;
    private JButton buttonListaNumDosVal;
    private JButton buttonCantidadDigitos;
    private JButton buttonCalculoxy;
    private JButton buttonCadDigHex;
    private JButton buttonValMaxVector;
    private JButton buttonBasesADN;
    private JButton buttonOrdenarAlfabeticamente;
    private JButton buttonBusquedaPalabra;
    private JButton buttonBusquedaBinaria;
    private JButton buttonFechas;

    public Main() {
        // Configurar el marco principal
        setTitle("Ejericios Unidad 5");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new DecoPanel();
        this.setContentPane(panel);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        // Panel de títulos
        JPanel titlesPanel = new JPanel();
        titlesPanel.setLayout(new BoxLayout(titlesPanel, BoxLayout.Y_AXIS));
        titlesPanel.setOpaque(false);

        // Crear los títulos y agregarlos al panel de títulos
        JLabel title = new JLabel("Ejercicios Unidad 5");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlesPanel.add(title);

        JLabel subtitle = new JLabel("Algoritmia básica: ordenación y búsqueda");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 18));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlesPanel.add(subtitle);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(titlesPanel, gbc);

        // Panel de botones
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        buttonsPanel.setOpaque(false);

        // Crear los botones y agregarlos al panel de botones
        buttonSumaNumNaturales = new JButton("Suma de números naturales");
        buttonSumaNumNaturales.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonSumaNumNaturales);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // ... crear más botones ...

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonsPanel, gbc);

        event e = new event();
        buttonSumaNumNaturales.addActionListener(e);
        // ... agregar más listeners ...
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // ... el resto de tu código ...
        }
    }

    public static void main(String[] args) {
        prueba1 gui = new prueba1();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Main");
    }
}