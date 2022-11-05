package computer;

import static baseball.Constant.*;
import static camp.nextstep.edu.missionutils.Randoms.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomNumberGenerator {
	public List<Integer> generateRandomNumber() {
		List<Integer> randomNumber = new ArrayList<>();

		while (randomNumber.size() < LENGTH_OF_NUMBER) {
			randomNumber.add(pickNumberInRange(Collections.min(VALID_DIGITS), Collections.max(VALID_DIGITS)));
			randomNumber = randomNumber.stream().distinct().collect(Collectors.toList());
		}

		return randomNumber;
	}
}
