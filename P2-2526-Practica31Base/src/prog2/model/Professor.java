package prog2.model;

public class Professor extends Usuari{

    private int maxPrestecsNormals;
    private int maxPrestecsLlargs;

    public Professor(String adreca, String email, String nom, int numPrestecsNormals, int numPrestecsLlargs, String tipusUsuari, int maxPrestecsLlargs, int maxPrestecsNormals) {
        super(adreca, email, nom, numPrestecsNormals, numPrestecsLlargs, tipusUsuari);
        this.maxPrestecsLlargs = maxPrestecsLlargs;
        this.maxPrestecsNormals = maxPrestecsNormals;
    }

    @Override
    public int getMaxPrestecsLlargs() {
        return maxPrestecsLlargs;
    }

    public void setMaxPrestecsLlargs(int maxPrestecsLlargs) {
        this.maxPrestecsLlargs = maxPrestecsLlargs;
    }

    @Override
    public int getMaxPrestecsNormals() {
        return maxPrestecsNormals;
    }

    public void setMaxPrestecsNormals(int maxPrestecsNormals) {
        this.maxPrestecsNormals = maxPrestecsNormals;
    }


}

