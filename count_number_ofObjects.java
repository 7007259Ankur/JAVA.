public class count_number_ofObjects {


    static int i;
    public count_number_ofObjects()
    {
            i++;
    }// Automatic Call Constructor And Always have same name as that of class name :

    public static void print(){
        System.out.println("THe number of methods are ="+i);
    }

    public static void main(String[] args) {
                count_number_ofObjects s1=new count_number_ofObjects();
                count_number_ofObjects s2=new count_number_ofObjects();
                count_number_ofObjects s3=new count_number_ofObjects();
                count_number_ofObjects s4=new count_number_ofObjects();
                print();
    }

}
