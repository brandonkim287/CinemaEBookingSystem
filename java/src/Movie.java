
public class Movie{
    private int id, status; //0< status< 4
    private String title, genre, cast, director, producer, description, trailerPicture,
                    trailerVideo, MPAArating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrailerPicture() {
        return trailerPicture;
    }

    public void setTrailerPicture(String trailerPicture) {
        this.trailerPicture = trailerPicture;
    }

    public String getTrailerVideo() {
        return trailerVideo;
    }

    public void setTrailerVideo(String trailerVideo) {
        this.trailerVideo = trailerVideo;
    }

    public String getMPAArating() {
        return MPAArating;
    }

    public void setMPAArating(String MPAArating) {
        this.MPAArating = MPAArating;
    }
}