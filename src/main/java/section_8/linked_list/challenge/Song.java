package main.java.section_8.linked_list.challenge;

import java.util.ArrayList;

public class Song {
    private String title;
//    private String genre;
    private double duration;
    private ArrayList<Artist> features;

    public Song(String songTitle, double songDuration){
        this.title = songTitle;
        this.duration = songDuration;
        this.features = new ArrayList<Artist>();
//        this.genre = genre;
    }

    public void addFeature(String name) {
        if (features.isEmpty()) features.add(new Artist(name));
        else if (findFeature(name) < 0) System.out.println("Feature added already");
        else features.add(new Artist(name));
//        for (int i = 0; i < features.size(); i++){
//            if (features.get(i).getName().equals(name)){
//                System.out.println("Feature already present");
//            }else features.add(new Artist(name));
//        }
    }

    private int findFeature(String name) {
        int idx = 0;
        for (int i = 0; i < features.size(); i++){
            if (features.get(i).getName().equals("name")) {
                idx = -1;
            }
//            else idx = i;
        }
        return idx;
    }

    public double getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Artist> getFeatures() {
        return features;
    }

//    public String getGenre() {
//        return genre;
//    }

    @Override
    public String toString() {
        String featuresString = featuresList();
        return features.size() == 0 ?
          this.title + ": " + this.duration :
          this.title + ": " + this.duration + "\n "
                  + "ft " + featuresString;

    }

    private String featuresList(){
        StringBuilder sb = new StringBuilder();
        for (Artist a: features
             ) {
            sb.append(a.getName() + ",");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
