package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.Rating;
import io.javabrains.ratingdataservice.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataService {

    @RequestMapping("movie/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("user/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String UserId){
        //first we define an array of list hardcoded data to simulate Database
        List<Rating> ratings= Arrays.asList(
                new Rating("3353", 4),
                new Rating("23534",3)
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRating(ratings);
        return userRatings;//this is returned for microservice called by movie-catalog-service


    }
}
