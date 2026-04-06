public class GradeManager {
    String[] names = { "Nimai", "Nill", "Nilay", "Nilesh" };
    int[] grades = { 96, 85, 72, 99 };

    GradeManager() {
        int mini = 101, maxi = 0;
        double average = 0;
        String miniName = "", maxName = "";
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxi) {
                maxi = grades[i];
                maxName = names[i];
            } else if (grades[i] < mini) {
                mini = grades[i];
                miniName = names[i];
            }
            average = average + grades[i];
        }

        average = average / (double) grades.length;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                System.out.println(names[i] + " - " + grades[i] + " (A)");
            } else if (grades[i] >= 80) {
                System.out.println(names[i] + " - " + grades[i] + " (B)");
            } else if (grades[i] >= 70) {
                System.out.println(names[i] + " - " + grades[i] + " (C)");
            } else if (grades[i] >= 60) {
                System.out.println(names[i] + " - " + grades[i] + " (D)");
            } else {
                System.out.println(names[i] + " - " + grades[i] + " (F)");
            }
        }
        System.err.println();
        System.out.printf("Average:  %.2f\n", average);
        System.out.println("Highest: " + maxi + " (" + maxName + ")");
        System.out.println("Lowest: " + mini + " (" + miniName + ")");
    }

    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
    }
}
