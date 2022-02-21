package songs;


public class Playlist {
    private Song song;
    private static int combineTime = 0;

    public Playlist(String title, int length, String firstName, String lastName) {
        this.song = new Song(title, length, new Author(firstName, lastName));
        this.combineTime += length;
    }

    public static String getCombineTime() {
        Time time = new Time();
        return  time.changeTime(combineTime);
    }



    @Override
    public String toString() {
        return
                "Piosenka nr :" + this.song.getNumber() + ", \n" +
                "tytuł       :'" + this.song.getTitle() + '\'' + ",\n" +
                "długość     :" + this.song.getLength() + ",\n" +
                "autor       :" + this.song.getAuthor() + "\n";

    }


}
