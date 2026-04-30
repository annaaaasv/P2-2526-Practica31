package prog2.model;

import java.io.Serializable;

public class LlistaExemplars extends Llista<Exemplar> implements Serializable {
    public LlistaExemplars(){
        super();
    }


    public boolean contains(String id) {
        return false;
    }
}
