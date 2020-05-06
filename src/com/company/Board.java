package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JPanel {

    int myWidth, myHeight;

    public Board(int myWidth, int myHeight) {
        this.myWidth = myWidth;
        this.myHeight = myHeight;
    }

    public ArrayList<Kattam> kattams;
    public void paintComponent(Graphics gOld) {
        super.paintComponent(gOld);
        Graphics2D g = (Graphics2D) gOld;
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawRect(getOriginX(), getOriginY(), (7 * getSide()), (7 * getSide()));

        //Kattam kattams[][] = new Kattam[7][7];

         kattams = new ArrayList<Kattam>();


        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                int currentOriginX, currentOriginY;
                currentOriginX = getOriginX() + (i * getSide());
                currentOriginY = getOriginY() + (j * getSide());
                Kattam kattam;
                if (isMalai(i,j)) {
                     kattam = new Malai(currentOriginX, currentOriginY, getSide(), g, true);

                }else{
                     kattam = new Kattam(currentOriginX, currentOriginY, getSide(), g, false);
                }

                    kattams.add(kattam);
            }
        }
      /*  PlayerS s = new PlayerS(this);
        s.navigate();
*/
        PlayerN n = new PlayerN(this);
        n.navigate();
/*
        PlayerW w = new PlayerW(this);
        w.navigate();

        PlayerE e = new PlayerE(this);
        e.navigate();*/


        for(int i = 0; i < kattams.size(); i++) {
            //System.out.println(kattams.get(i));
        }

    }


    protected boolean isMalai(int i, int j){

        if (i==j){
            if (i==0 || i==6){
                return false;
            }
            else {
                return true;
            }
        }
        else if(i+j==6){
            if (i==0 || j==0){
                return false;
            }
            else {
                return true;
            }
        }

        else if ((i==0 || j==0) && (i+j==3)){
            return true;
        }
        else if ((i==3 || j==3) && (i+j==9)){
            return true;
        }
        return false;
    }

    protected int getOriginX() {
        if (myWidth > myHeight) {
            //Landscape
            return (myWidth - myHeight) / 2;
        }
        return -1;

    }

    protected int getOriginY() {
        if (myWidth > myHeight) {
            //Landscape
            return 0;
        }
        return -1;

    }


    protected int getSide() {
        if (myWidth > myHeight) {
            //Landscape
            //System.out.println("Width " + myWidth + "Height " + myHeight + "Sides " + myHeight / 7);
            return myHeight / 7;
        }
        return -1;

    }


}
