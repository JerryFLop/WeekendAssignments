package Chapter12practice;

import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String,Integer> gradebook1 = TestResults.getOriginalGrades();

        Map<String,Integer> gradebook2 = TestResults.getMakeUpGrades();

        for (var grade : gradebook2.entrySet()) {
        Integer grade1 = gradebook2.get(grade.getKey());
        Integer grade2 = gradebook1.get(grade.getKey());
        if (grade2 < grade1){

            System.out.println("Name: " + grade.getKey() +'\n' + "Final Grade: "  + grade.getValue() +'\n' + "________");
        }
        }

    }







}
