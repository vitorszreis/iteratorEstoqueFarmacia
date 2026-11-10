package padroescomportamentais.iterator;

import java.util.Iterator;

public class Inventario {

    public static Integer contarMedicamentosControlados(Estoque estoque) {
        int quantidade = 0;
        for (Medicamento medicamento : estoque) {
            if (medicamento.isControlado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMedicamentos(Estoque estoque) {
        int quantidade = 0;
        for (Iterator m = estoque.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }

}
