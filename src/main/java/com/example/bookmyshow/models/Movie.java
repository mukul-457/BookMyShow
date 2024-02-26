package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Movie {
    @Id
    private int id;
    private String name;
    private String language;
    private double rating;
    private int duration;
    private  String category;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", category='" + category + '\'' +
                '}';
    }

}
