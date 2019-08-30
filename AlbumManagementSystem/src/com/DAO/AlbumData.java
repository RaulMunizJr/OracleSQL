package com.DAO;

import java.util.ArrayList;
import java.util.HashMap;

import com.beans.Album;
import com.beans.Song;

public interface AlbumData {
	public int getTotalSongDownloadsForAlbum(int totalDownloads);
	public ArrayList<Song> retrieveSongBasedOnSingerName(String singerName);
	public Album retrieveAlbumWithMaxAlbumRate();
	public HashMap<String, Integer> getNoOfSongByComposer();

}
