package ChainOfResponsibility;

public class Tenente extends Militare{

    private static final int STIPENDIO = 1000;

    public Tenente(Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il Tenente percepisce "+ STIPENDIO);
        }
        else {
            getProssimo().gestioneStipendio(importo);
        }
    }
}
