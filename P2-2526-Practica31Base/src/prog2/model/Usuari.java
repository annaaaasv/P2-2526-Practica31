package prog2.model;

public abstract class Usuari implements InUsuari{
    private String email ;
    private String nom;
    private String adreca;
    private int numPrestecsNormals;
    private String tipusUsuari;
    private int numPrestecsLlargs;

    public Usuari(String adreca, String email, String nom, int numPrestecsNormals, int numPrestecsLlargs, String tipusUsuari) {
        this.adreca = adreca;
        this.email = email;
        this.nom = nom;
        this.numPrestecsNormals = numPrestecsNormals;
        this.numPrestecsLlargs = numPrestecsLlargs;
        this.tipusUsuari = tipusUsuari;
    }

    @Override
    public void setEmail(String email) {

        this.email = email;


    }

    @Override
    public String getEmail() {

        return email;
    }

    @Override
    public void setNom(String nom) {

        this.nom = nom;

    }

    @Override
    public String getNom() {

        return nom;
    }

    @Override
    public void setAdreca(String adreca) {

        this.adreca = adreca;
    }

    @Override
    public String getAdreca() {

        return adreca;
    }

    @Override
    public String tipusUsuari() {

        return tipusUsuari;

    }   // Preguntar anna perque no es getter

    @Override
    public void setNumPrestecsNormals(int numPrestecsNormals) {

        this.numPrestecsNormals = numPrestecsNormals;

    }

    @Override
    public int getNumPrestecsNormals() {

        return numPrestecsNormals;

    }

    @Override
    public void setNumPrestecsLlargs(int numPrestecsLlargs) {

        this.numPrestecsLlargs = numPrestecsLlargs;

    }

    @Override
    public int getNumPrestecsLlargs() {

        return numPrestecsLlargs ;
    }

    @Override
    public int getMaxPrestecsNormals() {return 0;
    }

    @Override
    public int getMaxPrestecsLlargs() {return 0;
    }
    /* classe to string i aquests dos ultims metodes que despres estan override a estudiant
    i profesor, to string no ordenat es un problema????*/

    @Override
    public String toString() {
        return "Usuari{" +
                "adreca='" + adreca + '\'' +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", numPrestecsLlargs=" + numPrestecsLlargs +
                ", numPrestecsNormals=" + numPrestecsNormals +
                ", tipusUsuari='" + tipusUsuari + '\'' +
                '}';
    }
}
