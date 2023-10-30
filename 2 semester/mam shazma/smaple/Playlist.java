import java.util.ArrayList;
public class Playlist{
	
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