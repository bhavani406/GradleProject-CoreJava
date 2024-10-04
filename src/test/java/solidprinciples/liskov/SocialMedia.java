package solidprinciples.liskov;

//Derived classes must be substituble for the base class

public abstract  class SocialMedia {

    public abstract void chat();
    public abstract void sendPhotos();
    public abstract void groupCall();
    public abstract void publishPost();

}
