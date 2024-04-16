package A_FunciónRecursiva;

public class FunciónRecursiva {
    public int sumaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
}
