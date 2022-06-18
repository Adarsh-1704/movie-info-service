package com.codezone.movieinfoservice.MovieData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MovieData {
    Integer movieId;
    String movieName;
    Integer year;
}