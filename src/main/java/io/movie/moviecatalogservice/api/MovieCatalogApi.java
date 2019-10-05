package io.movie.moviecatalogservice.api;

import java.util.Collections;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.movie.moviecatalogservice.model.CatalogItem;

@RestController
@RequestMapping("/movie-catalog")
public class MovieCatalogApi {

	@GetMapping(value="/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatalogItem("War", "Action Movie", 9));
	}

}
