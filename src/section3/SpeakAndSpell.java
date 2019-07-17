package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak(" 11120371223342111111222832111111827229117117172233922111203712233421111112228321111118272291171171722339221112037122334211111122283211111182722911711717223392211120371223342111111222832111111827229117117172233922111203712233421111112228321111118272291171171722339221112037122334211111122283211111182722911711717223392211120371223342111111222832111111827229117117172233922");
		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


