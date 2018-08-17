package Movies.FilmService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieInfoApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(MovieInfoApp.class, args);
    }
}