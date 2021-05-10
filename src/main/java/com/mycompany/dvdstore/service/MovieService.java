package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;

public class MovieService implements MovieServiceInterface {

    public GoLiveMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(GoLiveMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    private GoLiveMovieRepository movieRepository;




    public void registerMovie(Movie movie) {
//   movieRepository.add(movie);
//    goLiveMovieRepository.add(movie);
        movieRepository.add(movie);
    }
}
