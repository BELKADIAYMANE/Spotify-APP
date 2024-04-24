package media;
import account.*;
import rank.Rating;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.io.File;
public class SpotifyApp {
	private static final String FILENAME = "spotify.ser";
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		ArrayList<Media> medias = new ArrayList<>();
		try {
            File file = new File("spotify.ser");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String username = parts[0];
                String password = parts[1];
                accounts.add(new Account(username, password));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

		
		System.out.println("Please enter a number according to the following:\n" 
			+ "1. Sign up");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int choice1 = sc1.nextInt();
			System.out.println("Please enter the profile name: ");
	        String name = sc1.next();
	        System.out.println("Please enter the profile gender: ");
	        String gender = sc3.nextLine();
	        

	        System.out.println("Enter the year of birth: ");
	        int year = sc1.nextInt();
	        System.out.println("Enter the month of birth: ");
	        int month = sc1.nextInt();
	        System.out.println("Enter the day of birth: ");
	        int day = sc1.nextInt();
	        GregorianCalendar birth= new GregorianCalendar(year, month, day);
			
	        
	        Profile profile1 = new Profile(name, Gender.valueOf(gender), birth);
	 
	        // User
	        User user1 = new User(profile1);

	        // Account
	        System.out.println("Profile has been created. Here are your information: "+ profile1.toString() );
	        
	        System.out.println("Please enter the account username: ");
	        String username = sc1.next();
	        System.out.println("Please enter the account password: ");
	        String password = sc1.next();

	        Account newAccount = new Account(username, password);
	        accounts.add(newAccount);
	        newAccount.setUser(user1);
	        System.out.println("New account added:");
	        System.out.println(newAccount);
		
		        try {
		            FileWriter writer = new FileWriter(FILENAME, true);

		            for (Account account : accounts) {
		                writer.write(account.getUsername() + "," + account.getPassword() + "\n");
		            }

		            writer.close();
		        } catch (IOException e) {
		            System.out.println("Error writing to file: " + e.getMessage());
		        }
		    
		Account acc = new Account("Spipah", "12321");
        Account acc_pod = new Account("Yahya DIZZY", "password");
        
        String pod_description= "a long form conversation hosted by Yahya DIZZY with his friends and includes celebrities";
		GregorianCalendar release1= new GregorianCalendar(2017,04,17);
		GregorianCalendar release2= new GregorianCalendar(2019,01,27);
		GregorianCalendar release3= new GregorianCalendar(2023,9,11);
		GregorianCalendar release4= new GregorianCalendar(2021,7,21);
		GregorianCalendar release5= new GregorianCalendar(2022,5,6);
		Song s1= new Song("Spahpoha",release1,4.00,"Spahpoha.mp3",6900000,"RAP","Spipah Express","lyrics");
		Song s2= new Song("Tarhinox",release2,2.18,"Tarhinox.mp3",10000,"JAZZ","Spipah Express","lyrics");
		Song s3= new Song("RMCL",release3,2.23,"RMCL.mp3",123436700,"POP","Spipah Express","lyrics");
		Podcast pod= new Podcast("Discover with DIZZY",pod_description,"Link",acc_pod,acc);
		
		Episode ep1=new Episode("Black boys",release4,72,"#5438.mp3",1223000,pod);
		Episode ep2=new Episode("Game of throwns",release5,54,"#5439.mp3",193000,pod);
	
		int i;
	do{
         System.out.println("1-Display Profile information:\n"
         		+ "2-Play song:\n"
         		+ "3-Play an episode of a podcast\n"
         		+ "4-Create playlist:\n"
         		+ "5-Quit\n"
         		+ "Choose an option: ");

     i =sc1.nextInt();
    
     switch(i){
         case 1:
              //create a sample profile for the account
             GregorianCalendar date = new GregorianCalendar(2003, 11, 7);
             Profile profile= new Profile("Adam",Gender.MALE ,date);
             System.out.println("\n"+profile.toString());
             break;
             
         case 2:  
             System.out.println("Choose a song:\t1/ Spahpoha"+"\n\t\t2/ Tarhinox"+"\n\t\t3/ RMCL");
             int c=sc1.nextInt();
             if(c==1) {
             System.out.println("You are listening to:");
                 System.out.println("Spahpoha");
             }
             else if(c==2) {
            	 System.out.println("You are listening to:");
                 System.out.println("Tarhinox");	 
             }
             else {
            	 System.out.println("You are listening to:");
                 System.out.println("RMCL"); 
             }
             break;
          
         case 3:
             System.out.println("Choose an episode:\t1/ Black boys"+"\n\t\t2/ Game of throwns");
             int s=sc1.nextInt();
             if(s==1) {
             System.out.println("You are listening to:");
                 System.out.println("Black boys");
             }
             else{
            	 System.out.println("You are listening to:");
                 System.out.println("Game of throwns");	 
             }
             break;
         case 4: 
             
             System.out.println("\nTo create playlist enter the following:");
             System.out.println("Enter title:");
             String title = sc1.next();
             System.out.println("Enter description:");
             String description = sc1.next();
             System.out.println("Enter cover:");
             String cover = sc1.next();
             System.out.println("Choose access level(PUBLIC/PRIVATE):");

             String lvl = sc1.next().toUpperCase() ;
             Playlist plylst=new Playlist(title,description,cover,lvl);
             System.out.println("\n"+plylst.toString());   
             
             
             System.out.println("Add media to the playlist\n");
             Media m1 = new Media("aymen",release1, 2, "media.mp3",293847);
             plylst.add(medias, m1);
             
             System.out.println(plylst.toString());
             
             
             System.out.println("Rate the playlist(LIKE/NOTLIKE/NOTRATED):");
             String rate=sc1.nextLine();
             Rating rating= new Rating(rate,acc,m1);
             plylst=new Playlist(title,description,cover,lvl);
             System.out.println("\n"+plylst.toString());
             
             
             break;
         case 5:
        	 System.out.println("Thank you for using spotify, here is your playlist sorted: \n");
        	 //Collections.sort(plylst);
        	 break;
         default:
             System.out.println("\nError: wrong input\n");
         
             
     }        
     }while(i!=0);
}
}

