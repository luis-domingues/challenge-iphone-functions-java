import iphone.internet.internet_func.InternetFunc;
import iphone.music.music_func.MusicFunc;
import iphone.phone.phone_func.PhoneFunc;

public class Main {
    public static void main (String[] args) {
        MusicFunc music_player = new MusicFunc ();
        music_player.selectSong ("Kool-aid - Bring Me The Horizon");
        music_player.play ();
        music_player.pause ();

        PhoneFunc phone = new PhoneFunc ();
        phone.call ("+55 21 91234-5678");
        phone.answerThePhone ();
        phone.voiceMail ();

        InternetFunc internet = new InternetFunc ();
        internet.newTab ();
        internet.displayPage ("https://github.com/luis-domingues/modeling-iphone-functions");
        internet.reloadPage ();
    }
}