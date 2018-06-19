package com.hello.adapter;

public class AdapterPatternDemo {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();
    audioPlayer.play("mp3","eyond the horizon.mp3");
    audioPlayer.play("mp4","yy.mp4");
    audioPlayer.play("vlc","avw.vlc");
    audioPlayer.play("avi","cjk.avi");

  }
}
