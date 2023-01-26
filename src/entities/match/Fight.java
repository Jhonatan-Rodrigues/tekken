package entities.match;

import entities.characters.EddyGordon;
import entities.characters.Heihachi;
import entities.characters.JinKazama;
import entities.characters.Law;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight {

    List<String> list = new ArrayList<>();
    private String Local;
    private String time;

    private String chooseFighter;

    public Fight(String local, String time) {
        Local = local;
        this.time = time;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getChooseFighter() {
        return chooseFighter;
    }

    public String setChooseFighter(String chooseFighter) {
        this.chooseFighter = chooseFighter;
        return null;
    }

    public static void apresentFight() {
        System.out.println("Get ready for the next battle");
        System.out.println("Choose your fighter: ");
        System.out.println("you can choose: Jin Kazama, Heihachi, Law, Eddy Gordon");
    }


    public String battle(String fighters) {
        if (chooseFighter.equals("JinKazama")) {
            System.out.println(new JinKazama());
            System.out.println("The prodigy");
        } else if (chooseFighter.equals("Law")) {
            System.out.println(new Law());
            System.out.println("The Legend of martial arts");
        } else if (chooseFighter.equals("Heihachi")) {
            System.out.println(new Heihachi());
            System.out.println("The Destructor Heihachi");
        } else if (chooseFighter.equals("Eddy")) {
            System.out.println(new EddyGordon());
            System.out.println("The legend of brazil, Eddy Gordon");
        } else {
            System.out.println("This fighter Doe'snt exist");
        }


        return fighters;
    }

    public void chooseYourFighter() {
        Scanner sc = new Scanner(System.in);
        String f1 = sc.next();
        list.add(setChooseFighter(f1));
        battle(f1);

        System.out.println();

        System.out.println("choose your opponent: ");
        String f2 = sc.next();
        list.add(setChooseFighter(f2));
        battle(f2);

        sc.close();
    }


}


