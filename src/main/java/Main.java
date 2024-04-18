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
        setSize(1000, 760);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new DecoPanel();
        this.setContentPane(panel);
        panel.setBackground(Color.decode("#C1D0DB")); // Color azul claro

        GridBagConstraints gbc = new GridBagConstraints();

        // Panel de títulos
        JPanel titlesPanel = new JPanel();
        titlesPanel.setLayout(new BoxLayout(titlesPanel, BoxLayout.Y_AXIS));
        titlesPanel.setOpaque(false);

        // Crear los títulos y agregarlos al panel de títulos
        JLabel title = new JLabel("<html><font color='grey'>U</font><font color='grey'>A</font><font color='blue'>X</font></html>");
        title.setFont(new Font("Arial", Font.BOLD, 105));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlesPanel.add(Box.createHorizontalGlue()); // Agregar espacio flexible antes del título
        titlesPanel.add(title);
        titlesPanel.add(Box.createHorizontalGlue()); // Agregar espacio flexible después del título

        JLabel subtitle1 = new JLabel("Ejercicios de la Unidad 5");
        subtitle1.setFont(new Font("Arial", Font.BOLD, 28));
        subtitle1.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitle1.setPreferredSize(new Dimension(1000, subtitle1.getPreferredSize().height));
        titlesPanel.add(subtitle1);

        JLabel subtitle2 = new JLabel("Algoritmia básica: ordenación y búsqueda");
        subtitle2.setFont(new Font("Arial", Font.BOLD, 34));
        subtitle2.setAlignmentX(Component.CENTER_ALIGNMENT);
// Aumentar la altura preferida
        subtitle2.setPreferredSize(new Dimension(1000, subtitle2.getPreferredSize().height + 10));
        titlesPanel.add(subtitle2);

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
        buttonSumaNumNaturales = new JButton("Suma de naturales");
        buttonSumaNumNaturales.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonSumaNumNaturales);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonListaNumDosVal = new JButton("Lista de números");
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

        buttonCadDigHex = new JButton("Hex a decimal");
        buttonCadDigHex.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonCadDigHex);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonValMaxVector = new JButton("Cálculo de x*y");
        buttonValMaxVector.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonValMaxVector);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBasesADN = new JButton("Genes en ADN");
        buttonBasesADN.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBasesADN);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonOrdenarAlfabeticamente = new JButton("Ordenar alfabéticamente");
        buttonOrdenarAlfabeticamente.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonOrdenarAlfabeticamente);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBusquedaPalabra = new JButton("Búsqueda de palabra");
        buttonBusquedaPalabra.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBusquedaPalabra);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonBusquedaBinaria = new JButton("Búsqueda binaria");
        buttonBusquedaBinaria.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonBusquedaBinaria);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        buttonFechas = new JButton("Gestión de fechas");
        buttonFechas.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(buttonFechas);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Crear un JScrollPane y agregar el panel de botones a él
        JScrollPane scrollPane = new JScrollPane(buttonsPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

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
                gui.setTitle("Suma de naturales");
            } else if (e.getSource() == buttonListaNumDosVal) {
                B_ListaNumDosVal.GUI_ListaNumDosVal gui = new B_ListaNumDosVal.GUI_ListaNumDosVal();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Lista de números");
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
                gui.setTitle("Hexl a decimal");
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
                gui.setTitle("Genes en ADN");
            } else if (e.getSource() == buttonOrdenarAlfabeticamente) {
                I_OrdenarAlfabeticamente.GUI_OrdenarAlfabeticamente gui = new I_OrdenarAlfabeticamente.GUI_OrdenarAlfabeticamente();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Ordenar alfabéticamente");
            } else if (e.getSource() == buttonBusquedaPalabra) {
                J_BúsquedaPalabra.GUI_BúsquedaPalabra gui = new J_BúsquedaPalabra.GUI_BúsquedaPalabra();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Búsqueda de palabras");
            } else if (e.getSource() == buttonBusquedaBinaria) {
                K_BúsquedaBinaria.GUI_BúsquedaBinaria gui = new K_BúsquedaBinaria.GUI_BúsquedaBinaria();
                gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();
                gui.setTitle("Búsqueda binaria");
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
            Main gui = new Main();
            gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gui.setVisible(true);
            gui.setTitle("Main");
        }
    }
