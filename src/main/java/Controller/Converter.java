package Controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Converter {
	public static List<Integer> convertStringToIntegerList(String number) {
		return Stream.of(number)
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}
}
