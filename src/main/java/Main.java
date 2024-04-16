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
        // Crear un panel principal con BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        this.setContentPane(mainPanel);

        // Crear un panel para los botones con FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout());
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Crear un panel para los títulos con BoxLayout
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        mainPanel.add(titlePanel, BorderLayout.NORTH);

        // Crear los títulos y agregarlos al panel de títulos
        JLabel title = new JLabel("Ejercicios Unidad 5");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(title);

        JLabel subtitle = new JLabel("Algoritmia básica: ordenación y búsqueda");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 18));
        titlePanel.add(subtitle);
        setLayout(new FlowLayout());

        // Ajustar el tamaño de la ventana
        this.setSize(500, 500);

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
