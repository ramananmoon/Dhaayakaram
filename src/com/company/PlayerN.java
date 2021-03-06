package com.company;

public class PlayerN {
    Board b;
    public PlayerN(Board b){
        this.b = b;
    }

int iOffset=3, jOffset=0;

public void navigate(){

    int sequenceN=0;

    for(int level = 0; level<3; level++){

        for(int i = iOffset, j = 0+level; i>=level;i--){
            b.kattams.get(getIndex(i,j)).writeNumN(++sequenceN);
        }
        for(int i = 0+level,j = 1+level; j < 6- level; j++){
            b.kattams.get(getIndex(i,j)).writeNumN(++sequenceN);
        }
        for(int i = 0+level,j = 6-level; i <= 6-level; i++){
            b.kattams.get(getIndex(i,j)).writeNumN(++sequenceN);
        }
        for(int i=6-level,j = 5-level; j>=level; j--){
           b.kattams.get(getIndex(i,j)).writeNumN(++sequenceN);
        }
        for(int i=5-level, j=0+level; i>iOffset;i--){
            b.kattams.get(getIndex(i,j)).writeNumN(++sequenceN);
        }
    }
}

protected int getIndex(int i,int j){
    return (j*7) + i;
}

}
