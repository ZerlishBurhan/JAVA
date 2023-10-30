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