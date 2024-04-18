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

        Color colorMarcoPrincipal = new Color(110, 180, 250, 98); // Azul raro
        getContentPane().setBackground(colorMarcoPrincipal); // Establece el color de fondo del marco principal

        // Configurar el marco principal
        setTitle("Ejericios Unidad 5");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new DecoPanel();
        this.setContentPane(panel);
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panel.setOpaque(false); // Hacer que panelPrincipal sea
        panel.setPreferredSize(new Dimension(getWidth(), getHeight())); // Establecer el tamaño del panel igual al del marco principal

        // Configurar restricciones para el diseño de cuadrícula
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 1.0; // Dar a todos los componentes el mismo espacio horizontal
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes
        gbc.anchor = GridBagConstraints.CENTER; // Centrar los componentes en su celda

        // Crear un panel para los títulos y subtítulos
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setOpaque(false); // Hacer que el panel sea transparente

        // Crear los títulos y agregarlos al panel de títulos
        JLabel title = new JLabel("Ejercicios Unidad 5");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el título
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 0;
        panel.add(title, BorderLayout.NORTH); // Specify the area

        JLabel subtitle = new JLabel("Algoritmia básica: ordenación y búsqueda");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el título
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 0;
        panel.add(subtitle, BorderLayout.CENTER); // Specify the area

        setLayout(new FlowLayout());

        buttonSumaNumNaturales = new JButton("Suma de números naturales");
        add(buttonSumaNumNaturales);

        buttonListaNumDosVal = new JButton("Lista de números entre dos valores");
        add(buttonListaNumDosVal);

        buttonCantidadDigitos = new JButton("Cantidad de dígitos");
        add(buttonCantidadDigitos);

        buttonCalculoxy = new JButton("Cálculo de x^y");
        add(buttonCalculoxy);

        buttonCadDigHex = new JButton("Conversión de hexadecimal a decimal");
        add(buttonCadDigHex);

        buttonValMaxVector = new JButton("Cálculo de x*y");
        add(buttonValMaxVector);

        buttonBasesADN = new JButton("Generación y conteo de genes en ADN");
        add(buttonBasesADN);

        buttonOrdenarAlfabeticamente = new JButton("Ordenar archivo alfabéticamente");
        add(buttonOrdenarAlfabeticamente);

        buttonBusquedaPalabra = new JButton("Búsqueda de palabra en archivo");
        add(buttonBusquedaPalabra);

        buttonBusquedaBinaria = new JButton("Búsqueda binaria en archivo");
        add(buttonBusquedaBinaria);

        buttonFechas = new JButton("Gestión de fechas");
        add(buttonFechas);

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
        Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Main");
    }
}
