package I_OrdenarAlfabeticamente;

import java.io.*;
import java.util.*;

public class OrdenarAlfabeticamente {
    public void ordenarArchivo(String archivoEntrada, String archivoSalida) throws IOException {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        }
        Collections.sort(lineas);
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoSalida))) {
            for (String linea : lineas) {
                writer.println(linea);
            }
        }
    }
}