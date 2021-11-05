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
        songs = new ArrayList<>();
    }

    public void addSongToAlbum(String name, double duration) {
        if (songs.isEmpty()) songs.add(new Song(name, duration));
        else if (findSong(name) < 0) System.out.println("Song already exists");
        else songs.add(new Song(name, duration));
        System.out.println(songs.size());
    }

    public void addSongToAlbum(String name, double duration, String[] features) {
        if (songs.isEmpty()) songs.add(new Song(name, duration));
        else if (findSong(name) < 0) System.out.println("Song already exists");
        else {
            Song song = new Song(name, duration);
            if (features.length != 0) {
                for (String s : features
                ) {
                    song.addFeature(s);
                }
            }
            songs.add(song);
        }
    }



    private int containsSong(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) {
                return i;
            }
        }
        return -1;
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
        int idx = containsSong(songTitle);
        if (idx >= 0) {
            playlist.add(songs.get(idx));
            return true;
        }
        System.out.println("Song does not exist");
        return false;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song getSong(String name) {
        int idx = containsSong(name);
        if (idx < 0) {
            System.out.println("No such song");
            return null;
        }
        return songs.get(idx);
    }
    private int findSong(String name) {
        int idx = 0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) return -1;
        }
        return idx;
    }
//        if (containsSong(name) < 0) {
//         System.out.println("No such song");
//        }
//        return songs.get(containsSong(name));
//    }


    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

