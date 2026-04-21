package com.example.towerdefense;

public class Nemici {
    int lifept;
    int x;
    int y;
    int speedX;
    int speedY;

    public Nemici(int lifept, int x, int y) {

        this.lifept=lifept;
        this.x=x;
        this.y = y;


        if(lifept<70){
            speedX=3;
            speedY=3;
        }else if( lifept>=70 && lifept<140){
            speedX=2;
            speedY=2;
        }else{
            speedX=1;
            speedY=1;
        }
    }

}
