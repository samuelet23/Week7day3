package ChainOfResponsibility;

public class Tenente extends Militare{

    private static final int STIPENDIO = 1000;

    public Tenente(Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo <= STIPENDIO) {
            System.out.println("Il Tenente percepisce una cifra superiore o uguale a "+ importo + ", il suo stipendio è "+STIPENDIO);
        }
        else {
            getProssimo().gestioneStipendio(importo);
        }
    }
}
