package gerencia;

import dados.Cliente;
import dados.Revisao;
import dados.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    public static Integer obterTotalDeTipoDeVeiculos(Cliente cliente, String tipo){
        int qnt=0;
        for (Veiculo veiculo : cliente){
            if(tipo.equals(veiculo.getTipo()))
                qnt++;
        }
        return qnt;
    }

    public static String obterUltimaRevisaoDoCliente(Cliente cliente){
        List<Revisao> revisoesTotais = new ArrayList<Revisao>();
        for (Veiculo veiculo : cliente){
            for(Revisao revisao : veiculo){
                revisoesTotais.add(revisao);
            }
        }
        return revisoesTotais.get(revisoesTotais.size()-1).toString();
    }

    public static Integer obterTotalRevisoesVeiculos(Veiculo veiculo){
        int qnt=0;
        for (Revisao revisao : veiculo){
            qnt++;
        }
        return qnt;
    }

    public static String obterDatasRevisoesVeiculos(Veiculo veiculo){
        String datas = "";
        for (Revisao revisao : veiculo){
            datas+= "| " + revisao.getData() ;
        }
        return datas;
    }
}
