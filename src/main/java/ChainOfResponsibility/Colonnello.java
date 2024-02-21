package ChainOfResponsibility;

public class Colonnello extends Militare{

    private static final int STIPENDIO = 2000;

    public Colonnello (Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il Colonnello percepisce "+ STIPENDIO);
        }
        else {
            getProssimo().gestioneStipendio(importo);
        }
    }
}