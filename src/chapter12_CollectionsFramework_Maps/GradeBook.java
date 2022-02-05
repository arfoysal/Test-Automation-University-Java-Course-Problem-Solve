package chapter12_CollectionsFramework_Maps;

import java.util.Map;

public class GradeBook {

	public static void main(String[] args) {
		Map<String, Integer> gradeBook = TestResults.getOriginalGrades();
		Map<String, Integer> makeUptest = TestResults.getMakeUpGrades();

		for (var student : makeUptest.entrySet()) {
			Integer testGrade = gradeBook.get(student.getKey());
			Integer makeUpGrade = makeUptest.get(student.getKey());
			if (testGrade < makeUpGrade) {
				gradeBook.put(student.getKey(), student.getValue());
			}
			System.out.println(student.getKey() + " - " + gradeBook.get(student.getKey()));
		}

	}

}
