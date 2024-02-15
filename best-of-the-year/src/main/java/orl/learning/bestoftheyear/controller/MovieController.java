package orl.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import orl.learning.bestoftheyear.model.Movie;
import orl.learning.bestoftheyear.model.Song;

import java.util.ArrayList;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String moviesList(Model model) {
        ArrayList<Movie> moviesList = getMovies();
        model.addAttribute("movies", moviesList);
        return "moviesList";
    }

    @GetMapping("/details")
    public String movieDetails(@RequestParam(name = "id", required = true, defaultValue = "0") int movieId, Model model) {
        model.addAttribute("movie", getMovieById(movieId));
        return "movieDetails";
    }

    @GetMapping("/details/{movieId}")
    public String movieDetailsPath(@PathVariable(name = "movieId", required = true) int movieId, Model model) {
        model.addAttribute("movie", getMovieById(movieId));
        return "movieDetails";
    }

    private ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(0,"movieTitle0", "movieAuthor0"));
        movies.add(new Movie(1,"movieTitle1", "movieAuthor1"));
        movies.add(new Movie(2,"movieTitle2", "movieAuthor2"));
        return movies;
    }

    private Movie getMovieById(int movieId) throws IllegalArgumentException {
        if (movieId < 0)
            throw new IllegalArgumentException("movieId must be a positive number.");
        for (Movie movie : getMovies())
            if (movie.getId() == movieId)
                return movie;
        return null;
    }
}
