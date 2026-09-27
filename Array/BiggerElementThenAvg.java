public class BiggerElementThenAvg {

    public static void main(String[] args) {

        int[] marks = {90, 98, 72, 85, 88, 95, 77, 68, 89, 68, 75};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        int avg = sum / marks.length;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > avg) {
                System.out.println(marks[i]);
                count++;
            }
        }

        System.out.println("Average = " + avg);
        System.out.println("Count = " + count);
    }
}