package solidprinciples.openClosed;

public class WhatsApp implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        if(medium.equals("whatsapp")){
            System.out.println("");
        }
    }
}
