

public class Main {
    public static void main(String[] args) {
        // Exercise 2
        System.out.println("Varför fungerar det inte?");
        int number[] = {1, 4, 6, 8, 4, 3};
        int sum = 0;
        for (int i : number)
            sum+=i;
            System.out.println("The sum is " + sum);

            //Exercise 4
        double averageNumber[]={5,6,7,8,9,4,2};
        double sumAverage=0;
        double sumAverageFinal=0;
        for(double i : averageNumber)
            sumAverage+=i;
            sumAverageFinal=sumAverage/averageNumber.length;
        System.out.println("The average sum is " +sumAverageFinal);
    }
}
