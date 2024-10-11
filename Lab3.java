/**
 *  CS 145 Lab 3. This program prints multiplication, integer division,
 *  and modulus tables for integers 1-15, with headings.
 *
 *  Name:Logan Haack
 *
 */
public class Lab3 {
    public static void main(String[] args) {

        multiplication();
        System.out.println();
        division();
        System.out.println();
        modulus();
        System.out.println();
        SoccerMan();
    }

    /**
     * Method to print a multiplication table.
     */


    public static void multiplication() {
        System.out.println();
        System.out.println("Multiplication Table");
        System.out.println();
        System.out.print("x\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t");
        System.out.println();

        for (int i = 1; i <= 15; i++) {

            System.out.println();
            System.out.print(i + "\t");

                for (int j = 1; j <= 15; j++) {
                    System.out.print(j * i + "\t");
                }
                System.out.println();
        }
    }

    /**
     * Method to print an integer division table.
     */
    public static void  division()  {
        System.out.println("Division Table");
        System.out.println();
        System.out.print("x\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t");
        System.out.println();

        for (int i = 1; i <= 15; i++) {

            System.out.println();
            System.out.print(i + "\t");

            for (int j = 1; j <= 15; j++) {
                System.out.print(j / i + "\t");
            }
            System.out.println();
        }
    }
        //Write your for loops to print a division table here.


    /**
     * Method to print a modulus (remainder) table.
     */
    public static void  modulus()  {

        //Write your for loops to print a modulus table here.
        System.out.println("Modulus Table");
        System.out.println();
        System.out.print("x\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t13\t14\t15\t");
        System.out.println();

        for (int i = 1; i <= 15; i++) {

            System.out.println();
            System.out.print(i + "\t");

            for (int j = 1; j <= 15; j++) {
                System.out.print(j % i + "\t");
            }
            System.out.println();
        }

    }

    //Write any additional methods you need here.

    public static void SoccerMan() { //Thought I'd add this
        System.out.println();
        System.out.println("Soccer Man :0");
        System.out.println();
        System.out.println(" O                |_\\"); //The backslashes caught me off guard when I was making the goal
        System.out.println("/|\\               |_ \\");
        System.out.println(" |          o     |__ \\");
        System.out.println("/ \\               |___ \\");
    }
}
