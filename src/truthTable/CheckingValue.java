package truthTable;

public class CheckingValue {
    public static void main(String[] args) {
        boolean i = true;
        boolean j = false;

        System.out.println("true and true =\t" + (i&&i));

        System.out.println("true and false =\t" + (i&&j));

        System.out.println("false and true =\t" + (j||i));

        System.out.println("false and false =\t" + (j&&j));



    }
}
