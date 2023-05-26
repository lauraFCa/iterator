package dados;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Veiculo implements Iterable<Revisao> {
    private String modelo;
    private String tipo;
    private List<Revisao> revisoes;

    public Veiculo(String modelo, String tipo, Revisao... revisoes) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.revisoes = Arrays.asList(revisoes);
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Iterator<Revisao> iterator() {
        return revisoes.iterator();
    }

}
