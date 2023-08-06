package java8.stream_api.MapWithString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestOrgMain {

	public static void main(String[] args) {

		List<Organization> orgList = new ArrayList<>();

		orgList.add(new Organization(101L, "FlipKart", "1 2 3"));
		orgList.add(new Organization(102L, "Amazon", "4 5 6"));

		System.out.println("orgList" + orgList);

		// output version 1 which is return the object of flat map
		/*
		 * List<Entry<Long, Long>> orgUserFlatMap = orgList.stream() .filter(org ->
		 * (!org.getUserIds().equals(null) || org.getUserIds().equals(""))) .flatMap(org
		 * ->
		 * Arrays.stream(org.getUserIds().split("\\s+")).map(Long::parseLong).distinct()
		 * .map(userId -> Map.entry(org.getOrgId(), userId)))
		 * .collect(Collectors.toList());
		 */

		Map<Long, List<Long>> orgUserMap = orgList.stream()
				.filter(org -> (!org.getUserIds().equals(null) || org.getUserIds().equals("")))
				.flatMap(org -> Arrays.stream(org.getUserIds().split("\\s+")).map(Long::parseLong).distinct()
						.map(userId -> Map.entry(org.getOrgId(), userId)))
				.collect(Collectors.groupingBy(Map.Entry::getKey,
						Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

		System.out.println("orgnization and user map" + orgUserMap);
        //output: orgnization and user map{101=[1, 2, 3], 102=[4, 5, 6]}
	}
}
