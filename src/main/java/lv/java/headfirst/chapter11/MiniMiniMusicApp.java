package lv.java.headfirst.chapter11;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    private void play() {

        try {

            // Получаем синтезатор и открываем его, чтобы начать использовать.
            // Изначально он не открыт.
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // Заранее подготовленные аргументы синтезатора.
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // Запрашиваем трек у последовательности.
            // Трек содержится внутри последовательности, а MIDI-данные - в треке.
            Track track = seq.createTrack();

            // Помещаем в трек MIDI-события. Этот код по большей части заранее подготовлен.
            // Нужно лишь позаботиться об аргументах для метода setMessage() и
            // конструктора MidiEvent.
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // Передаём последовательность синтезатору
            player.setSequence(seq);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}