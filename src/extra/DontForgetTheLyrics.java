package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.jop
		JOptionPane.showMessageDialog(null, "you need to guess the lyrics for this song");
		
		// 5. Use the playSound method to play your song.
playSound("FLEX TAPE Commercial.mp3");
		
String Foilkite= JOptionPane.showInputDialog("Put in the lyrics");

// 6. Make a pop-up for the player to type their 
		// 7. If they answered correctly, tell them that they were right.
if (Foilkite.equals ("hi phill swift here with flex tape")) {
JOptionPane.showMessageDialog(null," Good job you know your flex tape");
}

		// 8. Otherwise, tell them they are wrong, and give them the answer.
	playSound("Everybody Wants To Rule The World.mp3");
	
	String Flysurfer= JOptionPane.showInputDialog("Put in the lyrics");

	// 6. Make a pop-up for the player to type their 
			// 7. If they answered correctly, tell them that they were right.
	if (Flysurfer.equals ("Welcome to your life There's no turning back Even while we sleep  We will find You acting on your best behavior Turn your back on mother nature Everybody wants to rule the world")) {
	JOptionPane.showMessageDialog(null,"you know your fears and your tears");
	};
}
		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	
	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


