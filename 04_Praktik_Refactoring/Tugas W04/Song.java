package Assignment;

enum Genre {
    UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE;
}

class Artist {
    private String name;
    private String alias;
    private String imageUrl;

    public Artist(String name, String alias, String imageUrl) {
        this.name = name;
        this.alias = alias;
        this.imageUrl = imageUrl;
    }

    public void printArtistInfo() {
        System.out.println("Artist: " + name);
        if (!alias.isEmpty()) {
            System.out.println("Also known as: " + alias);
        }
    }
}

class Album {
    private String name;
    private String coverUrl;

    public Album(String name, String coverUrl) {
        this.name = name;
        this.coverUrl = coverUrl;
    }

    public void printAlbumInfo() {
        System.out.println("Album: " + name);
    }
}

public class Song {
    private String id;
    private String title;
    private String releaseYear;
    private String musicFileURL;
    private Genre genre;
    private Album album;
    private Artist artist;

    public Song(String id, String title, String releaseYear, String musicFileURL) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.musicFileURL = musicFileURL;
        this.genre = Genre.UNDEFINED;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printInfo(int detailLevel) {
        System.out.println("Song: " + title);
        System.out.println("Release Year: " + releaseYear);
        if (genre != Genre.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }
        if (detailLevel >= 1 && artist != null) {
            artist.printArtistInfo();
        }
        if (detailLevel >= 2 && album != null) {
            album.printAlbumInfo();
        }
    }
}
