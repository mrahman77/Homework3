package nestedClass;

public class OuterClass {
    int outerNum1 = 10;

    public OuterClass(){
    }
    //Creating sub class Object
    InnerA innerA = new InnerA();
    InnerB innerB = new InnerB();
    public void outerMethodA(){
        System.out.println("Outer Class method A");
        innerA.innerAMethodA();
        innerB.innerBMethodA();
    }
    //Inner Class Start Here
    public class InnerA{
        int innerANum1 = 20;
        public InnerA() {
        }
        public void innerAMethodA(){
            System.out.println("Inner A method A");
        }
    }//Inner A Class Ends here

    //Inner B Class Starts Here
    public class InnerB{
        int innerBNum1 = 30;
        public InnerB(){
        }
        public void innerBMethodA(){
            System.out.println("Inner B Method A");
        }
    }//Inner B Method Ends here

}//Outer Class Ends Here
