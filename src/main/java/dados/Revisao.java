package dados;

public class Revisao {
    private String data;
    private float preco;
    private PartesRevisadas partesRevisadas;

    public Revisao(String data, float preco, PartesRevisadas partesRevisadas) {
        this.data = data;
        this.preco = preco;
        this.partesRevisadas = partesRevisadas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString(){
        return "Revisao \nData: " + this.data + "| Preco: R$" + this.preco + "\nPartes revisadas:\n"
                + this.partesRevisadas.toString();
    }
}
