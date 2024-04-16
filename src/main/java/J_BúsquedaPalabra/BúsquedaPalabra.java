package J_BúsquedaPalabra;

import java.io.*;
import java.util.*;

public class BúsquedaPalabra {
    public boolean buscarPalabra(String archivo, String palabra) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (Arrays.asList(linea.split("\\s+")).contains(palabra)) {
                    return true;
                }
            }
        }
        return false;
    }
}