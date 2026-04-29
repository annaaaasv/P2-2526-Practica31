package prog2.model;

import java.util.Date;

public abstract class Prestec implements InPrestec{
    private Exemplar exemplar;
    private Usuari usuari;
    private Date data;  // data creació
    private Date dataretorn;  // data de retorn
    private boolean retornat;


    public Prestec(Exemplar exemplar, Usuari usuari) {
        this.exemplar = exemplar;
        this.usuari = usuari;
        this.data = new Date();
        this.dataretorn = new Date(data.getTime() + duradaPrestec());
        this.retornat = false;
    }

    @Override
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    @Override
    public Exemplar getExemplar() {

        return exemplar;
    }

    @Override
    public void setUsuari(Usuari usuari) {

        this.usuari = usuari;
    }

    @Override
    public Usuari getUsuari() {

        return usuari;
    }

    @Override
    public void setDataCreacio(Date data) {

            this.data = data;
    }

    @Override
    public Date getDataCreacio() {

        return data;
    }

    @Override
    public void setDataLimitRetorn(Date dataretorn) {

        this.dataretorn = dataretorn;
    }

    @Override
    public Date getDataLimitRetorn() {

        return dataretorn;

    }

    @Override
    public tipusPrestec() {
        return "";
    }

    @Override
    public void setRetornat(boolean retornat) {

        this.retornat = retornat;

    }

    @Override
    public boolean getRetornat() {

        return retornat;
    }

    /**
     * Retornar prestec. Llança excepció si el prestec ja es vaig retornar
     */
    @Override
    public void retorna() {

    }

    /**
     * Retornar durada prestec. La durada del prestec depen del tipus de prestec
     */
    @Override
    public long duradaPrestec() {
        return 0;
    }

    /**
     * Retornar true si el prestec està endarrerit per a la data actual
     */
    @Override
    public boolean prestecEndarrerit() {
        return false;
    }
}
