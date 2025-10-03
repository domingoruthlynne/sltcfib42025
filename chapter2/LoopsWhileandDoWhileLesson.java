import java.util.Scanner;

public class LoopsWhileandDoWhileLesson {
    public static void main(String[] args) {
        
        /*int a = 1;    //variable
        while(a<=10) //checking the condition before doing else sa loob
            System.out.println("a = "+ a++);
            System.out.println("end of program");
          */
        
        byte a = 1;   
        while(a<=10) 
            System.out.println("a = "+ a++);

        do
            System.out.println("do while : a = "+a--);
        while (a<10);
            System.out.println("end of program");
                

        //    do- magrurun ng isang beses

        for(int b = 0 ; b<10; b++)
            System.out.println("b = " + b);
        

        //nested for loop
        /*for(int x = 1; x<10; x++){
            for(int y = 1; y<=x; y++){
                System.out.print(x);
            }
            System.out.println();
        */

        // Input = Scanner
        System.out.println("Enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x = 1; x < limit; x++){
            for(int y = 1; y<=x; y++){
                System.out.print(x);
            }
            System.out.println();
        }
        /*output ay
        Color: red
        Color: pink
        Color: yellow
        Color: white
        Color: blue */
        String[] colors = {"black", "red", "pink", "yellow", "white", "blue"};
        for(String color: colors)
            System.out.println("Color: "+ color);


        //output na to ay multiplication table    
        ROW: for(int p = 1; p<=10;p++){
        COL:    for (int l = 1; l<=10;l++)
                    System.out.print(l*p+"\t");
            System.out.println();
        }
        

        int[][] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}};
        for(int[] mySimpleArray : myComplexArray) {     //OUTER_LOOP
            for(int i=0; i<mySimpleArray.length; i++) { //INNER_LOOP
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

        //break statement and continue statement
        ROW_TABLE: for(int p = 1; p<=10;p++){
        COL_TABLE:          for (int l = 1; l<=10;l++){
                                    if (l==6) {
                                        //break COL_TABLE;  or
                                        continue COL_TABLE;
                                    }
                                System.out.print(l*p+"\t");
                              }
                            System.out.println();
        }

    

    }
}

