package ChainOfResponsibility;

public class Generale extends Militare{

    private static final int STIPENDIO = 5000;

    public Generale (Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo <= STIPENDIO) {
            System.out.println("Il Generale percepisce una cifra superiore o uguale a "+ importo + ", il suo stipendio è "+STIPENDIO);
        }
        else {
            System.out.println("Nessun ufficiale percepisce"+importo);;
        }
    }
}

