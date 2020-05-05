package com.company;

import java.awt.*;

public class Malai extends Kattam{

    public Malai(int originX, int originY, int side, Graphics2D g, boolean raise) {
        super(originX, originY, side, g, raise);
        g.setColor(Color.red);
        g.drawLine(originX,originY,originX+side,originY+side);
        g.drawLine(originX+side,originY, originX,originY+side);
    }
}
