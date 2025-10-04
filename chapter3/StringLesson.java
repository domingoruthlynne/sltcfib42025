package chapter3;
// (char == 65) || (char == 97) 
public class StringLesson {
    public static void main(String[] args){
        /*String name = "fluffy";
        String a = "1";
        a = "0";
        a+="2";
        a+="3";
        String b = "1";
        String name2 = "fluffy";
        name = null;
        name2 = null;

        String name3 = new String("fluffy");
        System.out.println(a);
        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        word1= word1.toUpperCase();
        System.out.println(word1.toLowerCase());
        System.out.println(word1);
        String trimSample = "       \t \n \t Marc Yim          \t \n";
        System.out.println(trimSample.trim());
    */
        
    /*  int three = 3;
        String four = "4";
        System.out.println(1+2+three+four);
    */
    
        String string = "Ruthlynne Domingo";
        System.out.println(string.length());
        System.out.println(string.charAt(2));
        System.out.println(string.substring(string.indexOf('u')));
        System.out.println(string.indexOf('e', 0));
        System.out.println(string.substring(0, 17));
        System.out.println(string.substring(3, 7));

        System.out.println();
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string);

        System.out.println();

    }

}