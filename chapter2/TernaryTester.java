public class TernaryTester {

    public static void main(String[] args) {
        int x = 0;
        String s = null;
        if(x == s) 
        System.out.println("Success");
        else System.out.println("Failure");
    }

}

/*x is an int (a primitive type).

  s is a String (a reference type).

  The expression x == s is invalid because Java does not allow you to compare a primitive int with a reference String. */