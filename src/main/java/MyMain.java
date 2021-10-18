import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {

        return (int) (Math.random()*11)+10;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static double pythagoras(int a, int b){
        return Mathey.sqrt(Mathey.pow(a,2)+Mathey.pow(b,2));
    }
    public static void main(String[] args) {
        int smallest = 21;
        int largest = 9;
        for (int i =0;i<3;i++){

            int num = randomTeen();

            System.out.println(num);
            if (num>largest){
                largest=num;
            }
            if (num<smallest){
                smallest=num;
            }
        }
        System.out.println("the largest number is " +largest);
        System.out.println("the smallest number is "+smallest);




//         // Uncomment this code later!
        System.out.println("Mathey.max tests:");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(2.5,2.8,3.0,1.5));//3.0
        System.out.println(Mathey.max(4,6,8)); //8
        System.out.println("Mathey.random tests:");
        int tries = 0;
        for (int i = 10; i<16;i++){
            int num = 0;
            while (num!=i){
                tries++;
                num=Mathey.randomInteger(10,15);
            }
            System.out.print(num+ " ");
        }
        System.out.println("-- " + tries +" tries");
        tries=0;
        for (int i =0;i<6;i++){
            int num = -1;
            while (num!=i){
                tries++;
                num=Mathey.randomInteger(5);
            }
            System.out.print(num+ " ");
        }
        System.out.println("-- " + tries +" tries");
        System.out.println("Mathey.pow tests:");
        System.out.println(Mathey.pow(2,5)); //32
        System.out.println("Mathey.abs tests:");
        System.out.println(Mathey.abs(9));//9
        System.out.println(Mathey.abs(-2));//2
        System.out.println("Mathey.round tests:");
        System.out.println(Mathey.round(1.3));//1
        System.out.println(Mathey.round(1.8));//2
        System.out.println("Mathey.floor tests:");
        System.out.println(Mathey.floor(2.99999));//2
        System.out.println(Mathey.floor(1.4));//1
        System.out.println("Mathey.ceil tests:");
        System.out.println(Mathey.ceil(3.01));//4
        System.out.println(Mathey.ceil(3.0));//3
        System.out.println("Mathey.sqrt tests:");
        System.out.println(Mathey.sqrt(16.0));//4
        System.out.println("Pythagoras test:");
        System.out.println(pythagoras(5,12)); //13

    }

}


