package D_Cálculoxy;

public class Cálculoxy {
    public int calcularPotencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * calcularPotencia(x, y - 1);
        }
    }
}