package Test;

import tr.edu.istiklal.Rectangle;


public class Test {
    
    public static void main(String[] args){
      Rectangle r1 = new Rectangle(4,40);
      System.out.println( r1.getWidth());
      System.out.println(r1.getHeight());
      System.out.println(r1.getArea());
      System.out.println(r1.getPerimeter());
      Rectangle r2= new Rectangle(3.5,35.9);
      System.out.println( r2.getWidth());
      System.out.println(r2.getHeight());
      System.out.println(r2.getArea());
      System.out.println(r2.getPerimeter());
    }
    
}
