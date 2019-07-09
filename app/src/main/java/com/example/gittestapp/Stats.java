package com.example.gittestapp;


public class Stats {



    private int red_btn_click;
    private int green_btn_click;
    private int blue_btn_click;
    private int black_btn_click;

    public int getRed_btn_click() {
        return red_btn_click;
    }

    public int getGreen_btn_click() {
        return green_btn_click;
    }

    public int getBlue_btn_click() {
        return blue_btn_click;
    }

    public int getBlack_btn_click() {
        return black_btn_click;
    }

    public int getTotal(){
        return red_btn_click+green_btn_click+blue_btn_click+black_btn_click;
    }

    public void btn_click(int id){
        switch (id){
            case R.id.btRed:
                red_btn_click++;
                break;
            case R.id.btGreen:
                green_btn_click++;
                break;
            case  R.id.btBlue:
                blue_btn_click++;
                break;
            case R.id.btBlack:
                black_btn_click++;
                break;
        }
    }
}
