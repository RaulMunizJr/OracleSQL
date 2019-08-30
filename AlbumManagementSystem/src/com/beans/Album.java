package com.beans;

public class Album {
	private int albumId;
	private String albumName;
	private String albumComposer;
	public String getAlbumComposer() {
		return albumComposer;
	}

	public void setAlbumComposer(String albumComposer) {
		this.albumComposer = albumComposer;
	}

	private String albumType;
	private float albumRating;
	
	
	public Album(int aId, String aName, String aComposer, String aType, float aRating) {
		this.albumId = aId;
		this.albumName = aName;
		this.albumComposer = aComposer;
		this.albumType = aType;
		this.albumRating = aRating;
	}
	
	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getAlbumType() {
		return albumType;
	}

	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}

	public float getAlbumRating() {
		return albumRating;
	}

	public void setAlbumRating(float albumRating) {
		this.albumRating = albumRating;
	}

}
