package K_BúsquedaBinaria;

import java.io.*;
import java.util.*;

public class BúsquedaBinaria {
    public boolean buscarPalabra(String archivo, String palabra) throws IOException {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        }
        return Collections.binarySearch(lineas, palabra) >= 0;
    }
}