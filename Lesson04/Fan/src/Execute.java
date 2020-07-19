public class Execute {
    public static void main(String[] args) {
        Fan myFan1 = new Fan();
        Fan myFan2 = new Fan();
        myFan1.setSpeed(myFan1.FAST);
        myFan1.setRadius(10);
        myFan1.setColor("yellow");
        myFan1.setisOn(true);
        myFan2.setSpeed(myFan2.MEDIUM);
        System.out.println(myFan1.toString());
        System.out.println(myFan2.toString());
    }
}
