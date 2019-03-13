package com.designpatterns.structural.adapter;

class Mp4Player implements AdvancedMediaPlayer {

	public void playMp3(String fileName) {
		
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);		
	}

}
