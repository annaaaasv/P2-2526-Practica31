package prog2.model;

import java.util.Date;

public class PrestecNormal extends Prestec{

    public PrestecNormal(Exemplar exemplar, Usuari usuari, Date data) {
        super(exemplar, usuari, data);
    }

    @Override
    public String tipusPrestec() {
        return "Normal";
    }

    /**
     * Retornar durada prestec. La durada del prestec depen del tipus de prestec
     */
    @Override
    public long duradaPrestec() {
        return 70_000L;
    }
}
