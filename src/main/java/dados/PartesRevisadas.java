package dados;

public class PartesRevisadas {
    public Boolean Motor;
    public Boolean Oleo;
    public Boolean Suspensao;
    public Boolean Freio;
    public Boolean Alinhamento;

    public PartesRevisadas(){
        this.Motor = false;
        this.Oleo = false;
        this.Suspensao = false;
        this.Freio = false;
        this.Alinhamento = false;
    }

    public String toString(){
        return "Motor: " + this.Motor
                + "\nOleo: " + this.Oleo
                + "\nSuspensao: " + this.Suspensao
                + "\nFreio: " + this.Freio
                + "\nAlinhamento: " + this.Alinhamento;
    }
}
