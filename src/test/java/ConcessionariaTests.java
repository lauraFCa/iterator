import dados.*;
import gerencia.Concessionaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcessionariaTests {

    public Cliente cliente;
    public Veiculo veiculo1;
    public Veiculo veiculo2;
    public Revisao revisao1;
    public Revisao revisao2;

    public PartesRevisadas partesRevisadas1;
    public PartesRevisadas partesRevisadas2;

    @BeforeEach
    void setClienteVeiculoRevisao(){
        partesRevisadas1 = new PartesRevisadas();
        partesRevisadas2 = new PartesRevisadas();
        partesRevisadas1.Oleo = true;
        partesRevisadas1.Motor = true;
        partesRevisadas2.Suspensao = true;
        partesRevisadas2.Oleo = true;
        partesRevisadas2.Alinhamento = true;

        revisao1 = new Revisao("10/10/2010", 455f, partesRevisadas1);
        revisao2 = new Revisao("20/08/2012", 685.4f, partesRevisadas1);
        veiculo1 = new Veiculo("Jeep Renegate", "Carro", revisao1);
        veiculo2 = new Veiculo("Yamaha X3", "Moto", revisao1, revisao2);
        cliente = new Cliente("123456789", veiculo1, veiculo2);
    }

    @Test
    void deveRetornarNumeroDeVeiculosCorretamente(){
        Integer numVeiculos = Concessionaria.obterTotalDeTipoDeVeiculos(cliente, "Carro");
        assertEquals(1,numVeiculos);
    }

    @Test
    void deveRetornarUltimaRevisaoDoCliente(){
        PartesRevisadas partesRevisadas = new PartesRevisadas();
        partesRevisadas.Alinhamento = true;
        partesRevisadas.Motor = true;

        Revisao revisao = new Revisao("23/05/2021", 587.4f, partesRevisadas);
        Veiculo veiculo = new Veiculo("Honda XRE 300", "Moto", revisao1, revisao2, revisao);

        Cliente clienteNovo = new Cliente("010203040506", veiculo1, veiculo2, veiculo);
        assertEquals("Revisao \n" +
                "Data: 23/05/2021| Preco: R$587.4\n" +
                "Partes revisadas:\n" +
                "Motor: true\n" +
                "Oleo: false\n" +
                "Suspensao: false\n" +
                "Freio: false\n" +
                "Alinhamento: true", Concessionaria.obterUltimaRevisaoDoCliente(clienteNovo));
    }

    @Test
    void deveRetornarTotalRevisoesVeiculo(){
        Integer numRev = Concessionaria.obterTotalRevisoesVeiculos(veiculo2);
        assertEquals(2,numRev);
    }

    @Test
    void deveRetornarDatasRevisoesVeiculo(){
        Revisao revisao = new Revisao("12/06/2020", 856f, partesRevisadas1);
        Veiculo veiculo = new Veiculo("Fiat Uno", "Carro", revisao1, revisao2, revisao);
        String datasRev = Concessionaria.obterDatasRevisoesVeiculos(veiculo);
        assertEquals("| 10/10/2010| 20/08/2012| 12/06/2020",datasRev);
    }

}
