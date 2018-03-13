package lv.java.headfirst.chapter16;

class Song1 {

    private String title;
    private String artist;
    private String rating;
    private String bpm;

    @Override
    public boolean equals(Object aSong) {
        Song1 s = (Song1) aSong;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
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
