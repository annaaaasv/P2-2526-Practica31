package prog2.model;

public class Professor extends Usuari{
    /**
     * Crea un nou professor
     * @param email
     * @param nom
     * @param adreca
     */
    public Professor(String email, String nom, String adreca) {
        super(email, nom, adreca);
    }

    /**
     * @return Retorna el nombre màxim de préstecs llargs permesos
     */
    @Override
    public int getMaxPrestecsLlargs() {
        return 2;
    }

    /**
     * @return Retorna el tipus d'usuari
     */
    @Override
    public String tipusUsuari() {
        return "Professor";
    }

    /**
     * @return Retorna el nombre màxim de préstecs normals permesos
     */
    @Override
    public int getMaxPrestecsNormals() {
        return 2;
    }




}

