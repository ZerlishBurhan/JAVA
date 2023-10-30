import java.util.Scanner;
import java.util.ArrayList;

class User{
	
	private String userName;

	public User(){

	}
	public User(String userName){
		this.userName = userName;
	}

	public void setUserName(){
		this.userName = userName; 
	}
	public String getUserName(){
		return userName;
	}

	public String toString(){
		return "User Name : " + userName;
	}
}
 class Playlist{
	
	private String name;
	private ArrayList<Song> song;
	private User user;

	public Playlist(){

	}//constructor

	public Playlist(String name,User user){
		this.name = name;
		this.user = user;
		this.song = new ArrayList<>();
	}//constructor

	public void addSong(Song song){
		this.song.add(song);
	}

	public void removeSong(int index){
		this.song.remove(index);
	}

	public ArrayList<Song> getSongs(){
		return song;
	}

	public void display(){
		for(Song s : song){
			System.out.println(s);
		}
	}

	public String toString(){
		return "User Name : " + user.getUserName() + "\nPlaylist Name : " + name;
	}	
	

}
class Song{
	
	private String title;
	private String duration;
	private String artist;

	public Song(){

	}
	public Song(String title ,String duration,String artist){
		this.title = title;
		this.duration = duration;
		this.artist = artist;
	}

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}
	public String getDuration(){
		return duration;
	}

	public void setArtist(){
		this.artist = artist;
	}
	public String getArtist(){
		return artist;
	}

	public String toString(){
		return "Artist : " + artist + "\nTitle : " + title + "\nDuration : " + duration ;
	}
}//song

class Main{

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

while(true){
System.out.println("------------------------------------------------------------------------------");
		System.out.println("Enter 1 if you want add user and playlist");
		
System.out.println("------------------------------------------------------------------------------");
		int num = keyboard.nextInt();
System.out.println();
		switch(num){
			case 1:
				System.out.println("Enter the User name :");
				String user = keyboard.next();
				User u1 = new User(user);				
System.out.println();
				System.out.println("Enter the  name of the Playlist :");
				String playlist = keyboard.next();
System.out.println();
				Playlist p1 = new Playlist(playlist , u1);
				System.out.println(p1.toString());
System.out.println();

			while(true){
System.out.println("------------------------------------------------------------------------------");
		System.out.println("Enter 1 if you want to add song.");
		System.out.println("Enter 2 if you want to display.");
		System.out.println("Enter 3 if you want to remove.");
		System.out.println("Enter 4 if you want to exit.");
System.out.println("------------------------------------------------------------------------------");
		int n = keyboard.nextInt();
System.out.println();
		switch(n){
			case 1:
				System.out.println("..........ADD..........");
					System.out.println("Enter the song title :");
					String t = keyboard.next();
					System.out.println("Enter the duration of  song :");
					String  d =  keyboard.next();
					System.out.println("Enter the song Artist :");
					String a =  keyboard.next();
					
			 		Song song1 = new Song(t , d , a);
			 		System.out.println();
					p1.addSong(song1);
					System.out.println();
					break;

			case 2:
								System.out.println("..........DISPLAY..........");

					System.out.println("Songs in playlist ");
					p1.display();
					System.out.println();
					break;

			case 3:
								System.out.println("..........REMOVE..........");

					System.out.println("Enter the song you want to remove : ");
					int index = keyboard.nextInt();
					p1.removeSong(index);
					System.out.println();
					break;

			case 4:
				System.out.println("..........EXIT..........");

					System.exit(0);
					break;

			default:

					System.out.println("Invalid number");
					break;
	}//switch	

}//while

	case 2:
				System.out.println("..........EXIT..........");

					System.exit(0);
					break;

			default:

					System.out.println("Invalid number");
					break;



	}//switch		
}//while



	}//main
}//class