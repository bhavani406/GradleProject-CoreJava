package solidprinciples.openClosed;

//classes should be open for extension and closed for modification
// you shouldn't have to rewrite the existing classes for the new features
// so for this we need to extend the already existing function and make implementations
// we can do this by inheritance or interface.
// for the Notification service class if we are adding OTP via whatsapp so we need to add this feature
// to that method so we are violating OPC so for that we create inteface and method sendOTP and we can implement
// in child classes

public interface NotificationService {

    public void sendOTP(String medium);
}
