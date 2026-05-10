package prog2.model;

import prog2.vista.BiblioException;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public class LlistaUsuaris extends Llista<Usuari> implements Serializable {

    public LlistaUsuaris(){
        super();
    }

    /**
     * Recórre la llista per mirar si conté un element
     * @param email
     * @return Retorna true si conté l'element i false si no
     */
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

    /**
     * Afegeix un usuari a la llista
     * @param u
     * @throws BiblioException
     */
    @Override
    public void afegir(Usuari u) throws BiblioException{
        if(contains(u.getEmail())){
            throw new BiblioException("Ja existeix un usuari amb aquest email");
        }
        super.afegir(u);
    }

}


