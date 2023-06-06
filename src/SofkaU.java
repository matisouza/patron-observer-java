
// sujeto concreto
public class SofkaU extends Subject{

    private String podcast;


    public void addPodcast(String link){

        this.podcast = link;

        System.out.println("New podcast added");

        this.notifiy();
    }

    public String getPodcast() {
        return podcast;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.podcast));
    }
}
