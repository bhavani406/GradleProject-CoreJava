package solidprinciples.openClosed;

public class MobileNotificationService implements NotificationService{

    @Override
    public void sendOTP(String msg){
        if(msg.equals("mobile")){
            System.out.println("");
        }

    }

}
