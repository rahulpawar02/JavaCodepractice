package java8.stream_api.predicate;

import java.util.function.Predicate;

public class PredicateProvider implements Predicate<Object> {
	@Override
	public boolean test(Object t) {
		return ((Student) t).getMarks() > 90;
	}
}
