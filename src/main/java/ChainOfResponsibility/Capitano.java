package ChainOfResponsibility;

public class Capitano extends Militare {
    private static final int STIPENDIO = 2000;

    public Capitano (Militare prossimmo){
            super(prossimmo);
        }

        @Override
        public void gestioneStipendio(int importo) {
            if (importo >= STIPENDIO) {
                System.out.println("Il Capitano percepisce "+ STIPENDIO);
            }
            else {
                getProssimo().gestioneStipendio(importo);
            }
        }
}
