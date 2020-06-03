package budzko.javaCollection.MainTask.Styles;

import budzko.javaCollection.MainTask.Song;
import budzko.javaCollection.MainTask.StyleOfSong;

public class Classic extends Song {
    private int yearOfWriting;
    public Classic(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, int yearOfWriting) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.yearOfWriting = yearOfWriting;

    }
    @Override
    public String toString(){
        return super.toString() + ", " + "Year of writing: " + yearOfWriting + " |";
    }



}
