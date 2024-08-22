package iphone.music.music_func;

import iphone.music.Spotify;

public class MusicFunc implements Spotify {
    @Override
    public void play () {
        System.out.println ("The app is playing music");
    }

    @Override
    public void pause () {
        System.out.println ("The app paused music");
    }

    @Override
    public String selectSong (String music) {
        System.out.println (music);
        return music;
    }
}
