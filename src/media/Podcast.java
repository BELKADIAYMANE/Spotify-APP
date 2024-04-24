
package media;


import account.Account;

public class Podcast {
    private String title;
    private String description;
    private String RSS_Link;
    private Account podcaster;
    private Account followers;
    
    
    
    public Podcast(String title,String description,String RSS_Link, Account podcaster,Account followers){
        this.title=title;
        this.description=description;
        this.RSS_Link=RSS_Link;
        this.podcaster=podcaster;
        this.followers=followers;
        
    }

    public String getTitle() {
        return title;
    }

  
    public void setTitle(String title) {
        this.title = title;
    }

  
    public String getDescription() {
        return description;
    }

  
    public void setDescription(String description) {
        this.description = description;
    }

   
    public String getRSS_Link() {
        return RSS_Link;
    }

    
    public void setRSS_Link(String RSS_Link) {
        this.RSS_Link = RSS_Link;
    }

 
    public Account getPodcaster() {
        return podcaster;
    }

   
    public void setPodcaster(Account podcaster) {
        this.podcaster = podcaster;
    }

   
    public Account getFollowers() {
        return followers;
    }

    public void setFollowers(Account followers) {
        this.followers = followers;
    }

   
    @Override
    public String toString(){
        return"Podcast title: " +title+
                "\nDescription: " + description +
                "\nRSS link: "+RSS_Link+
                "\nPodcaster: "+podcaster;
    }
}
