//Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.

import java.util.ArrayList;

public class Ucilica {
        private ArrayList<GeometrijskiLik> likovi;
// private ArrayList<GeometrijskiLik> likovi = new ArrayList<>();

    public Ucilica() {
        this.likovi = new ArrayList<>();
    }

    public ArrayList<GeometrijskiLik> getLikovi() {
        return likovi;
    }
}
