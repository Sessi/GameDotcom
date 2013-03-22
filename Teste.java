public class Teste {
	public static void main (String[] args) {
	SimpleDotCom dot = new SimpleDotCom();

	int [] locations = {2,3,4};

	dot.setLocationCells(locations);

	String userGuess = "2";

	String result = dot.checkYourself (userGuess);
	String testResult = "failed";
	if (result.equals("hit")) {
		testResult = "passed";
	}
	System.out.println(testResult);
	}

	public String checkYourself (String stringGuess) {
	int guess = Integer.parseInt (stringGuess);

	String result = "miss";

	for (int cell: locationCells) {
		if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
		}//fim do teste if
	}//fim do teste loop for

	if (numOfHits == locationCells.length) {
		result = "kill";
	}//fim do teste if

	System.out.println(result);

	return result;
	}//fim do método
}

