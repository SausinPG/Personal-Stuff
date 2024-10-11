public class Lab4 {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);

        System.out.println(largerAbsVal(11, 2));    //should return 11
        System.out.println(largerAbsVal(4, -5)); //should return 5

        System.out.println();

        System.out.println(largestAbsVal(7, -2, -11));   //should return 11
        System.out.println(largestAbsVal(-4, 5, 2));     //should return 5

        System.out.println();

        System.out.println(area(2.0));      // should return 12.566370614359172

        System.out.println();

        System.out.println(scientific(6.23, 5));    //should return 623000.0
        System.out.println(scientific(1.9, -2));   //should return 0.019
    }



        //Exercise 1
        public static void printNumbers(int number) {
            for (int i = 1; i <= number; i++){

                System.out.print("[" + i + "]");
            }
            System.out.println();
            System.out.println();
        }


        //Exercise 6


                public static int largerAbsVal(int number1,int number2) {

                 number1 = Math.abs(number1);
                 number2 = Math.abs(number2);

                 return Math.max(number1,number2);


                }


        /*
        //Exercise 7

        */
        public static int largestAbsVal(int number1,int number2,int number3) {

                 number1 = Math.abs(number1);
                 number2 = Math.abs(number2);
                 number3 = Math.abs(number3);

                 int result = Math.max(number1,number2);
                 return Math.max(result,number3);

                }
/*
        //Exercise 10
*/
        public static double area(double number1) {
            number1 = Math.pow(number1,2);

            return number1*Math.PI;




        }
    /*
        //Exercise 12
        */
    public static double scientific(double number1,double number2) {
        number2 = Math.pow(10,number2);

        return number1*number2;
    }

}

