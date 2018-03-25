class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int number = numberToCheck;
		int length = String.valueOf(number).length();

        double answer = 0;

        while (number > 0) {
            int digit = number % 10;
            answer += Math.pow(digit,length);
            number = number / 10;
        }

        int answerInt = (int) answer;
        return answerInt == numberToCheck;
		
	}

}
