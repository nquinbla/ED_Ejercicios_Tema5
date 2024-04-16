package B_ListaNumDosVal;

public class ListaNumDosVal {
    public void imprimirNumeros(int a, int d) {
        if (a <= d) {
            System.out.println(a);
            imprimirNumeros(a + 1, d);
        }
    }
}
