package M_Quicksort;


public class Fecha_Quicksort implements Comparable<Fecha> {
    private int dia;
    private int mes;
    private int año;

    public Fecha_Quicksort(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public int compareTo(Fecha otraFecha) {
        if (this.año != otraFecha.año) {
            return this.año - otraFecha.año;
        } else if (this.mes != otraFecha.mes) {
            return this.mes - otraFecha.mes;
        } else {
            return this.dia - otraFecha.dia;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}