public class Square extends Rectangle {
    public Square(double side){
        super(side,side);
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide(){
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "+this.getSide()+", which is a subclass of "+super.toString();
    }
}
