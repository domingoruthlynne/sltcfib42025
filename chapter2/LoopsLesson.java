public class LoopsLesson {
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
                

    }
}
