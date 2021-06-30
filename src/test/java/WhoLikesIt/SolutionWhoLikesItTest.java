package WhoLikesIt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionWhoLikesItTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", SolutionWhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", SolutionWhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionWhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Jens and Monica like this", SolutionWhoLikesIt.whoLikesIt("Jens", "Monica"));
        assertEquals("Max, John and Mark like this", SolutionWhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", SolutionWhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Alexandra, Jacobinus and 9 others like this", SolutionWhoLikesIt.whoLikesIt("Alexandra", "Jacobinus", "Mark", "Max", "Uli", "Hila", "Oli", "Ralf", "Peter", "Paul", "Gustav"));

    }
}
