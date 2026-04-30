package prog2.model;

import java.io.Serializable;

public class LlistaUsuaris extends Llista<Usuari> implements Serializable {

    public LlistaUsuaris(){
        super();
    }


    public boolean contains(String id) {
        return false;
    }

}
