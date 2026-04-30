package prog2.model;

import java.util.Date;

public class PrestecLlarg extends Prestec{

    public PrestecLlarg(Exemplar exemplar, Usuari usuari, Date data) {
        super(exemplar, usuari, data);
    }

    @Override
    public String tipusPrestec() {
        return "Llarg";
    }

    /**
     * Retornar durada prestec. La durada del prestec depen del tipus de prestec
     */
    @Override
    public long duradaPrestec() {
        return 140_000L;
    }
}
