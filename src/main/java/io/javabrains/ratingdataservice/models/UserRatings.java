package io.javabrains.ratingdataservice.models;

import java.util.List;

public class UserRatings {
    private List<Rating> UserRating;

    public UserRatings() {
    }

    public UserRatings(List<Rating> userRating) {
        UserRating = userRating;
    }

    public List<Rating> getUserRating() {
        return UserRating;
    }

    public void setUserRating(List<Rating> userRating) {
        UserRating = userRating;
    }
}
