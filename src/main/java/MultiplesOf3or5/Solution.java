package MultiplesOf3or5;


public class Solution {
    public int solution(int number) {

        int multiplesSum = 0;
        int counterThree = 0;
        int counterFive = 0;
        int three = 3;
        int five = 5;
        int doubleMultiplesThree[] = new int[number / three];
        int doubleMultiplesFive[] = new int[number / five];
        int countDigit;

        // if negative number return zero
        if (number < 0) {
            return multiplesSum;
        }

        while (three < number || five < number) {
            if (three < number) {
                doubleMultiplesThree[counterThree] += three;
                multiplesSum += three;
                three += 3;
                counterThree++;
            }

            if (five < number) {
                doubleMultiplesFive[counterFive] += five;
                five += 5;
                counterFive++;
            }
        }

        // check if both 3 and 5 are multiple of number
        for (int i = 0; i < doubleMultiplesFive.length; i++) {
            countDigit = 0;
            for (int j = 0; j < doubleMultiplesThree.length; j++) {
                if (doubleMultiplesFive[i] == doubleMultiplesThree[j]) {
                    break;
                } else {
                    countDigit++;
                }
                if (countDigit == doubleMultiplesThree.length) {
                    multiplesSum += doubleMultiplesFive[i];
                }
            }
        }
        return multiplesSum;


//        int sum=0;
//
//        for (int i=0; i < number; i++){
//            if (i%3==0 || i%5==0){sum+=i;}
//        }
//        return sum;

    }

}
