package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JFrame f = new JFrame("Dhaayakaram");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int screenWidth, screenHeight;
        screenWidth= Toolkit.getDefaultToolkit().getScreenSize().width;
        screenHeight= Toolkit.getDefaultToolkit().getScreenSize().height;
        Board b = new Board(screenWidth,screenHeight);
        f.add(b);
        f.setSize(screenWidth,screenHeight);
        f.setVisible(true);


    }
}
