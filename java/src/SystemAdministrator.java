public class SystemAdministrator extends User{

    private int rank; // 0 < rank < 6

    private Movie enterNewMovie(){return null;}
    private void updateMovie(Movie oldMovie, Movie updatedMovie){ }
    private void deletemovie(Movie delMovie){}
    private Employee addNewEmployee(){return null;}


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}