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
        JLabel title = new JLabel("<html><font color='grey'>Ejercicios.</font><font color='grey'>de la.</font><font color='grey'>Unidad.</font><font color='blue'>5.</font></html>");
        title.setFont(new Font("Arial", Font.BOLD, 124));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlesPanel.add(title);

        JLabel subtitle = new JLabel("Algoritmia básica: ordenación y búsqueda");
        subtitle.setFont(new Font("Arial", Font.ITALIC, 44));
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

        buttonListaNumDosVal = new JButton("Lista de números entre dos valores");
        buttonListaNumDosVal.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonListaNumDosVal);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonCantidadDigitos = new JButton("Cantidad de dígitos");
        buttonCantidadDigitos.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonCantidadDigitos);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonCalculoxy = new JButton("Cálculo de x^y");
        buttonCalculoxy.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonCalculoxy);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonCadDigHex = new JButton("Conversión de hexadecimal a decimal");
        buttonCadDigHex.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonCadDigHex);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonValMaxVector = new JButton("Cálculo de x*y");
        buttonValMaxVector.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonValMaxVector);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBasesADN = new JButton("Generación y conteo de genes en ADN");
        buttonBasesADN.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBasesADN);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonOrdenarAlfabeticamente = new JButton("Ordenar archivo alfabéticamente");
        buttonOrdenarAlfabeticamente.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonOrdenarAlfabeticamente);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBusquedaPalabra = new JButton("Búsqueda de palabra en archivo");
        buttonBusquedaPalabra.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBusquedaPalabra);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBusquedaBinaria = new JButton("Búsqueda binaria en archivo");
        buttonBusquedaBinaria.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBusquedaBinaria);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonFechas = new JButton("Gestión de fechas");
        buttonFechas.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonFechas);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));





        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonsPanel, gbc);

        event e = new event();
        buttonSumaNumNaturales.addActionListener(e);
        buttonListaNumDosVal.addActionListener(e);
        buttonCantidadDigitos.addActionListener(e);
        buttonCalculoxy.addActionListener(e);
        buttonCadDigHex.addActionListener(e);
        buttonValMaxVector.addActionListener(e);
        buttonBasesADN.addActionListener(e);
        buttonOrdenarAlfabeticamente.addActionListener(e);
        buttonBusquedaPalabra.addActionListener(e);
        buttonBusquedaBinaria.addActionListener(e);
        buttonFechas.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonSumaNumNaturales) {
                A_SumaNumNaturales.GUI_SumaNumNaturales gui = new A_SumaNumNaturales.GUI_SumaNumNaturales();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Suma de números naturales");
            } else if (e.getSource() == buttonListaNumDosVal) {
                B_ListaNumDosVal.GUI_ListaNumDosVal gui = new B_ListaNumDosVal.GUI_ListaNumDosVal();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Lista de números entre dos valores");
            } else if (e.getSource() == buttonCantidadDigitos) {
                C_CantidadDígitos.GUI_CantidadDígitos gui = new C_CantidadDígitos.GUI_CantidadDígitos();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Cantidad de dígitos");
            } else if (e.getSource() == buttonCalculoxy) {
                D_Cálculoxy.GUI_Cálculoxy gui = new D_Cálculoxy.GUI_Cálculoxy();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Cálculo de x^y");
            } else if (e.getSource() == buttonCadDigHex) {
                F_CadDigHex.GUI_CadDigHex gui = new F_CadDigHex.GUI_CadDigHex();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Conversión de hexadecimal a decimal");
            } else if (e.getSource() == buttonValMaxVector) {
                E_ValMáxVector.GUI_ValMáxVector gui = new E_ValMáxVector.GUI_ValMáxVector();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Cálculo de x*y");
            } else if (e.getSource() == buttonBasesADN) {
                H_BasesADN.GUI_BasesADN gui = new H_BasesADN.GUI_BasesADN();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Generación y conteo de genes en ADN");
            } else if (e.getSource() == buttonOrdenarAlfabeticamente) {
                I_OrdenarAlfabeticamente.GUI_OrdenarAlfabeticamente gui = new I_OrdenarAlfabeticamente.GUI_OrdenarAlfabeticamente();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Ordenar archivo alfabéticamente");
            } else if (e.getSource() == buttonBusquedaPalabra) {
                J_BúsquedaPalabra.GUI_BúsquedaPalabra gui = new J_BúsquedaPalabra.GUI_BúsquedaPalabra();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Búsqueda de palabra en archivo");
            } else if (e.getSource() == buttonBusquedaBinaria) {
                K_BúsquedaBinaria.GUI_BúsquedaBinaria gui = new K_BúsquedaBinaria.GUI_BúsquedaBinaria();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Búsqueda binaria en archivo");
            } else if (e.getSource() == buttonFechas) {
                L_Fechas.GUI_Fechas gui = new L_Fechas.GUI_Fechas();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Gestión de fechas");
            }
        }
    }

        public static void main(String[] args) {
            prueba1 gui = new prueba1();
            gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gui.setVisible(true);
            gui.setTitle("Main");
        }
    }
