package com.example.bookmyshow.controllers;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    private  final MovieRepository movieRepository;

    public TicketController(MovieRepository repository){
        this.movieRepository = repository;
    }



    @GetMapping(path="/book")
    public String bookTicket(){
        System.out.println("Request hits the server on bookticket api");
        movieRepository.save(Movie.
                builder()
                .id(1)
                .name("ramayan")
                .language("sanskrit")
                .category("religious")
                .rating(10.0)
                .duration(3).build());
        movieRepository.save(Movie.builder()
                .id(2)
                .name("ramayan")
                .language("avadhi")
                .category("religious")
                .rating(9.5)
                .duration(3).build());
        System.out.println(movieRepository.findAll());
        System.out.println(movieRepository.findMovieByNameAndLanguage("ramayan" , "avadhi"));
        System.out.println();
        return "Your ticket has been booked !";
    }

    @GetMapping(path = "/get")
    public String getTicket(){
        System.out.println("request hit the get api");
        return "here is the ticket that you are looking for";
    }
}
