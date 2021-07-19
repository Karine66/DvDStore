package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {
    @Autowired
    public MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }




    public void addUsingConsole() {
        System.out.println( "What is the movie title ?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("What is the movie gender ?");
        String gender = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGender(gender);
        movieService.registerMovie(movie);
    }
}
