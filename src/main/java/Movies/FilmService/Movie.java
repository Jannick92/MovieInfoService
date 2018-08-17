package Movies.FilmService;

public class Movie {
	private String overview, rating, title, popularity, release_date;
	
	public Movie(String title, String rating, String popularity, String overview, String release_date) {
		this.title = title;
		this.rating = rating;
		this.overview = overview;
		this.popularity =popularity;
		this.release_date = release_date;
	}
	
	public String toString() {
		return "{ \"title\":\""+title+"\",\"Rating\": "+rating+",\"Popularity\": "+
				popularity+",\"Release Date\":\""+ release_date+"\",\"Overview\":\""+ overview+"\"}";
	}
}
