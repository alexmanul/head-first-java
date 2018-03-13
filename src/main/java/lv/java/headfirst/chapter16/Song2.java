package lv.java.headfirst.chapter16;

class Song2 implements Comparable<Song2> {

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    Song2(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public int compareTo(Song2 s) {
        return title.compareTo(s.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
}
