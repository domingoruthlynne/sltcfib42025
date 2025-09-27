public class IfSwitchStatament {
    
    public static void main(String[] args) {
        int hourOfDay = 12;

        //If-then Statement
        /*
        if(hourOfDay<11)
            System.out.println("Good Morning");
        System.out.println("Kumain ka na ba?");
        **/


        //If-then-else-Statement
        /*
        if(hourOfDay<13)
            System.out.println("Good Morning!");
        else
            System.out.println("Good Afternoon!");
            System.out.println("Good Afternoon!!");
            System.out.println("Good Afternoon!!!");
        **/

        //else if
        if(hourOfDay <= 18)
            System.out.println("Good Evening!");
        else if(hourOfDay <= 12)
            System.out.println("Good Afternoon!!");
        else
            System.out.println("Good Morning!!!");

            //(boolean expression) ? T ? F;
            System.out.println((hourOfDay <= 18)? "Good eve":"Good day");


        //Switch Statament
            int dayOfWeek = 9;
            switch(dayOfWeek){
                case 1: System.out.println("Monday");
                        break;

                case 2: System.out.println("Tuesday");
                        break;

                case 3: System.out.println("Wednesday");
                        break;

                case 4: System.out.println("Thursday");
                        break;

                case 5: System.out.println("Friday");
                        break;

                case 6: 
                case 7: System.out.println("Weekends");
                        break;
                
                default: //kahit saan pwede ito ilagay, para syang else
                System.out.println("Invalid Day");
            }

    }
}
