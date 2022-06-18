package com.codezone.movieinfoservice.Controller;

import com.codezone.movieinfoservice.MovieData.MovieData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/Data")
    public MovieData getMovieData(@RequestParam Integer movieId){
        MovieData data1 = new MovieData(1,"Batman",2010);
        MovieData data2 = new MovieData(2,"Ironman",2008);
        MovieData data3 = new MovieData(3,"Superman",2012);
        MovieData data4 = new MovieData(4,"Aquaman",2018);
        MovieData data5 = new MovieData(5,"Spiderman",2021);
        Map<Integer,MovieData> map = new HashMap<>();
        map.put(1,data1);
        map.put(2,data2);
        map.put(3,data3);
        map.put(4,data4);
        map.put(5,data5);
        return map.get(movieId);
    }
}