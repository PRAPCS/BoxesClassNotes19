
/**
 * Write a description of class BoxesDriver here.
 *
 * @author Burger
 * @version 11/1/19
 */
public class Main
{
    public static void main(String[] args)
    {
        Boxes b1 = new Boxes();
        System.out.println(b1.getLength());
        System.out.println(b1.vol());
        System.out.println(b1.getWidth());
        System.out.println(b1);
        b1.setLength(10);

        System.out.println("==================================================");

        Boxes b2 = new Boxes(5,5,10);
        System.out.println(b2.getLength());
        System.out.println(b2.vol());
        System.out.println(b1.getWidth());

    }
}
