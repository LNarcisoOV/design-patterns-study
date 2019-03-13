package com.designpatterns.structural.adapter;

class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("MP3")){
			advancedMusicPlayer = new Mp3Player();
		}
		if(audioType.equalsIgnoreCase("MP4")){
			advancedMusicPlayer = new Mp4Player();
		}

	}

	public void play(String mediaType, String fileName) {
		if(mediaType.equalsIgnoreCase("MP3")){
			advancedMusicPlayer.playMp3(fileName);
		}
		if(mediaType.equalsIgnoreCase("MP4")){
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
