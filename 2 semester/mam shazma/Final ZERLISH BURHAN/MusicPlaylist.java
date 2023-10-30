import java.util.Scanner;
import java.util.ArrayList;

class Audio extends Song {
    private int volume;

    public Audio(){

    }

    public Audio(String title, String duration, String artist, int volume) {
        super(title, duration, artist);
        this.volume = volume;
    }

    public String toString() {
      return "Artist : " + getArtist() + "\nTitle : " + getTitle() + "\nDuration : " + getDuration() + " min" + "\nVolume : " + volume;
   }

}

class Video extends Song {
    private String resolution;

    public Video() {

    }

    public Video(String title, String duration, String artist, String resolution) {
        super(title, duration, artist);
        this.resolution = resolution;
    }

    public String toString() {
        return  "Artist : " + getArtist() + "\nTitle : " + getTitle() + "\nDuration : " + getDuration() + " min"  + "\nResolution: " + resolution + "px";
    }
}

class User {
    private String userName;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String toString() {
        return "User Name : " + userName;
    }
}

class Playlist{
    private String name;
    private final ArrayList<Song> songs;
    private User user;

    public Playlist(String name, User user) {
        this.name = name;
        this.user = user;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void removeSong(int index) {
        this.songs.remove(index);
    }

    public void display() {
     for (int i = 0; i < songs.size(); i++) {
        Song song = songs.get(i);
        System.out.println("Song " + (i + 1) + ":");
        System.out.println(song);
        if (song instanceof Audio) {
            System.out.println("Song Type: Audio");
        } else if (song instanceof Video) {
            System.out.println("Song Type: Video");
        }
        System.out.println();
    }
    }


    public String toString() {
        return "User Name : " + user.getUserName() + "\nPlaylist Name : " + name;
    }
}

abstract class Song{

    private String title;
    private String duration;
    private String artist;

    public Song() {

    }

    public Song(String title, String duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String toString();

     
}

public class MusicPlaylist{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the User name :");
        String user = keyboard.nextLine();
        // keyboard.nextLine();
        User u1 = new User(user);
        System.out.print("Enter the name of the Playlist :");
        String playlist = keyboard.nextLine();
        Playlist p1 = new Playlist(playlist, u1);
        System.out.println();
        System.out.println(p1.toString());
        System.out.println();

        while (true) {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Enter 1 if you want to add a song.");
            System.out.println("Enter 2 if you want to display.");
            System.out.println("Enter 3 if you want to remove a song.");
            System.out.println("Enter 4 if you want to exit.");
            System.out.println("------------------------------------------------------------------------------");
            int num = keyboard.nextInt();
            System.out.println();
            switch (num) {
                case 1:
                    System.out.println("..........ADD..........");
                    System.out.println("Enter 1 to add an audio song.");
                    System.out.println("Enter 2 to add a video song.");
                    int songType = keyboard.nextInt();
                    System.out.println();

                    System.out.print("Enter the song title :");
                    String t = keyboard.next();
                    keyboard.nextLine();
                    System.out.print("Enter the duration of the song :");
                    String d = keyboard.next();
                    System.out.print("Enter the song Artist :");
                    String a = keyboard.next();
                    keyboard.nextLine();

                    if (songType == 1) {
                        System.out.print("Enter the volume of the audio song :");
                        int volume = keyboard.nextInt();
                        Audio audio = new Audio(t, d, a, volume);
                        p1.addSong(audio);
                    } else if (songType == 2) {
                        System.out.print("Enter the resolution of the video song :");
                        String resolution = keyboard.next();
                        Video video = new Video(t, d, a, resolution);
                        p1.addSong(video);
                    } else {
                        System.out.println("Invalid song type.");
                    }

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
                    System.out.print("Enter the index of the song you want to remove : ");
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
            }
        }
    }
}
