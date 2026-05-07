package prog2.adaptador;

import prog2.model.*;
import prog2.vista.BiblioException;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Adaptador {
    private Dades dades;

    public Adaptador() {
        dades = new Dades();
    }

    public void guardaDades(String dstFile) throws BiblioException {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dstFile));
            oos.writeObject(dades);
            oos.close();
        } catch (IOException e) {
            throw new BiblioException("Error guardant dades: " + e.getMessage());
        }
    }

    public void carregaDades(String srcFile) throws BiblioException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(srcFile));
            dades = (Dades) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new BiblioException("Error carregant dades: " + e.getMessage());
        }
    }

    public ArrayList<String> recuperarUsuaris() {
        ArrayList<Usuari> usuaris = dades.recuperaUsuaris();
        ArrayList<String> llista = new ArrayList<>();
        Iterator<Usuari> it = usuaris.iterator();
        while (it.hasNext()) {
            Usuari u = it.next();
            llista.add(u.toString());
        }
        return llista;
    }

    public ArrayList<String> recuperarExemplars() {
        ArrayList<Exemplar> exemplars = dades.recuperaExemplars();
        ArrayList<String> llista = new ArrayList<>();
        Iterator<Exemplar> it = exemplars.iterator();
        while (it.hasNext()) {
            Exemplar e = it.next();
            llista.add(e.toString());
        }
        return llista;
    }

    public ArrayList<String> recuperarPrestecs() {
        ArrayList<Prestec> prestecs = dades.recuperaPrestecs();
        ArrayList<String> llista = new ArrayList<>();
        Iterator<Prestec> it = prestecs.iterator();
        while (it.hasNext()) {
            Prestec p = it.next();
            llista.add(p.toString());
        }
        return llista;
    }

    public ArrayList<String> recuperarPrestecsNoRetornats() {
        ArrayList<Prestec> prestecs = dades.recuperaPrestecsNoRetornats();
        ArrayList<String> llista = new ArrayList<>();
        Iterator<Prestec> it = prestecs.iterator();
        while (it.hasNext()) {
            Prestec p = it.next();
            llista.add(p.toString());
        }
        return llista;
    }

}
