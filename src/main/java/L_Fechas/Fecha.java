package L_Fechas;

public class Fecha implements Comparable<Fecha> {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
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