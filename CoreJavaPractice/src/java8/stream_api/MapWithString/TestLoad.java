package java8.stream_api.MapWithString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLoad {

	public static void main(String[] args) {

		List<LoadPO> loadPOList = new ArrayList<>();

		loadPOList.add(new LoadPO(1L, 111L, 345L, 100L));
		loadPOList.add(new LoadPO(2L, 111L, 346L, 100L));
		loadPOList.add(new LoadPO(3L, 111L, 347L, 100L));

		loadPOList.add(new LoadPO(4L, 122L, 348L, 200L));
		loadPOList.add(new LoadPO(5L, 122L, 349L, 200L));
		loadPOList.add(new LoadPO(6L, 122L, 350L, 200L));

//		above code 3 po's 354, 346, 347 are belong to same supplier org 100 and same load 111.

//		i want to find supplier org with list of po's

		Stream<Entry<Long, Long>> map = loadPOList.stream()
				.map(ele -> Map.entry(ele.getSupplierOrgId(), ele.getPoId()));
		System.out.println("map.." + map);

		Map<Long, List<LoadPO>> LoadIdwithLoadMap1 = loadPOList.stream()
				.collect(Collectors.groupingBy(LoadPO::getLoadId));
		System.out.println("LoadIdwithLoadMap-1:" + LoadIdwithLoadMap1);

//			Approach-1
		Map<Long, List<Long>> LoadIdwithLoadMap2 = loadPOList.stream().collect(Collectors
				.groupingBy(LoadPO::getSupplierOrgId, Collectors.mapping(LoadPO::getPoId, Collectors.toList())));
		System.out.println("LoadIdwithLoadMap-2:" + LoadIdwithLoadMap2);

//			Approach-2
		Map<Long, List<Long>> supplierOrgPoIdsMap = loadPOList.stream()
				.map(ele -> Map.entry(ele.getSupplierOrgId(), ele.getPoId())).collect(Collectors
						.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
		System.out.println("supplierOrgPoIdsMap:" + supplierOrgPoIdsMap);

		// The two approach you provided achieve the same end result, but 1st Appraoch is preffered

	}

}
