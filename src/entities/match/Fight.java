package entities.match;

import entities.characters.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Fight{

    private String Local;
    private String time;

    private Fighters player1;
    private Fighters player2;



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

    public Fighters getPlayer1() {
        return player1;
    }

    public void setPlayer1(Fighters player1) {
        this.player1 = player1;
    }

    public Fighters getPlayer2() {
        return player2;
    }

    public void setPlayer2(Fighters player2) {
        this.player2 = player2;
    }

    public void apresentFight() {
        System.out.println("Get ready for the next battle");
    }



    public void battle(Fighters player1, Fighters player2) {

        this.player1 = player1;
        this.player2 = player2;
        decision(player1, player2);
    }

    public void decision(Fighters f1, Fighters f2){
        if(f1.getOverral() > f2.getOverral()){
            System.out.println("the winner is: "+ f1);
        }else{
            System.out.println("The winner is: "+ f2);
        }



        }


}


