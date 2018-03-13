package lv.java.headfirst.chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {

    // Мы будем хранить названия песен в списке ArrayList, состоящем из строковых данных.
    private ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    //Метод, который загружает файл и выводит содержимое songList (ArrayList).
    public void go() {
        getSongs();

        // Выводим содержимое songList.
        System.out.println(songList);

        // Вызываем статический метод sort() из класса Collections.
        Collections.sort(songList);

        // Снова выводим содержимое songList.
        // Теперь элементы следуют в алфавитном порядке.
        System.out.println(songList);
    }

    // Считываем файл и вызываем для каждой его строки метод addSong().
    private void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод addSong разбивает строку, содержащую как название, так и имя исполнителя,
    // на две части (лексемы) с помощью метода split().
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}