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

    }

    @Override
    public String getTitol() {
        return "";
    }

    @Override
    public void setAutor(String autor) {

    }

    @Override
    public String getAutor() {
        return "";
    }

    @Override
    public void setAdmetPrestecLlarg(boolean admetPrestecLlarg) {

    }

    @Override
    public boolean getAdmetPrestecLlarg() {
        return false;
    }

    public boolean isDisponible(){
        return disponible;
    }
}
