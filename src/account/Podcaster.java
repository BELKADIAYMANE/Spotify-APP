package account;
import java.util.ArrayList;
import media.*;

public class Podcaster extends User{
	
private ArrayList<Podcast> podcasts;

public ArrayList<Podcast> getPodcasts() {
	return podcasts;
}

public void setPodcasts(ArrayList<Podcast> podcasts) {
	this.podcasts = podcasts;
}

public Podcaster(Profile profile) {
	super(profile);
	this.podcasts = new ArrayList<>();
}

public void post_podcast(Podcast podcast){
    this.podcasts.add(podcast);
    System.out.println("Successfully posted the podcast of title: "+podcast.getTitle());
}

@Override
public String toString() {
	return super.toString()+ "Podcast: " + podcasts;
}

}
