package java8.stream_api.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateMainTest {

	public static void main(String[] args) {

		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(new Student("adi", 80));
		studList.add(new Student("jay", 96));
		studList.add(new Student("hamu", 97));

		List<Student> highScorers1 = studList.stream().filter(new PredicateProvider()::test)
				.collect(Collectors.toList());
		System.out.println("student List is using implementation through class:" + highScorers1);

		List<Student> highScorers2 = studList.stream().filter(studObj -> studObj.getMarks() > 95)
				.collect(Collectors.toList());
		System.out.println("student List is:" + highScorers2);
	}

}
