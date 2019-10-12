package io.movie.moviecatalogservice.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.movie.moviecatalogservice.model.CatalogItem;
import response.MovieRatingResponse;
import response.MovieResponse;

@RestController
@RequestMapping("/movie-catalog")
public class MovieCatalogApi {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		// Get all movie ratings from userId
		MovieRatingResponse movieRatingResponse = restTemplate
				.getForObject("http://movie-rating-service/movie-ratings/" + userId, MovieRatingResponse.class);
		// Get all movies from rating.movieId and return the list
		return movieRatingResponse.getMovieRatings().stream().map(rating -> {
			MovieResponse movieResponse = restTemplate.getForObject("http://movie-info-service/movie-info/" + rating.getMovieId(),
					MovieResponse.class);
			return new CatalogItem(movieResponse.getMovie().getName(), "desc", rating.getRating());
		}).collect(Collectors.toList());
	}
}
