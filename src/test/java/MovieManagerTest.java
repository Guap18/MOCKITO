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

    @Test

    public void TestLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        int limit = 5;
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestAboveLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        int limit = 6;
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestBelowLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie 1");
        manager.addMovie("Movie 2");
        manager.addMovie("Movie 3");
        manager.addMovie("Movie 4");
        manager.addMovie("Movie 5");
        manager.addMovie("Movie 6");
        manager.addMovie("Movie 7");
        int limit = 4;
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}

