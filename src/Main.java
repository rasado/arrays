import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Exercise 2 Write a Java program på sum values of an array
        System.out.println("Varför fungerar det inte?");
        int number[] = {1, 4, 6, 8, 4, 3};
        int sum = 0;
        for (int i : number)
            sum+=i;
            System.out.println("The sum is " + sum);

            //Exercise 4 Write a Java program to calculate the average value of array elements
        double averageNumber[]={5,6,7,8,9,4,2};
        double sumAverage=0;
        double sumAverageFinal=0;
        for(double i : averageNumber)
            sumAverage+=i;
            sumAverageFinal=sumAverage/averageNumber.length;
        System.out.println("The average sum is " +sumAverageFinal);

        //Exercise 6 Write a Java program to find the index of an array element
        //String someElements[]={"Sebastian", "utomhus", "cykel", "träd", "park"};
        //int length = someElements.length;
        //int i=0;
        //while(i<length){
        //    if(someElements[i]==t)
        //}

        //Exercise 8 Write a Java program to copy an array by iterating the array
        int[] oldArray = {10,20,30,40,50,60,70,80,90};
        int[] newArray = new int[9];
        System.out.println("Source array : "+ Arrays.toString(oldArray));
        for (int i=0; i<oldArray.length;i++){
            newArray[i]=oldArray[i];
        }
        System.out.println("New array: "+Arrays.toString(newArray));

        }
    }

