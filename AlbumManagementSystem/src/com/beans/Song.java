package com.beans;

public class Song {
	private int songId;
	private int albumId;
	private String singerName;
	private double duration;
	private int noOfDownloads;
	

	public Song(int sId, int aId, String sName, double d, int noD)
	{
		this.songId = sId;
		this.albumId = aId;
		this.singerName = sName;
		this.duration = d;
		this.noOfDownloads = noD;	
	}
	
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", albumId=" + albumId + ", singerName=" + singerName + ", duration="
				+ duration + ", noOfDownloads=" + noOfDownloads + "]";
	}
	
	

}
