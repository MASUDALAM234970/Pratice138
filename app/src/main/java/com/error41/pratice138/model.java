package com.error41.pratice138;

public class model {

   private  String classmate_name, roll;
   private  int pic_image;

    public model(String classmate_name, String roll, int pic_image) {
        this.classmate_name = classmate_name;
        this.roll = roll;
        this.pic_image = pic_image;
    }

    public String getClassmate_name() {
        return classmate_name;
    }

    public void setClassmate_name(String classmate_name) {
        this.classmate_name = classmate_name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public int getPic_image() {
        return pic_image;
    }

    public void setPic_image(int pic_image) {
        this.pic_image = pic_image;
    }
}
