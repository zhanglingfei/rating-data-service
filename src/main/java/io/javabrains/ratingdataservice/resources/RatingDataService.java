package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingDataService {

    @RequestMapping("/{movieId}")
    public rating getRatings(@PathVariable("movieId") String movieId){
        return new rating(movieId,4);

    }
}
