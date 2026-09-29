package singleton;

public class Configuracao {

    private static Configuracao instancia;

    private String nomeSistema;

    private Configuracao() {
        nomeSistema = "Sistema DIO Design Patterns";
    }

    public static Configuracao getInstancia() {

        if (instancia == null) {
            instancia = new Configuracao();
        }

        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
}