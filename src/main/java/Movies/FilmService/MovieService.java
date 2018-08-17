package Movies.FilmService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;


public class MovieService {
	private static final String key ="f54be0941e5d843972aa5e9c7d2279eb";
	
	public String getMovieInfo(String title) {
		Map<LinkedHashMap<String,Object>,ArrayList<LinkedHashMap<String, String>>> recensions=null;
		try {
			title = title.replaceAll(" ", "+").toLowerCase();
			URL url = new URL("https://api.themoviedb.org/3/search/movie?query="+ title
			        + "&api_key="+key);
	        HttpURLConnection con = (HttpURLConnection) url.openConnection();
	        con.setDoOutput(true);
	        con.setRequestMethod("GET");
	        con.setRequestProperty("Content-Type", "application/json");
	
	        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	        
	        ObjectMapper mapper = new ObjectMapper();
	        recensions = mapper.readValue(br.readLine(), Map.class);
	        
		} catch (Exception e) {
			return "{\"message\":\"ERROR can't retrieve movie information\"}";
		}
	    LinkedHashMap<String, String> recension = recensions.get("results").get(0);
	    Movie movie = new Movie(recension.get("title"), String.valueOf(recension.get("vote_average")), 
	    		String.valueOf(recension.get("popularity")),recension.get("overview"), recension.get("release_date"));
		return movie.toString();
	}
}
