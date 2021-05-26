public class Song {
    
    private String artist;
    private String songName;
    private int length;

    public Song(String artist, String songName, int length) {
        this.artist = artist;
        this.songName = songName;
        this.length = length;
    }

    public boolean equals(Object compared) {
        // if variables are in the same position then they are equal
        if (this == compared) {
            return true;
        }

        //if compared object is not of type Person, object are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert object into a Person object
        Song comparedSong = (Song) compared;

        // if values of the object are equal, objects are equal
        if ((this.artist.equals(comparedSong.artist)) && (this.songName.equals(comparedSong.songName))) {
                return true;
        }

        return false;
    }

    public String toString() {
        return this.artist + ": " + this.songName+ " (" + this.length + " s)";
    }
}
