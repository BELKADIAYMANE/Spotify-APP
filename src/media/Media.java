package media;
import java.io.Serializable;
import java.util.GregorianCalendar;

@SuppressWarnings("serial")
public class Media implements Serializable{


private String title;
private GregorianCalendar release;
private int duration;
private String audio_file;
private int total_plays;

public Media(String title, GregorianCalendar release, int duration, String audio_file, int total_plays) {
	this.title = title;
	this.release = release;
	this.duration = duration;
	this.audio_file = audio_file;
	this.total_plays = total_plays;
}

public Media(String title2, GregorianCalendar date, double duration2, String audio_file2, int total_plays2) {
	// TODO Auto-generated constructor stub
}

public String gettitle() 
{
	return title;
}

public void settitle(String title)
{
	this.title = title;
}

public GregorianCalendar getrelease()
{
	return release;
}

public void setrelease(GregorianCalendar release)
{
	this.release = release;
}

public int getduration()
{
	return duration;
}

public void setduration(int duration)
{
	this.duration= duration;
}

public String getaudio_file()
{
	return audio_file;
}

public void setaudio_file(String audio_file)
{
	this.audio_file = audio_file;
}

public int gettotal_plays()
{
	return total_plays;
}

public void settotal_plays(int total_plays)
{
	this.total_plays= total_plays;
}


void download()
{
	
}

}


