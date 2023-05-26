package dados;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cliente implements Iterable<Veiculo> {

    public String cpf;
    private List<Veiculo> veiculos;

    public Cliente(String cpf, Veiculo... veiculos) {
        this.cpf = cpf;
        this.veiculos = Arrays.asList(veiculos);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Iterator<Veiculo> iterator() {
        return veiculos.iterator();
    }

}
