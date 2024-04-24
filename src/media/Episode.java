package media;

import java.util.GregorianCalendar;

@SuppressWarnings("serial")
public class Episode extends Media {

	    private Podcast podcast;
	    
	    public Episode(String title, GregorianCalendar date, double duration, String audio_file, int total_plays, Podcast podcast) {
	        super(title, date, duration, audio_file, total_plays);
	        this.podcast=podcast;
	        
	    }
	    
	    @Override
	    public String toString(){
	        return "Episode Information:"+super.toString()+"\n\t\t\tPodcast: "+podcast.getTitle();
	    }

	   
	    public Podcast getPodcast() {
	        return podcast;
	    }

	    public void setPodcast(Podcast podcast) {
	        this.podcast = podcast;
	    }

	}

