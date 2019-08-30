package com.ui;

import com.DAO.AlbumData;


import java.util.ArrayList;

import com.beans.Album;
import com.beans.Song;

import java.util.Scanner;

import com.DAO.AlbumDaoFactory;

public class AlbumManagementSystem {

	private static AlbumData albumDao = AlbumDaoFactory.getAlbumFactoryInstance().getAlbumStorage("Oracle");

	public static void main(String[] args) {

		System.out.println("<<<<< Album Management System >>>>>");
		
		while (true) {
			System.out.println("1. Get total Song Downloads For Album");
			System.out.println("2. Retrieve Songs based on Singer");
			System.out.println("3. Retrieve Highest Rating Album");
			System.out.println("4. In Works");
			System.out.println("5. Exit Application");

			Scanner scan = new Scanner(System.in);

			int choice = scan.nextInt();

			switch (choice) {
			case 1:

				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter Album ID: ");
				int albumId = scan1.nextInt();

//				try {

					int total = albumDao.getTotalSongDownloadsForAlbum(albumId);

					
					System.out.println("Total Downloads " + total);
//				} catch (BookExistException e) {

//					System.out.println("A book with similar details exists already");
//				}
				break;
			case 2:
				scan1 = new Scanner(System.in);
				System.out.println("Enter Singer Name : ");
				String singerName = scan1.nextLine();
//				Book book1;
					ArrayList<Song> songList = albumDao.retrieveSongBasedOnSingerName(singerName);
					System.out.println(songList);
//					System.out.println(book1);

				break;
			case 3:
//				scan1 = new Scanner(System.in);
//				System.out.println("Enter Book Category : ");
				Album maxAlbum = new Album();
//				List<Book> bookList = bookDao.getBooksByCategory(null);
				 maxAlbum = albumDao.getTotalSongDownloadsForAlbum(albumId);
//				System.out.println(bookList);

				break;
			case 4:
//				scan2 = new Scanner(System.in);
//				System.out.println("Book ID : ");
//
//				//Book book4 = new Book();
//				
//				try {
//					//book4.setBookId(scan2.nextInt());
//					int responseCode = bookDao.deleteBook(scan2.nextInt());
//
//					if (responseCode == 1) {
//						System.out.println("Book details deleted successfully");
//					} else {
//						System.err.println("Failed to delete Book");
//					}
//				} catch (BookIdDoesNotExistException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				break;
			case 5:
				System.out.println("<<< Thank you for using Album Management System >>>>");
				System.exit(0);
				break;
			}
		}

	}

}
