package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AfishaManager {
int feedLength = 10;

    public AfishaManager(int feedLength) {
        this.feedLength = feedLength;
    }

    private Movie[] movies=new Movie[0];

public void add(Movie movie) {
    int length= movies.length+1;
    Movie[] feed=new Movie[length];
    System.arraycopy(movies, 0, feed, 0, movies.length);
    int lastMovie=feed.length-1;
    feed[lastMovie]=movie;
    movies=feed;


}

    public Movie[] getAll() {
    int length;
    if (movies.length > feedLength)
        length=feedLength;
    else length= movies.length;
        Movie[] result=new Movie[length];

    int currentIndex = 0;
    for (int i= movies.length-1; i > movies.length-1-length;i--) {
        result[currentIndex++]=movies[i];
    }
    return result;
    }

 public static void main(String[] args) {
 AfishaManager manager=new AfishaManager();


}
}
