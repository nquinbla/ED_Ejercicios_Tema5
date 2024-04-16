package L_Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha implements Comparable<Fecha> {
    private Date fecha;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Fecha(String fechaStr) throws ParseException {
        this.fecha = sdf.parse(fechaStr);
    }

    @Override
    public int compareTo(Fecha o) {
        return this.fecha.compareTo(o.fecha);
    }

    @Override
    public String toString() {
        return sdf.format(this.fecha);
    }
}