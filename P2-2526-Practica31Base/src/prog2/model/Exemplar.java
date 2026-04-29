package prog2.model;

public class Exemplar implements InExemplar{
    private String id;
    private String titol, autor;
    private boolean admetPrestecLlarg, disponible;

    public Exemplar(String id, String titol, String autor, boolean admetPrestecLlarg){
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.admetPrestecLlarg = admetPrestecLlarg;
        this.disponible = true;
    }

    @Override
    public void setId(String id) {

        this.id = id;
    }

    @Override
    public String getId() {

        return id;
    }

    @Override
    public void setTitol(String titol) {

        this.titol = titol;

    }

    @Override
    public String getTitol() {

        return titol;
    }

    @Override
    public void setAutor(String autor) {

        this.autor = autor;

    }

    @Override
    public String getAutor() {

        return autor;
    }

    @Override
    public void setAdmetPrestecLlarg(boolean admetPrestecLlarg) {

        this.admetPrestecLlarg = admetPrestecLlarg;
    }

    @Override
    public boolean getAdmetPrestecLlarg() {
        // return false preguntar a ANNA :)
        return false;
    }

    public boolean isDisponible(){

        return disponible;
    }

    public void setDisponible(boolean disponible){

        this.disponible = disponible;
    }

    @Override
    public String toString(){

        return "id=" + id + ", Titol" + titol + " " +
                ", Autor = " + autor + ", Admet Prestec Llarg" + admetPrestecLlarg +
                ", Disponible=" + disponible;


    }
}

