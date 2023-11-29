import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test

    public void addTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    public void findTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();
    }
}
