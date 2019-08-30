package com.DAO;

public class AlbumDaoFactory {
private static AlbumDaoFactory albumFactory = null;
	
	private AlbumDaoFactory() {
	}
	
	public static AlbumDaoFactory getAlbumFactoryInstance() {
		if(albumFactory == null) {
			albumFactory = new AlbumDaoFactory();
		}
		
		return albumFactory;
	}
	
	public AlbumData getAlbumStorage(String storageMedium) throws NullPointerException{
		AlbumData albumData = null;
		
		if("Oracle".equals(storageMedium)) {
		albumData = new AlbumManagementDao();
		}
		
		return albumData;
	}


}
