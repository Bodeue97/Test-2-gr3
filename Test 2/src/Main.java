import Zad1.Kandydat;
import Zad1.Rekrutacja;

import java.util.ArrayList;

public class Main {











    public static void main(String[] args) {

        ArrayList<Kandydat> grupa = new ArrayList<Kandydat>();
        Kandydat kandydat1 = new Kandydat("Andrzej", 50, "magister", 11);
        Kandydat kandydat2 = new Kandydat("Paweł", 50, "licencjat", 12);
        Kandydat kandydat3 = new Kandydat("Ania", 45, "magister", 14);
        Kandydat kandydat4 = new Kandydat("Rafał", 48, "magister", 13);
        Kandydat kandydat5 = new Kandydat("Ola", 39, "licencjat", 9);
        Kandydat kandydat6 = new Kandydat("Ula", 39, "licencjat", 10);

        grupa.add(kandydat1);
        grupa.add(kandydat2);
        grupa.add(kandydat3);
        grupa.add(kandydat4);
        grupa.add(kandydat5);
        grupa.add(kandydat6);

        grupa.sort(Kandydat::compareTo);//lista posortowana rosnąco

        for(int i = 0; i <=grupa.size()-1
                ; i++){
            System.out.println(grupa.get(i).getNazwa());

        }

        System.out.println(Qualified(kandydat1));

    }

    public static boolean Qualified(Kandydat k){
        Rekrutacja.set();
        if (k.getLataDoswiadczenia() >= Rekrutacja.getDoswiadczenie())
            return true;

        return false;
    }
}
