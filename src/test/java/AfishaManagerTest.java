import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.manager.AfishaManager;
import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {
    AfishaManager manager=new AfishaManager(10);

    @Test

    public void IfNoMoviesShowNothing() {

       Movie[] movies= manager.getAll();

       assertEquals(0,movies.length);
    }

    @Test

    public void IfOneMovieShowThat() {
        Movie movie1=new Movie(1,"Http1","Movie1", "horor");
        manager.add(movie1);
        Movie[] movies = manager.getAll();
        assertEquals(1, movies.length);
    }


    @Test

    public void ShouldShowAll() {
        Movie movie1=new Movie(1,"Http1","Movie1", "horor");
        manager.add(movie1);
        Movie movie2=new Movie(2,"Http2","Movie2", "horor");
        manager.add(movie2);
        Movie movie3=new Movie(3,"Http3","Movie3", "horor");
        manager.add(movie3);
        Movie movie4=new Movie(4,"Http4","Movie4", "horor");
        manager.add(movie4);
        Movie movie5=new Movie(5,"Http5","Movie5", "horor");
        manager.add(movie5);
        Movie[] movies = manager.getAll();
        assertEquals(5, movies.length);
    }

    @Test
    public void ShouldShowFromLast() {
        Movie movie1 = new Movie(1, "Http1", "Movie1", "horor");
        manager.add(movie1);
        Movie movie2 = new Movie(2, "Http2", "Movie2", "horor");
        manager.add(movie2);
        Movie movie3 = new Movie(3, "Http3", "Movie3", "horor");
        manager.add(movie3);
        Movie movie4 = new Movie(4, "Http4", "Movie4", "horor");
        manager.add(movie4);
        Movie movie5 = new Movie(5, "Http5", "Movie5", "horor");
        manager.add(movie5);


        Movie[] movies = manager.getAll();
        Movie[] expectedMovies = new Movie[]{movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expectedMovies, movies);
    }
    @Test
    public void IfUnderLimitShouldShowAll () {
        Movie movie1 = new Movie(1, "Http1", "Movie1", "horor");
        manager.add(movie1);
        Movie movie2 = new Movie(2, "Http2", "Movie2", "horor");
        manager.add(movie2);
        Movie movie3 = new Movie(3, "Http3", "Movie3", "horor");
        manager.add(movie3);
        Movie movie4 = new Movie(4, "Http4", "Movie4", "horor");
        manager.add(movie4);
        Movie movie5 = new Movie(5, "Http5", "Movie5", "horor");
        manager.add(movie5);
        Movie movie6 = new Movie(6, "Http6", "Movie6", "horor");
        manager.add(movie6);
        Movie movie7 = new Movie(7, "Http7", "Movie7", "horor");
        manager.add(movie7);
        Movie movie8 = new Movie(8, "Http8", "Movie8", "horor");
        manager.add(movie8);
        Movie movie9 = new Movie(9, "Http9", "Movie9", "horor");
        manager.add(movie9);
        Movie movie10 = new Movie(10, "Http10", "Movie10", "horor");
        manager.add(movie10);

        Movie[] movies = manager.getAll();
        assertEquals(10, movies.length);
    }

    @Test
    public void IfUnderLimitShouldShowFromLast () {
        Movie movie1 = new Movie(1, "Http1", "Movie1", "horor");
        manager.add(movie1);
        Movie movie2 = new Movie(2, "Http2", "Movie2", "horor");
        manager.add(movie2);
        Movie movie3 = new Movie(3, "Http3", "Movie3", "horor");
        manager.add(movie3);
        Movie movie4 = new Movie(4, "Http4", "Movie4", "horor");
        manager.add(movie4);
        Movie movie5 = new Movie(5, "Http5", "Movie5", "horor");
        manager.add(movie5);
        Movie movie6 = new Movie(6, "Http6", "Movie6", "horor");
        manager.add(movie6);
        Movie movie7 = new Movie(7, "Http7", "Movie7", "horor");
        manager.add(movie7);
        Movie movie8 = new Movie(8, "Http8", "Movie8", "horor");
        manager.add(movie8);
        Movie movie9 = new Movie(9, "Http9", "Movie9", "horor");
        manager.add(movie9);
        Movie movie10 = new Movie(10, "Http10", "Movie10", "horor");
        manager.add(movie10);


        Movie[] movies = manager.getAll();
        Movie[] expectedMovies = new Movie[]{movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        assertArrayEquals(expectedMovies, movies);
    }
        @Test
        public void IfOverLimitShouldShowFeedLength () {
            Movie movie1 = new Movie(1, "Http1", "Movie1", "horor");
            manager.add(movie1);
            Movie movie2 = new Movie(2, "Http2", "Movie2", "horor");
            manager.add(movie2);
            Movie movie3 = new Movie(3, "Http3", "Movie3", "horor");
            manager.add(movie3);
            Movie movie4 = new Movie(4, "Http4", "Movie4", "horor");
            manager.add(movie4);
            Movie movie5 = new Movie(5, "Http5", "Movie5", "horor");
            manager.add(movie5);
            Movie movie6 = new Movie(6, "Http6", "Movie6", "horor");
            manager.add(movie6);
            Movie movie7 = new Movie(7, "Http7", "Movie7", "horor");
            manager.add(movie7);
            Movie movie8 = new Movie(8, "Http8", "Movie8", "horor");
            manager.add(movie8);
            Movie movie9 = new Movie(9, "Http9", "Movie9", "horor");
            manager.add(movie9);
            Movie movie10 = new Movie(10, "Http10", "Movie10", "horor");
            manager.add(movie10);
            Movie movie11 = new Movie(11, "Http11", "Movie11", "horor");
            manager.add(movie11);

            Movie[] movies = manager.getAll();
            assertEquals(10, movies.length);
        }

            @Test
            public void IfOverLimitShouldShowFromLast () {
                Movie movie1 = new Movie(1, "Http1", "Movie1", "horor");
                manager.add(movie1);
                Movie movie2 = new Movie(2, "Http2", "Movie2", "horor");
                manager.add(movie2);
                Movie movie3 = new Movie(3, "Http3", "Movie3", "horor");
                manager.add(movie3);
                Movie movie4 = new Movie(4, "Http4", "Movie4", "horor");
                manager.add(movie4);
                Movie movie5 = new Movie(5, "Http5", "Movie5", "horor");
                manager.add(movie5);
                Movie movie6 = new Movie(6, "Http6", "Movie6", "horor");
                manager.add(movie6);
                Movie movie7 = new Movie(7, "Http7", "Movie7", "horor");
                manager.add(movie7);
                Movie movie8 = new Movie(8, "Http8", "Movie8", "horor");
                manager.add(movie8);
                Movie movie9 = new Movie(9, "Http9", "Movie9", "horor");
                manager.add(movie9);
                Movie movie10 = new Movie(10, "Http10", "Movie10", "horor");
                manager.add(movie10);
                Movie movie11 = new Movie(11, "Http11", "Movie11", "horor");
                manager.add(movie11);

                Movie[] movies = manager.getAll();
                Movie[] expectedMovies = new Movie[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
                assertArrayEquals(expectedMovies, movies);

            }


        }