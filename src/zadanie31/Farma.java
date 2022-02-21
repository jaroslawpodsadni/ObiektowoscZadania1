package zadanie31;

import java.util.ArrayList;

public class Farma {
    //Agragacja bo klasa ma inna klase
    private Kot kot;
    private Pies pies;
    private ArrayList<Zwierze> kury = new ArrayList<>();
    private ArrayList<Zwierze> krowy = new ArrayList<>();

    public Kot getKot() {
        return kot;
    }

    public void setKot(Kot kot) {
        this.kot = kot;
    }

    public Pies getPies() {
        return pies;
    }

    public void setPies(Pies pies) {
        this.pies = pies;
    }

    public ArrayList<Zwierze> getKury() {
        return kury;
    }

    public ArrayList<Zwierze> getKrowy() {
        return krowy;
    }

    public void dodajZwierze(Zwierze zwierze){
        if (zwierze instanceof Krowa) {
            krowy.add(zwierze);
        }
        if (zwierze instanceof Kura) {
            kury.add(zwierze);
        }
    }

    public static void wypiszZwierzeta(ArrayList<Zwierze> zwierzeta) {
        for (Zwierze zwierze  : zwierzeta) {
            System.out.println(zwierze);
        }
    }

    public int getIlosczKur() {
        return kury.size();
    }

    public int getIlosczKrow() {
        return krowy.size();
    }
}
