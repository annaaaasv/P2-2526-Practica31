package prog2.model;

import prog2.vista.BiblioException;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public class LlistaExemplars extends Llista<Exemplar> implements Serializable {
    public LlistaExemplars(){
        super();
    }

    public boolean contains(String id) {
        Iterator<Exemplar> it = llista.iterator();
        while(it.hasNext()) {
            Exemplar e = it.next();
            if(Objects.equals(e.getId(), id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void afegir(Exemplar e){
        if(contains(e.getId())){
            throw new BiblioException("Ja existeix un exemplar amb aquest ID");
        }
        super.afegir(e);
    }


}
