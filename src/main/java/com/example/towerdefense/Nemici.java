package com.example.towerdefense;

import javafx.scene.image.Image;

public class Nemici {
    int lifept;
    int x;
    int y;
    int speedX;
    int speedY;

    public Nemici(int lifept, int x, int y, Image img) {

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
