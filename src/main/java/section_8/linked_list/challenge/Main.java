package main.java.section_8.linked_list.challenge;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
//        Album lemonadeAlbum = new Album("Lemonade","Beyonce Knowles","April 23,2016");
//        lemonadeAlbum.addSongToAlbum("Pray you catch me", 3.16);
//        lemonadeAlbum.addSongToAlbum("Hold Up", 3.41);
//        lemonadeAlbum.addSongToAlbum("Don\'t hurt yourself", 3.54);
//        lemonadeAlbum.addSongToAlbum("Sorry", 3.99);
//        lemonadeAlbum.addSongToAlbum("6 Inch", 3.16);
//        lemonadeAlbum.addSongToAlbum("Daddy Lessons", 4.00);
//        lemonadeAlbum.addSongToAlbum("Love Drought", 3.71);
//        lemonadeAlbum.addSongToAlbum("Sandcastles", 3.16);
//        lemonadeAlbum.addSongToAlbum("Forward", 3.01);
//        lemonadeAlbum.addSongToAlbum("Freedom", 3.59);
//        lemonadeAlbum.addSongToAlbum("All Night", 3.16);
//        lemonadeAlbum.addSongToAlbum("All Night", 3.16);
//        lemonadeAlbum.addSongToAlbum("Formation", 3.16);
//        albums.add(lemonadeAlbum);
        Album antiAlbum = new Album("Anti","Rihanna","January 28,2016");
        antiAlbum.addSongToAlbum("Consideration",2.41);
        antiAlbum.addSongToAlbum("Work",3.99);
//        antiAlbum.getSong("Consideration");
        albums.add(antiAlbum);
//        ArrayList<String> workFeatures = new ArrayList<>();
//        workFeatures.add("Drake");
//        antiAlbum.addSongToAlbum("Work",3.11,workFeatures);
//        antiAlbum.getSong("Consideration").addFeature("sza");
//        System.out.println(antiAlbum.getSong("Consideration").toString());
//        System.out.println(antiAlbum.getSong("Work").toString());
        for (Song s: antiAlbum.getSongs()
             ) {
            System.out.println(s.getTitle());
        }
    }
}
