package ChainOfResponsibility;

public class Generale extends Militare{

    private static final int STIPENDIO = 2000;

    public Generale (Militare prossimmo){
        super(prossimmo);
    }

    @Override
    public void gestioneStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il Capitano percepisce "+ STIPENDIO);
        }
        else {
            System.out.println("Nessun ufficiale percepisce"+importo);;
        }
    }
}

