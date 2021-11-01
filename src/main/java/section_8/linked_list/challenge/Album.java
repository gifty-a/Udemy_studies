package main.java.section_8.linked_list.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private Artist artist;
    private String releaseDate;
    private ArrayList<Song> songs;

    public Album(String name, String artistName, String releaseDate) {
        this.name = name;
        this.artist = new Artist(artistName);
        this.releaseDate = releaseDate;
        songs = new ArrayList<Song>();
    }

    public void addSongToAlbum(String name, double duration) {
//        System.out.println(songs.size());
//        System.out.println(name + " " + Double.toString(duration));
        if (songs.isEmpty()) songs.add(new Song(name, duration));
        else if (findSong(name) < 0) System.out.println("Song already exists");
        else songs.add(new Song(name, duration));
        System.out.println(songs.size());
//        else songs.add(new Song(name,duration));
//        System.out.println(songs.size());
    }

    public void addSongToAlbum(String name, double duration, ArrayList<String> features) {
        if (songs.isEmpty()) songs.add(new Song(name, duration));
        else if (findSong(name) < 0) System.out.println("Song already exists");
        else {
            Song song = new Song(name, duration);
            if (!features.isEmpty()) {
                for (String s: features
                     ) {
                    song.addFeature(s);
                }
            }
            songs.add(song);
        }
    }
    private int findSong(String name) {
        int idx = 0;
        for (int i =0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) return -1;
//            else idx = i;
        }
        return idx;
    }

    private int containsSong(String name){
        int idx = 0;
        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getTitle().equals(name)) {
                idx = i;
                System.out.println("idx" +" " + i);
            }
            else {
                idx = -1;
                System.out.println("idx" +" " + i);
            }
        }
        System.out.println("idx" +" " + idx);
        return idx;
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addSongToPlaylist(String songTitle, LinkedList<Song> playlist) {
        for (int i = 0; i < songs.size(); i++) {
            Song currentSong = songs.get(i);
            if (currentSong.getTitle().equals(songTitle)) {
                playlist.add(currentSong);
                return true;
            }else{
                System.out.println("Song does not exist");
            }
        }
        return false;
    }

    public ArrayList<Song> getSongs() {
//        System.out.println("Songs returned");
        return songs;
    }

    public Song getSong(String name){
        if (containsSong(name) < 0) {
         System.out.println("No such song");
        }
        return songs.get(containsSong(name));
    }
}
