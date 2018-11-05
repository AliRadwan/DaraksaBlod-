package com.example.wekaradwan.daraksablood;

/**
 * Created by weka radwan on 6/22/2018.
 */

public class Data {

    private int name;
    private int phone;
    private int home;
    private int image;
    private int dialogImg;

    public Data(int name,int phone ,int home, int image) {
        this.name = name;
        this.phone = phone;
        this.home = home;
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getHome() {
        return home;
    }

    public int getImage() {
        return image;
    }

    public int getDialogImg() {
        return dialogImg;
    }

    public void setDialogImg(int dialog) {
        this.dialogImg = dialog;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
