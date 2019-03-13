package com.designpatterns.creational.adapter;

class Mp3Player implements AdvancedMediaPlayer{

	public void playMp3(String fileName) {
		 System.out.println("Playing mp3 file. Name: "+ fileName);		
	}

	public void playMp4(String fileName) {
		
	}
}
