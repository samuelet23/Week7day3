package Composite;

public class Pagina implements Contenuto {

    private int numeroPagina;

    public Pagina(int numPage){
        this.numeroPagina = numPage;
    }

    @Override
    public int getNumberPages() {
        return 1;
    }



}
