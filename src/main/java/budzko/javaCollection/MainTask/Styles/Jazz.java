package budzko.javaCollection.MainTask.Styles;

import budzko.javaCollection.MainTask.Song;
import budzko.javaCollection.MainTask.StyleOfSong;

public class Jazz extends Song {

    private int birthdayAuthor;
    public Jazz(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, int birthdayAuthor) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.birthdayAuthor = birthdayAuthor;
    }
    @Override
    public String toString(){
        return super.toString() + ", " + "Author's birthday: " + birthdayAuthor + " |";
    }
}
