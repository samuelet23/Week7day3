package Adapter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class InfoAdapter implements DataSource{

    private Info info;

    public InfoAdapter(Info info){
        this.info = info;
    }
    @Override
    public String getNomeCompleto() {
        return "Nome: "+ info.getNome() +" Cognome: "+ info.getCognome();
    }

    @Override
    public int getEta() {
        Date oggi = new Date(System.currentTimeMillis());
        Date dataDiNascita = info.getDataDiNascita();

        long diffMilliseconds = oggi.getTime() - dataDiNascita.getTime();
        long diffSeconds = diffMilliseconds / 1000;
        long diffMinutes = diffSeconds / 60;
        long diffHours = diffMinutes / 60;
        long diffDays = diffHours / 24;
        return (int) (diffDays / 365.25);
    }
}
