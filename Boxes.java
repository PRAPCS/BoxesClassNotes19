
/**
 * Write a description of class Boxes here.
 *
 * @author Burger
 * @version 11/1/19
 */
public class Boxes
{
   //Private Global (instance) variable - Can be used anywhere in this class
   private int length;
   private int width;
   private int height;

   //Constructor that has the same name as the class
   public Boxes()
   {
       length = 2;
       width = 2;
       height =2;
    }

    public Boxes (int l, int w, int h) // l,w,h are local variables they only exist in this method
    {
        length = l;
        width =w;
        height=h;

    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int n)
    {
       length = n;
    }

    public int vol()
    {
        return length*width*height;
    }

    public int getWidth()
    {
        return width;
    }


    public String toString()
    {

     return "The length is: "+length;
    }
    }
