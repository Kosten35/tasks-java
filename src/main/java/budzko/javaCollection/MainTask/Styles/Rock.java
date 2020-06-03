package budzko.javaCollection.MainTask.Styles;

import budzko.javaCollection.MainTask.Song;
import budzko.javaCollection.MainTask.StyleOfSong;

public class Rock extends Song {
    private boolean authorIsAlive;
     public Rock(String nameOfSound, String nameOfAuthor, double duration, StyleOfSong style, boolean authorIsAlive ) {
        super(nameOfSound, nameOfAuthor, duration, style);
        this.authorIsAlive = authorIsAlive;

    }

    @Override
    public String toString(){
        return super.toString() + ", " + "Author is Alive: " + authorIsAlive + " |";
    }

}
