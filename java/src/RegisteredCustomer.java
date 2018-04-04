public class RegisteredCustomer extends User {
    private int rank, status, subscriptionPref;

    private boolean validate(){return true;}
    private void changeSubsribtionPreference(int newPref){}
    private void bookMovie(){}
    private void checkout(){}
    private void addReview(){}
    private void editProfile(){}
    private void recoverLostPassword(){}
    private void returnTickets(){}
    private void viewOrderHistory(){}
    private void verfication(){}


    public int getRank(){
        return rank;
    }
    
    public int getStatus(){
        return status;
    }

    public int getSubscriptionPref(){
        return subscriptionPref;
    }

    public void setSubscriptionPref(int subscriptionPref){
        this.subscriptionPref = subscriptionPref;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setRank(int rank){
        this.rank = rank;
    }
}