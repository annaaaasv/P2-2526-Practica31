package prog2.model;

import prog2.vista.BiblioException;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public class LlistaUsuaris extends Llista<Usuari> implements Serializable {

    public LlistaUsuaris(){
        super();
    }


    public boolean contains(String email) {
        Iterator<Usuari> it = llista.iterator();
        while(it.hasNext()) {
            Usuari u = it.next();
            if(Objects.equals(u.getEmail(), email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void afegir(Usuari u){
        if(contains(u.getEmail())){
            throw new BiblioException("Ja existeix un usuari amb aquest email");
        }
        super.afegir(u);
    }

}


