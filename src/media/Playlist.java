package media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import rank.*;
public class Playlist {

	private ArrayList<Rating> list;
	private ArrayList<Media> medias;
	private String title;
	private String description;
	private String cover;
	private Access level;
	
	public Playlist( String title, String description, String cover,
			String level) {
		super();

		this.title = title;
		this.description = description;
		this.cover = cover;
		this.level = Access.valueOf(level.toUpperCase());
	}

	
	public ArrayList<Media> getMedias() {
		return medias;
	}

	public void setMedias(ArrayList<Media> medias) {
		this.medias = medias;
	}
	public ArrayList<Rating> getList() {
		return list;
	}

	public void setList(ArrayList<Rating> list) {
		this.list = list;
	}
	
	public String gettitle(){
	    return title;
	}

	public void settitle(String title)
	{
	    this.title = title;
	}
	
	public String getdescription(){
	    return description;
	}

	public void setdescription(String description){
	    this.description = description;
	}
	
	public String getcover(){
	    return cover;
	}

	public void setcover(String cover){
	    this.cover = cover;
	}
	
	public Access getlevel () {
		return level;
	}
	
	public void setlevel(Access level) {
		this.level = level;
	}

	public void play(Media media) {
		if(medias.contains(media)) {
			System.out.println(media.gettitle() + "is playing");
		}
	}
	
	public void shuffle() {
		
	}
	
	public boolean add(ArrayList<Media> medias, Media med) {
		
	        medias.add(med);
	          
	       return true;
	    }
	
	public boolean remove(Media med) {
	        return medias.remove(med);
	    }

	public void skip() {
		
	}
	
	   @SuppressWarnings("unchecked")
	public void sortMedias(@SuppressWarnings("rawtypes") Comparator comp) {
	        Collections.sort(medias, comp);
	    }
		@Override
		public String toString() {
			return "Playlist [list=" + list + ", medias=" + medias + ", title=" + title + ", description=" + description
					+ ", cover=" + cover + ", level=" + level + "]";
		}

}

