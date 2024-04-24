package rank;
import account.*;
import media.*;
public class Rating {

private Rate rate;
private Account user;
private Media media;

public Rating(String rate, Account user, Media media) {
	super();
	this.rate = Rate.valueOf(rate.toUpperCase());
	this.user = user;
	this.media = media;
}
public Rate getrate(){
    return rate;
}

public void setrate(Rate rate){
    this.rate = rate;
}

public Account getuser(){
    return user;
}

public void setuser(Account user){
    this.user = user;
}

public Media getmedia(){
    return media;
}

public void setmedia(Media media){
    this.media = media;
}
@Override
public String toString() {	
	return "Rate: "+ rate + "\nUser: "+ user + "\nMedia: " + media;
}

}
