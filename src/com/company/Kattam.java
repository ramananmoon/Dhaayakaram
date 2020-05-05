package com.company;


import java.awt.*;
import java.lang.reflect.Array;

public class Kattam {

protected int originX, originY, side;
protected Graphics2D g;
protected boolean raise;

    public Kattam (int originX, int originY, int side, Graphics2D g, boolean raise){
        this.originX=originX;
        this.originY=originY;
        this.side=side;
        this.g=g;
        this.raise=raise;
        this.show();
    }

    public void show(){
        int xPoints[] = new int[4];
        int yPoints[] = new int[4];
        xPoints[0]=this.getOriginX();
        xPoints[1]=this.getOriginX() + side;
        xPoints[2]=this.getOriginX()+ side;
        xPoints[3]=this.getOriginX();

        yPoints[0]=this.getOriginY();
        yPoints[1]=this.getOriginY();
        yPoints[2]=this.getOriginY()+ side;
        yPoints[3]=this.getOriginY()+ side;

        g.setColor(Color.BLACK);


        g.setStroke(new BasicStroke(3f));
        g.drawRect(this.getOriginX(),this.getOriginY(),this.getSide(),this.getSide());

     /*   g.drawPolygon(xPoints,yPoints,4);
        g.drawPolyline(xPoints,yPoints,4);*/

    }

    public int getOriginX() {
        return originX;
    }

    public int getOriginY() {
        return originY;
    }

    public int getSide() {
        return side;
    }

    public void writeNum(int num){
        g.drawString(num+"", originX+(side/2), originY + (side/4));
    }
}
