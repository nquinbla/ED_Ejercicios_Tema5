package A_SumaNumNaturales;

public class SumaNumNaturales {
    public int sumaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
}
