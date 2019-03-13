package com.designpatterns.creational.adapter;

class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	public void play(String mediaType, String fileName) {
		if (mediaType.equalsIgnoreCase("mp3") || mediaType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(mediaType);
			mediaAdapter.play(mediaType, fileName);
		} else {
			System.out.println("Invalid media. " + mediaType + " format not supported");
		}
	}
}
