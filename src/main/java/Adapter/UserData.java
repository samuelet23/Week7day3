package Adapter;

public class UserData  {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();

        System.out.println(nomeCompleto);
        System.out.println(eta);
    }
}
