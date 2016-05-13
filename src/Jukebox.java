// Copyright The League of Amazing Programmers, 2015
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
	}

           public void run() {

		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song
        	   
		// 5. Play the Song
        	 
        	   
		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
        	   JFrame frame = new JFrame();
        	   frame.setSize(500, 500);
        	   frame.setVisible(true);
        	   JPanel panel = new JPanel();
        	   frame.add(panel);
        	   
        	   button1 = new JButton("Can't Stop the Feeling - J. Timberelake");
        	   panel.add(button1);
        	   button1.addActionListener(this);
        	   
        	   button2 = new JButton("Never Be Like You - Flume");
        	   panel.add(button2);
        	   button2.addActionListener(this);
        	   
        	   button3 = new JButton("Faded - Alan Walker");
        	   panel.add(button3);
        	   button3.addActionListener(this);
        	   
        	   button4 = new JButton("Messin' Around - Pitbull");
        	   panel.add(button4);
        	   button4.addActionListener(this);
          }
           
     Song feeling = new Song("Justin Timberlake - Can't Stop the Feeling ( Lyrics Video ).mp3");
		Song flume = new Song("Flume - Never Be Like You feat. Kai (Clean) [RADIO EDIT].mp3");
		Song faded = new Song("Alan Walker - Faded.mp3");
		Song pitbull = new Song("Pitbull - Messin' Around (Audio) ft. Enrique Iglesias.mp3");

          
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			feeling.stop();
			flume.stop();
			faded.stop();
			pitbull.stop();
		JButton buttonClicked = (JButton) e.getSource();
		if(buttonClicked == button1)
			{
			feeling.play();
			
			}
	if(buttonClicked == button2)
	{
		flume.play();
	}

	if(buttonClicked == button3)
	{
		faded.play();
	}
	
	if(buttonClicked == button4)
	{
		pitbull.play();
	}
}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}}

