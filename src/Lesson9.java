public class Lesson9 {
    public static void main(String[] args) {
        int[] firstArray = new int [3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is FIRST element: " + firstArray[0]);
        System.out.println("Second element: " + firstArray[1]);


//        Shorthand array
        int[] temperatures = {33, 34, 31, 30, 29, 28, 36};
        System.out.println("Friday's temperature: " + temperatures[4]);

        System.out.println("In teperatures array we have " + temperatures.length + " elements");

        System.out.println("Last element in the array is: " + temperatures[temperatures.length - 1]);


        int[] weatherForcast = new int[7];
        weatherForcast[0] = 29;
        weatherForcast[1] = 31;
        weatherForcast[2] = 30;
        weatherForcast[3] = 37;
        weatherForcast[4] = 30;
        weatherForcast[5] = 30;
        weatherForcast[6] = 19;

        double averageTemperature =
                (weatherForcast[0] + weatherForcast[1] +  weatherForcast[2] + weatherForcast[3]
                + weatherForcast[4] + weatherForcast[5] +weatherForcast[6]) / 7d;

        System.out.println("Average temperature " + averageTemperature + " degrees");

//        LOOPS
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello you are in iteration!" + i);
        }
//        INFINITE LOOP
//        for (int i = 0; i <10; i--) {
//            System.out.println("New iteration " + i);
//        }

//Value 85, run for 10 times
        for (int i = 85; i < 95; i++) {
            System.out.println("LOOP iteration " + i);
        }
//        int counter = 0;
//        for (int i = 59; i < 1000; i++) {
//            System.out.println("This is iteration # " + counter);
//            counter++;
//        }
//ARRAYS + LOOPS
        int[] grades = {8,5,8,6,9,9,8,7,1,5,6,9,8,7,5};

        int gradeSum = 0;

        for (int i = 0; i < grades.length; i++) {
            gradeSum += grades[i];}
            System.out.println("Sum of all the grades " + gradeSum);

            double gradeAverage = gradeSum /(double)grades.length;
            System.out.println("Average grade sum " + gradeAverage);

    }
}




