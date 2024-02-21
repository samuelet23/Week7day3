package Composite;

import java.util.List;

public class Libro  {
    private int prezzo;
    private List<Autori> autori;
    private Contenuto contenuto;

    public Libro(int prezzo, List<Autori> autori, Contenuto contenuto) {
        this.prezzo = prezzo;
        this.autori = autori;
        this.contenuto = contenuto;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public List<Autori> getAutori() {
        return autori;
    }

    public void setAutori(List<Autori> autori) {
        this.autori = autori;
    }


    public int numeroPagine(){
        return contenuto.getNumberPages();
    }


    @Override
    public String toString() {
        return "Libro{" +
                "prezzo=" + prezzo +
                ", autori=" + autori +
                ", contenuto=" + contenuto +
                '}';
    }
}
