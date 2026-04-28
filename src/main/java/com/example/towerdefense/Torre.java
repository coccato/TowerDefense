package com.example.towerdefense;

public class Torre {

  private  int heigth;
   private int width;
   private int tipoColpo; // 1= colpo base, 2= colpo medio , 3= colpo forte
    public int saldo;

    public Torre(int saldo) {

    }

    private boolean tipoTorre(int tipo){ //tipo = torre piccola costo 30, torre media =2  costo 50, torre grande = 3 costo 90

        if(tipo == 1 && saldo>=30){
            //addtorre
            saldo-=30;
            return true;
        }else if(tipo ==2 && saldo >=50){
            //addtorre
            saldo-=50;
            return true;
        } else if (tipo ==3 && saldo >=90) {
            // addtorre
            saldo-=90;
            return  true;
        }
        // non ha soldi / numero non valido
        return false;

    }

    private void addTorre(int tipo){

    }
}
