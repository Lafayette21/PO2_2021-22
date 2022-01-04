public class Haslo {
    String english;
    String polish;

    public Haslo(String pl, String en) {
        polish = pl;
        english = en;
    }

    public boolean isPresent(String word) {
        if (english.equals(word) || polish.equals(word)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return polish + " " + english;
    }

    public boolean equals(Haslo h) {
        if (english.equals(h.english) || polish.equals(h.polish)) {
            return true;
        } else {
            return false;
        }
    }
}