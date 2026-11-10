package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarMedicamentosControlados() {
        Estoque estoque = new Estoque(
                new Medicamento("Dipirona", false),
                new Medicamento("Rivotril", true),
                new Medicamento("Paracetamol", false),
                new Medicamento("Ritalina", true),
                new Medicamento("Amoxicilina", false)
        );
        assertEquals(2, Inventario.contarMedicamentosControlados(estoque));
    }

    @Test
    void deveContarTotalMedicamentos() {
        Estoque estoque = new Estoque(
                new Medicamento("Dipirona", false),
                new Medicamento("Rivotril", true),
                new Medicamento("Paracetamol", false),
                new Medicamento("Ritalina", true),
                new Medicamento("Amoxicilina", false)
        );
        assertEquals(5, Inventario.contarTotalMedicamentos(estoque));
    }

}
