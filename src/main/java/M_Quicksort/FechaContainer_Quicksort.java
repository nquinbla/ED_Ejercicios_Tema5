package M_Quicksort;

import java.util.ArrayList;
import java.util.List;

public class FechaContainer_Quicksort {
    private List<Fecha> fechas;

    public FechaContainer_Quicksort() {
        this.fechas = new ArrayList<>();
    }

    public void agregarFecha(int dia, int mes, int año) {
        this.fechas.add(new Fecha(dia, mes, año));
    }

    public List<Fecha> listarFechas() {
        quicksort(fechas, 0, fechas.size() - 1);
        return this.fechas;
    }

    private void quicksort(List<Fecha> fechas, int low, int high) {
        if (low < high) {
            int pi = partition(fechas, low, high);

            quicksort(fechas, low, pi - 1);
            quicksort(fechas, pi + 1, high);
        }
    }

    private int partition(List<Fecha> fechas, int low, int high) {
        Fecha pivot = fechas.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (fechas.get(j).compareTo(pivot) < 0) {
                i++;

                Fecha temp = fechas.get(i);
                fechas.set(i, fechas.get(j));
                fechas.set(j, temp);
            }
        }

        Fecha temp = fechas.get(i + 1);
        fechas.set(i + 1, fechas.get(high));
        fechas.set(high, temp);

        return i + 1;
    }
}