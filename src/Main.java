import java.util.List;
import java.util.Scanner;

public class Main {

    public static Observer removeByName(List<Observer> list, String name){
        return list.stream()
                .filter(observer -> observer instanceof  Sofkiano && ((Sofkiano) observer).getName().equals(name))
                .findFirst()
                .get();

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);


        String name, link;
        int menuOption;

        SofkaU sofkau = new SofkaU();


        System.out.println("" +
                "1- suscribir sofkiano\n" +
                "2- desuscribir sofkiano \n" +
                "3- publicar podcast\n" +
                "8- Salir");


        do {
            menuOption = sc.nextInt();

            switch (menuOption){
                case 1:
                    System.out.println("Subscribir sofkiano");
                    name = sc2.nextLine();

                    Sofkiano sofkiano = new Sofkiano(name);
                    sofkau.addSofkiano(sofkiano);

                    System.out.println("Sofkiano suscrito.");
                    break;

                case 2:
                    sofkau.getObservers().forEach(System.out::println);

                    System.out.println("Desuscribir sofkiano");
                    name = sc3.nextLine();

                    sofkau.removeSofkiano(removeByName(sofkau.observers ,name));
                    System.out.println("Sofkiano desuscrito.");
                    break;

                case 3:
                    System.out.println("Publicar Podcast");
                    link = sc2.nextLine();
                    sofkau.addPodcast(link);
                    break;


                default:
                    System.out.println("Opcion incorrecta");
            }

        }while (menuOption !=8);

        sc.close();
        sc2.close();
        sc3.close();
    }
}