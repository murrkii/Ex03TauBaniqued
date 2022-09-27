/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex03taubaniqued;

/**
 *
 * @author boy
 */
public class Singer {
    public String name;
    public int noOfPerformances = 0, audience;
    public double earnings = 0;
    public Song favoriteSong;
    public Song faveSongName = favoriteSong;
   
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.favoriteSong = favoriteSong;
    }
    
    public void performForAudience(int audience){
        earnings += 100*audience;
        noOfPerformances++;
    }
    
    public void changeFavSong(Song faveSongName){
        faveSongName = favoriteSong;
    }
    
    public void singerData(){
        System.out.println("\nSINGER\nName: " + name + "\nFavorite Song: " + favoriteSong.songName + "\nNo. of Performances: "
                + noOfPerformances + "\nEarnings: " + earnings);
    }
    
    /*
    public void singerEarnings(){
        System.out.println("\nSINGER\nName: " + name + "\nEarnings: " + earnings);
    }
    
    public void singerSong(){
        System.out.println("\nSINGER\nName: " + name + "\nFavorite Song: " + favoriteSong.songName);
    }*/
}
