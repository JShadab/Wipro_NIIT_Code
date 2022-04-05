package com.niit;

import java.util.ArrayList;
import java.util.List;

public class SongPlaylist {

	private List<Song> playlist;

	private int currentIndex;

	public SongPlaylist() {
		playlist = new ArrayList<Song>();
	}

	public void addSongInBegining(Song song) {

		playlist.add(0, song);

	}

	public int getNumberOfSongs() {
		return playlist.size();

	}

	public Song nextSong() {

		if (currentIndex >= (getNumberOfSongs() - 1)) {
			currentIndex = getNumberOfSongs() - 1;
		} else {
			currentIndex = currentIndex + 1;
		}

		return playlist.get(currentIndex);

	}

	public Song previousSong() {

		if (currentIndex <= 0) {
			currentIndex = 0;
		} else {
			currentIndex = currentIndex - 1;
		}

		return playlist.get(currentIndex);

	}

	public void deleteSong(Song song) {

		playlist.remove(song);

	}

	void display() {
		System.out.println(playlist);
	}

}
