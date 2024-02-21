package ChainOfResponsibility;

public class Colonnello extends Militare{

    private static final int STIPENDIO = 4000;

    public Colonnello (Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo <= STIPENDIO) {
            System.out.println("Il Colonnello percepisce una cifra superiore o uguale a "+ importo + ", il suo stipendio è "+STIPENDIO);
        }
        else {
            getProssimo().gestioneStipendio(importo);
        }
    }
}