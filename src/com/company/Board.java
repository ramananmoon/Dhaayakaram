package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Board extends JPanel {

    int myWidth, myHeight;
    int newheight;
    int newwidth;
    int widthpadding;
    int heightpadding;

    public Board(int myWidth, int myHeight) {
        getPadding(myWidth,myHeight);
    }

    private void getPadding(int myWidth, int myHeight) {
        if(myWidth>myHeight){
            widthpadding = (myWidth-myHeight);
            heightpadding = myHeight/10;
            newwidth = myWidth - ((widthpadding) + (heightpadding));
            newheight = myHeight - (heightpadding);
        }else if(myHeight>myWidth){
            widthpadding = myWidth/10;
            heightpadding = (myHeight-myWidth);
            newwidth = myWidth - ((widthpadding));
            newheight = myHeight - ((heightpadding) + (widthpadding));
        }else{
            widthpadding = myWidth/10;
            heightpadding = myHeight/10;
            newwidth = myWidth - (widthpadding);
            newheight = myHeight - (heightpadding);
        }

        this.myWidth = newwidth;
        this.myHeight = newheight;

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
        PlayerS s = new PlayerS(this);
        s.navigate();
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
        return  (widthpadding/2)+(heightpadding/2);
    }

    protected int getOriginY() {
        return heightpadding/2;
    }


    protected int getSide() {
        return (newheight-(heightpadding))/7;

    }


}
