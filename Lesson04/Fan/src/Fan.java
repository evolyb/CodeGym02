public class Fan {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;
    private int speed;
    private boolean isOn;
    private double radius;
    private String color;
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setisOn(boolean on) {
        isOn = on;
    }
    public Fan(){
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5;
        this.color ="blue";
    }
    public String toString(){
        if (this.isOn){
            return "Color: "+this.color+". Radius: "+this.radius+" .Speed: "+this.speed+". The fan is ON";
        } else return "Color: "+this.color+". Radius: "+this.radius+". The fan is OFF";
    }

}
