package G_CálcularCnk;

public class CálcularCnk {
    public int calcular(int n, int k) {
        int result = 1;
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
}