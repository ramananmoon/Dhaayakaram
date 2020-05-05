package com.company;

import java.awt.*;

public class PlayerS {
    Board b;
    public PlayerS(Board b){
        this.b = b;
    }

int iOffset=3, jOffset=6;

public void navigate(){
    for(int level = 0; level<3; level++){
        for(int i = iOffset, j = 6-level; i<7-level;i++){
            b.kattams.get(getIndex(i,j)).writeNum(getIndex(i,j));
        }
        for(int i = 6-level,j = 6-level; j >= 0 + level; j--){

        }
        for(int i = 6-level,j = 0 + level; i >= 0 + level; i--){

        }
        for(int i=0+level,j = 0 + level; j < 6-level; j++){

        }
        for(int i=0+level, j=6-level; i< iOffset;i++){

        }
    }
}

protected int getIndex(int i,int j){
    return (j*7)+i;
}

}
