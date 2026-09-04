public class wordGuessing {
    private String secretWord = secret;
    private String guess  = guess;

    public wordGuessing(String s, String g) {
        secretWord = s;
        guess = g;
    }
// if the letter is in secret
// update the correct index in guess
    public void updateGuess(String letter) {
        for (int i = 0;i < secret().length(); ii++) {
            
        }
        if (secretWord.contains(letter)) {
            return indexOf(letter);
        }
    }

    // return the instance variable, guess
    public String getProgress() {
        return guess;
    }

}
