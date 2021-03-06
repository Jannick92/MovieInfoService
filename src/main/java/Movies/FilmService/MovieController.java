package Movies.FilmService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	private MovieService ms;
	 
	 public MovieController() {
		 ms = new MovieService();
	 }

	 @RequestMapping("/info")
	 public String getReview(@RequestParam(value="title") String title) {
		 return ms.getMovieInfo(title);
	 }
}
