package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Contenuto {

    private List<Contenuto> contenuti = new ArrayList<>();
    private  int numPage;
    public void aggiungiContenuto(Contenuto contenuto){
        contenuti.add(contenuto);
    }
    public void rimouviContenuto(Contenuto contenuto){
        contenuti.remove(contenuto);
    }

    @Override
    public int getNumberPages() {
        numPage = 0;
        for (Contenuto contenuto : contenuti){
            numPage += contenuto.getNumberPages();
        }
        return numPage;
    }
}
