package entities;

public class Album {

    private String name;
    private String artistName;
    private String releaseDate;
    private int musics;

    public Album(){

    }

    public Album(String name, String artistName, String releaseDate, int musics) {
        this.name = name;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMusics() {
        return musics;
    }

    public void setMusics(int musics) {
        this.musics = musics;
    }

    @Override
    public String toString() {
        return "album{" +
                "name='" + name + '\'' +
                ", artistName='" + artistName + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", musics=" + musics +
                '}';
    }
}
