package com.hello.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("vic"+fileName);
  }

  @Override
  public void playMp4(String fileName) {

  }
}
