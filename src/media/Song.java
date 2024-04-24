package media;

import java.util.GregorianCalendar;


@SuppressWarnings("serial")
public class Song extends Media{

    private Genre genre;
    private String artist;
    private String lyrics;
    private String album;
   

    public Song(String title, GregorianCalendar date, double duration, String audio_file, int total_plays, String genre, String artist, String lyrics) {
        super(title, date, duration, audio_file, total_plays);
        this.genre = Genre.valueOf(genre.toUpperCase());
        this.artist = artist;
        this.lyrics = lyrics;

    }

    public Song(String title, GregorianCalendar date, double duration, String audio_file, int total_plays, String genre, String artist, String lyrics, String album) {
        this(title, date, duration, audio_file, total_plays, genre, artist, lyrics);
        this.album = album;
    }

  
    public Genre getGenre() {
        return genre;
    }

   
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

   
    public String getArtist() {
        return artist;
    }

   
    public void setArtist(String artist) {
        this.artist = artist;
    }

    
    public String getLyrics() {
        return lyrics;
    }

   
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    
    public String getAlbum() {
        return album;
    }

   
    public void setAlbum(String album) {
        this.album = album;
    }
    

    @Override
    public String toString() {
        String str="\n\t\t\tGenre: " + genre + "\n\t\t\tArtist: " + artist + "\n\t\t\tLyrics: " + lyrics ;
        if (album != null ) {
            return "Song Information:"+super.toString()+str+"\n\t\t\tAlbum: " + album;
        } else {
            return "Song Information:"+super.toString()+str;
        }
       
    }
    

}
