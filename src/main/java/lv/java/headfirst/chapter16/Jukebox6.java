package lv.java.headfirst.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox6 {

    private ArrayList<Song2> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        getSongs();

        // Выводим содержимое songList.
        System.out.println(songList);

        // Вызываем статический метод sort() из класса Collections.
        Collections.sort(songList);

        // Снова выводим содержимое songList. Теперь элементы следуют в алфавитном порядке.
        System.out.println(songList);

        HashSet<Song2> songSet = new HashSet<Song2>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    private void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song2 nextSong = new Song2(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}