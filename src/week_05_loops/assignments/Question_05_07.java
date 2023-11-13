package week_05_loops.assignments;

public class Question_05_07 {
    public static void main(String[] args) {
        double currentTuition=10000;
        double tuitionInTenYears=0;
        double tuitionForFourYears=0;

        for (int year=1;year<=14;year++){
            currentTuition+=currentTuition*0.05;

            if (year==10){
                tuitionInTenYears=currentTuition;
            }
            if (year>10){
                tuitionForFourYears+=currentTuition;
            }
        }

        System.out.printf("Tuition in ten years: $%1f\n", tuitionInTenYears);
        System.out.printf("Total cost for four years’ worth of tuition after the tenth year: $%1.0f",
                tuitionForFourYears);

    }
}
