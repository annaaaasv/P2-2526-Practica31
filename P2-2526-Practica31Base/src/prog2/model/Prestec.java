package prog2.model;

import prog2.vista.BiblioException;

import java.io.Serializable;
import java.util.Date;

public abstract class Prestec implements InPrestec, Serializable {
    private Exemplar exemplar;
    private Usuari usuari;
    private Date data;  // data creació
    private Date dataRetorn;  // data de retorn
    private boolean retornat;


    public Prestec(Exemplar exemplar, Usuari usuari, Date data) {
        this.exemplar = exemplar;
        this.usuari = usuari;
        this.data = data;
        this.dataRetorn = new Date(data.getTime() + duradaPrestec());
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
    public void setDataLimitRetorn(Date dataRetorn) {

        this.dataRetorn = dataRetorn;
    }

    @Override
    public Date getDataLimitRetorn() {

        return dataRetorn;

    }

    @Override
    public abstract String tipusPrestec();

    @Override
    public void setRetornat(boolean retornat) {

        this.retornat = retornat;

    }

    @Override
    public boolean getRetornat() {

        return retornat;
    }

    /**
     * Retornar prestec. Llança excepció si el prestec ja es va retornar
     */
    @Override
    public void retorna() {
        if(retornat) throw new BiblioException("El préstec ja està retornat");
        retornat = true;
        exemplar.setDisponible(true);
        if(tipusPrestec().equals("Normal")) usuari.setNumPrestecsNormals(usuari.getNumPrestecsNormals() - 1);
        else if(tipusPrestec().equals("Llarg")) usuari.setNumPrestecsLlargs(usuari.getNumPrestecsLlargs() - 1);
    }

    /**
     * Retornar durada prestec. La durada del prestec depen del tipus de prestec
     */
    @Override
    public abstract long duradaPrestec();

    /**
     * Retornar true si el prestec està endarrerit per a la data actual
     */
    @Override
    public boolean prestecEndarrerit() {
        if(retornat) return false;
        Date dataActual = new Date();
        return dataActual.after(dataRetorn);
    }

    @Override
    public String toString(){
        return "Tipus= " + tipusPrestec() + ", Exemplar= " + exemplar.getTitol() + ", Usuari= " + usuari.getNom() +
        ", Data de creació= " + data + ", Data límit retorn= " + dataRetorn + "Retornat= " + retornat;
    }
}
