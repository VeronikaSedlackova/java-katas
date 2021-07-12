package FindTheParityOutlier;


public class FindOutlier {
    static int find(int[] integers) {

        for (int i = 1; i < integers.length - 1; i++) {
            Boolean first = integers[i - 1] % 2 == 0;
            Boolean second = integers[i] % 2 == 0;
            Boolean third = integers[i + 1] % 2 == 0;

            if (first.equals(second)) {
                if (!third.equals(first)) return integers[i + 1];
            } else if (first.equals(third)) {
                if (!second.equals(first)) return integers[i];
            } else if (second.equals(third)) {
                if (!first.equals(second)) return integers[i - 1];
            }
        }
        return integers[0];
    }


   /*  Since we are warned the array may be very large, we should avoid counting values any more than we need to.
     We only need the first 3 integers to determine whether we are chasing odds or evens.
     So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
     It will be 0 for even numbers and 1 for odd numbers.
     Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.

        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
               .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    */
}
