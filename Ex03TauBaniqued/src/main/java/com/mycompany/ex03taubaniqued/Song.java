/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex03taubaniqued;

/**
 *
 * @author boy
 */
public class Song {
    public String songName, singer, genre, status = "Paused";
    public int length;
        
    public Song (String songName, String singer, String genre, int length){
        this.songName = songName;
        this.singer = singer;
        this.genre = genre;
        this.length = length;
    }
    
    public void play(){
        status = "Playing";
    }
    
    public void pause(){
        status = "Paused";
    }
    
    public void songData(){
        System.out.printf("%nSONG%nName: %s%nSinger: %s%nGenre: %s%nLength: %s seconds"
                + "%nStatus: %s%n", songName, singer, genre, length, status);
    }
    
}
