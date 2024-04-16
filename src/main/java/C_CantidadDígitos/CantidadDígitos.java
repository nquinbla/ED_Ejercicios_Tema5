package C_CantidadDígitos;

public class CantidadDígitos {
    public int contarDigitos(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(num / 10);
        }
    }
}