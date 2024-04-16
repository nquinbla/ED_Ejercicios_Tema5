package H_BasesADN;

import java.util.Random;

public class BasesADN {
    private static final String[] BASES = {"A", "T", "G", "C"};
    private static final Random RANDOM = new Random();

    public String generarADN(int longitud) {
        StringBuilder adn = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            adn.append(BASES[RANDOM.nextInt(BASES.length)]);
        }
        return adn.toString();
    }

    public int contarGenes(String adn) {
        int count = 0;
        int index = adn.indexOf("ATG");
        while (index != -1) {
            count++;
            index = adn.indexOf("ATG", index + 1);
        }
        return count;
    }
}