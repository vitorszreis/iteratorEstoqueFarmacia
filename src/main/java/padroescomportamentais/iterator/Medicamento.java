package padroescomportamentais.iterator;

public class Medicamento {

    private String nome;
    private boolean controlado;

    public Medicamento(String nome, boolean controlado) {
        this.nome = nome;
        this.controlado = controlado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isControlado() {
        return controlado;
    }

    public void setControlado(boolean controlado) {
        this.controlado = controlado;
    }
}
