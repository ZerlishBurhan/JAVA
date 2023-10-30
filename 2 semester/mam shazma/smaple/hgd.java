public void addSong(Song songs){
		if(songCount < song.length){
			this.song[songCount] = songs;
			songCount++;
		}
		else{
			System.out.println("Playlist is full!......");
		}
	}
	 
	public void removeSong(Song song){
		int indexToRemove = -1;
		for(int i = 0; i < songCount ; i++){
			if(this.song[i].equals(song)){
				indexToRemove = i;
				break;
			}//if
		}//for
		if(indexToRemove != -1){
			for(int i = indexToRemove; i < songCount -1 ; i++){
				this.song[i] = this.song[i+1];
			}
			this.song[songCount -1 ] = null;
			songCount--;
		}
		else{
			System.out.println("Song not Found! .......");
		}//else
	}

	public void listOfSongs(){
		System.out.println("Play list name : " + name);
		for(int i = 0 ; i < songCount ; i++){
			System.out.println("User Name:   " + user.getUserName() + "   Title : "+ song[i].getTitle() +"----" + "    Artist :"+song[i].getArtist()  );
		}
	}// System.out.println(" Do you want to enter audio song or video song ? ");
			 		// String type = keyboard.next();
			 		// if(type=="Audio"||type=="audio" ){
			 		// 				System.out.println("Enter the volume : ");
			 		// 				int v = keyboard.nextInt();
			 		// 				Audio a1 = new Audio(t , d , a , v);
			 		// 				p1.addSong(a1);
			 		// }
			 		// else if(type=="Video"|| type=="video"){
					// 				System.out.println("Enter the resolution : ");
					// 				String r = keyboard.next();
					// 				Videosong v1 = new Videosong(t , d , a , r);
					// 									p1.addSong(v1);
			 		// }