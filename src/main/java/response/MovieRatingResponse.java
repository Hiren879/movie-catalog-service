package response;

import java.util.List;

import io.movie.moviecatalogservice.model.MovieRating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieRatingResponse {
	List<MovieRating> movieRatings;
}
