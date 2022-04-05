package com.niit;

public class SongPlaylistImpl {

	public static void main(String[] args) {

		Song s1 = new Song("Dheere Dheere", 60);
		Song s2 = new Song("Hume tumse pyar kitna", 45);
		Song s3 = new Song("Dance meri Rani", 80);
		Song s4 = new Song("Kachha Badam", 70);

		SongPlaylist playlist = new SongPlaylist();

		playlist.addSongInBegining(s1);
		playlist.addSongInBegining(s2);
		playlist.addSongInBegining(s3);
		playlist.addSongInBegining(s4);

		playlist.display();

		System.out.println(playlist.getNumberOfSongs());
		
		System.out.println(playlist.nextSong());
		System.out.println(playlist.nextSong());
		System.out.println(playlist.nextSong());
		System.out.println(playlist.nextSong());
		System.out.println(playlist.nextSong());
		
		System.out.println("----------------");
		
		System.out.println(playlist.previousSong());
		System.out.println(playlist.previousSong());
		System.out.println(playlist.previousSong());
		System.out.println(playlist.previousSong());
		System.out.println(playlist.previousSong());

	}

}
