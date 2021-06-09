public class Main {

    public static void main(String[] args) {

        int number = 0;
        int finishNumber = 20;
        int counter = 0;


        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (counter < 5) {
                System.out.println("Even number " + number);
                counter++;

                //System.out.println("No. of even numbers found: " + counter);
            }
        }
        System.out.println("Total no. of even numbers found are: " + counter);

    }


    //Creating a method to find a even number.
    public static boolean isEvenNumber(int number) {

        //Using a while loop to find the even number.
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
