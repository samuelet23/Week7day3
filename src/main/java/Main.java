import Adapter.DataSource;
import Adapter.Info;
import Adapter.InfoAdapter;
import Adapter.UserData;
import ChainOfResponsibility.*;
import Composite.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        esercizio 1
        DataSource dataSource = null;
        UserData userData = new UserData();
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(Date.valueOf("2000-02-20"));

        InfoAdapter infoAdapter = new InfoAdapter(info);
        userData.getData(infoAdapter);

        System.out.println("-------------------");
//        esercizio 2
        Autori autore1 = new Autori("Mario", "Rossi");
        Autori autore2 = new Autori("Paolo", "Bianchi");

        Sezione contenuto = new Sezione();
        contenuto.aggiungiContenuto(new Pagina(1));
        contenuto.aggiungiContenuto(new Pagina(2));
        contenuto.aggiungiContenuto(new Pagina(3));
        contenuto.aggiungiContenuto(new Pagina(4));
        contenuto.aggiungiContenuto(new Pagina(5));

        Libro libro = new Libro(20,List.of(autore1, autore2), contenuto);
        int numPageTot = libro.numeroPagine();
        System.out.println("Numero pagine totali del libro: "+numPageTot);

//        esercizio 3


     Militare gerarchiaUfficili = new Capitano(new Maggiore(new Colonnello(new Generale(null))));
     gerarchiaUfficili.gestioneStipendio(3500);






    }
}
