package lv.java.headfirst.chapter11;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String[] args) {

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Не забудьте аргументы для инструмента и ноты");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play (instrument, note);
        }
    }

    private void play (int instrument, int note){

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

            MidiEvent event = null;

            // Помещаем в трек MIDI-события. Этот код по большей части заранее подготовлен.
            // Нужно лишь позаботиться об аргументах для метода setMessage() и
            // конструктора MidiEvent.
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
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