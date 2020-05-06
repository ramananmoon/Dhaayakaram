package com.company;

public class PlayerE {
    Board b;
    public PlayerE(Board b){
        this.b = b;
    }

int iOffset=6, jOffset=3;

public void navigate(){

    int sequenceE=0;

    for(int level = 0; level<3; level++){
        for(int i = iOffset, j = 6-level; i<6-level;i++){
            b.kattams.get(getIndex(i,j)).writeNumE(++sequenceE);
        }
        for(int i = 6-level,j = 6-level; j >= 0 + level; j--){
            b.kattams.get(getIndex(i,j)).writeNumE(++sequenceE);
        }
        for(int i = 5-level,j = 0 + level; i >= 0 + level; i--){
            b.kattams.get(getIndex(i,j)).writeNumE(++sequenceE);
        }
        for(int i=0+level,j = 1 + level; j < 6-level; j++){
            b.kattams.get(getIndex(i,j)).writeNumE(++sequenceE);
        }
        for(int i=0+level, j=6-level; i< iOffset;i++){
            b.kattams.get(getIndex(i,j)).writeNumE(++sequenceE);
        }
    }
}

protected int getIndex(int i,int j){
    return (j*7) + i;
}

}
