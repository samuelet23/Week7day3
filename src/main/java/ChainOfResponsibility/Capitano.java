package ChainOfResponsibility;

public class Capitano extends Militare {
    private static final int STIPENDIO = 2000;

    public Capitano (Militare prossimmo){
            super(prossimmo);
        }

        @Override
        public void gestioneStipendio(int importo) {
            if (importo <= STIPENDIO) {
                System.out.println("Il Capitano percepisce una cifra superiore o ugualeo a "+ importo + ", il suo stipendio è "+STIPENDIO);
            }
            else {
                getProssimo().gestioneStipendio(importo);
            }
        }
}
