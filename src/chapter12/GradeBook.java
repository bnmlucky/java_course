package chapter12;

import java.util.Map;

public class GradeBook {
    public static void main(String[] args){
        Map <String, Integer> gradeBook = TestResults.getOriginalGrades();
        Map <String, Integer> test2 = TestResults.getMakeUpGrades();

        for(var student : test2.entrySet()){
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = test2.get(student.getKey());

            if(secondGrade > firstGrade){
                gradeBook.put(student.getKey(), secondGrade);
            }
            System.out.println("Student: " + student.getKey() + ", Grade: " + gradeBook.get(student.getKey()));
        }
//        System.out.println("Final Grades:");
//        gradeBook.forEach(
//                (k, v) -> System.out.println("Student: " + k + ", Grade: " + v)
//        ); - this one does not give the same results as the first one - the if statement needs to be in it.
    }
}
/*
1. Which of the following Data Structures does NOT have an 'iterator()'?
- Set (-)
- List (-)
- Queue (-)
- Map (+)
2. Maps are able to hold entries with primitive data types as their key and
value.
- True (-)
- False
 */