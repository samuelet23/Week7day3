package ChainOfResponsibility;

public abstract class Militare {
    private Militare prossimo;
    public Militare(Militare prossimo){
        this.prossimo = prossimo;
    }

    public Militare getProssimo(){
        return prossimo;
    }

   abstract public void gestioneStipendio(int importo);
}
