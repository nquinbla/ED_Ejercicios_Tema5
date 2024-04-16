package G_CálcularCnk;

public class CálcularCnk {
    public int calcularCnk(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return calcularCnk(n - 1, k) + calcularCnk(n - 1, k - 1);
        }
    }
}