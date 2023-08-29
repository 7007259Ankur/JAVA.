import org.w3c.dom.ls.LSOutput;

class outer
{
    public void print()
    {
        System.out.println("Outer class");
    }
    class Inner{
        public void print2()
        {
            System.out.println("Inner class");
        }
    }
}





public class Inner_Class {

    public static void main(String[] args) {

        outer obj=new outer();
        obj.print();
        outer.Inner obj1=obj.new Inner();//lEft one if class and right of Inner is constructor and right as a whole is object
        obj1.print2();

        //

    }
}
