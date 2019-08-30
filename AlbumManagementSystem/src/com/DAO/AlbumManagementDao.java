package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import com.beans.Album;
import com.beans.Song;
import com.Utility.DatabaseUtil;

public class AlbumManagementDao implements AlbumData {
	public int getTotalSongDownloadsForAlbum(int albumId) {
		Connection con = null;

		int totalDownloads = -1;
		try {

			con = DatabaseUtil.getConnect();

			String query = "select sum(song_downloads) from song where album_id = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, albumId);

			ResultSet rs = pstmt.executeQuery();
			rs.next();
			totalDownloads = rs.getInt("sum(song_downloads)");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return totalDownloads;

	}

	public ArrayList<Song> retrieveSongBasedOnSingerName(String singerName) {
		ArrayList filteredSongList = new ArrayList<Song>();

		Connection con = null;

		try {

			con = DatabaseUtil.getConnect();
			String query = "select * from song where song_singer_name = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, singerName);

			ResultSet rs = pstmt.executeQuery();
			rs.next();

			int songID = rs.getInt("song_id");
			int albumID = rs.getInt("album_id");
			String singName = rs.getString("song_singer_name");
			double sDuration = rs.getDouble("song_duration");
			int sDownloads = rs.getInt("song_downloads");

			Song song1 = new Song(songID, albumID, singName, sDuration, sDownloads);

			filteredSongList.add(song1);

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return filteredSongList;
	}

	public Album retrieveAlbumWithMaxAlbumRate() {
		Album albumObj = null;

		Connection con = null;
		try {

			con = DatabaseUtil.getConnect();

			String query = "select * from album where album_rating in (select max(album_rating) from Album);";

			PreparedStatement pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			int albumID = rs.getInt("album_id");
			String albumName = rs.getString("album_name");
			String albumComposer = rs.getString("album_composer");
			String albumType = rs.getString("album_type");
			float albumRating = rs.getFloat("album_rating");
			albumObj = new Album(albumID, albumName, albumComposer, albumType, albumRating);
			

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DatabaseUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return albumObj;
	}

	public HashMap<String, Integer> getNoOfSongByComposer() {
		HashMap songsByComposer = new HashMap<String, Integer>();

		return songsByComposer;

	}

}
