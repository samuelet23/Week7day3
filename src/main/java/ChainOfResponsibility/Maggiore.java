package ChainOfResponsibility;

public class Maggiore extends Militare{

    private static final int STIPENDIO = 3000;

    public Maggiore (Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il Maggiore percepisce "+ STIPENDIO);
        }
        else {
            getProssimo().gestioneStipendio(importo);
        }
    }
}

