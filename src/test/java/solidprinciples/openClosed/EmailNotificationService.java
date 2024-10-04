package solidprinciples.openClosed;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendOTP(String medium) {
        if(medium.equals("email")){
            System.out.println("");
        }
    }
}
