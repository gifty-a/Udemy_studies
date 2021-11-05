package main.java.section_8.linked_list.challenge;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album lemonadeAlbum = new Album("Lemonade", "Beyonce Knowles", "April 23,2016");
        lemonadeAlbum.addSongToAlbum("Pray you catch me", 3.16);
        lemonadeAlbum.addSongToAlbum("Hold Up", 3.41);
        lemonadeAlbum.addSongToAlbum("Don't hurt yourself", 3.54);
        lemonadeAlbum.addSongToAlbum("Sorry", 3.99);
        lemonadeAlbum.addSongToAlbum("6 Inch", 3.16);
        lemonadeAlbum.addSongToAlbum("Daddy Lessons", 4.00);
        lemonadeAlbum.addSongToAlbum("Love Drought", 3.71);
        lemonadeAlbum.addSongToAlbum("Sandcastles", 3.16);
        lemonadeAlbum.addSongToAlbum("Forward", 3.01);
        lemonadeAlbum.addSongToAlbum("Freedom", 3.59);
        lemonadeAlbum.addSongToAlbum("All Night", 3.16);
        lemonadeAlbum.addSongToAlbum("All Night", 3.16);
        lemonadeAlbum.addSongToAlbum("Formation", 3.16);
        albums.add(lemonadeAlbum);
        Album antiAlbum = new Album("Anti", "Rihanna", "January 28,2016");
        antiAlbum.addSongToAlbum("Consideration", 2.41);
        antiAlbum.addSongToAlbum("Work", 3.99);
        antiAlbum.getSong("Work").addFeature("Drake");
        albums.add(antiAlbum);
        String[] featuresList = new String[2];
        featuresList[0] = "Pooh Shiesty";
        featuresList[1] = "Nicki Minaj";
        antiAlbum.addSongToAlbum("Sex with me", 2.17, featuresList);
//
//        System.out.println(lemonadeAlbum.getName());
//        System.out.println("By: " + lemonadeAlbum.getArtist().getName() + " Year: " + lemonadeAlbum.getReleaseDate());
//        System.out.println("_________________________");
//        for (Song s : lemonadeAlbum.getSongs()
//        ) {
//            System.out.println(s.getTitle());
//        }
//        System.out.println(antiAlbum.getName());
//        System.out.println("By: " + antiAlbum.getArtist().getName() + " Year: " + antiAlbum.getReleaseDate());
//        System.out.println("_________________________");
//        for (Song s : antiAlbum.getSongs()
//        ) {
//            System.out.println(s.toString());
//        }

        LinkedList<Song> rnbPlayList = new LinkedList<>();
//        System.out.println(albums.get(0).getName());
        albums.get(0).addSongToPlaylist("All Night",rnbPlayList);
        albums.get(0).addSongToPlaylist("Formation", rnbPlayList);
        albums.get(0).addSongToPlaylist("o0ps", rnbPlayList);//does not exist
        albums.get(0).addSongToPlaylist(89,rnbPlayList);//does not exist

        play(rnbPlayList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
//        System.out.println("Play method");
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("The playlist has no songs");
            return;
        } else {
            System.out.println(listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int selectedOption = scanner.nextInt();
            scanner.nextLine();
            switch (selectedOption){
                case 0:
                    System.out.println("PlayList Complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        }else System.out.println("We are at the start of the list");
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next());
                            forward = true;
                        }else System.out.println("We have reached the end of the list");
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Select an option :\n press");
        System.out.println("0 to quit \n" +
                "1 to play next song \n" +
                "2 to play previous song \n" +
                "3 to replay the current song \n" +
                "4 to list all songs in the playlist \n" +
                "5 to print menu");

    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }
}
