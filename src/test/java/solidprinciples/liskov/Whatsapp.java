package solidprinciples.liskov;

public class Whatsapp extends SocialMedia{
    @Override
    public void chat() {

    }

    @Override
    public void sendPhotos() {

    }

    @Override
    public void groupCall() {

    }

    @Override
    public void publishPost() {
        // WHATSAPP DONT SUPPORT THIS FEATURE
        //so whatsapp not subtituble for socialmedia we are violating the principle
    }
}
