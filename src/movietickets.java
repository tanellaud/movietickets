import java.util.Scanner;

/*
 * Created by Tanel Laud on 03.10.2016.
 */
public class movietickets {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int selectedMovie;
        int numberOfTickets;



        String[] movieList = new String[] {"0) John Wick", "1) Nemo", "2) 1944"};
        for (int i = 0; i < 3; i++) {
            System.out.println(movieList[i]);
        }
        System.out.println("Vali film nr");
        selectedMovie = input.nextInt();
        input.nextLine();

        System.out.println("Vali kuupäev! Formaat - day/month/year");
        String selectedDate = input.nextLine();

        System.out.println("Sisesta piletite arv");
        numberOfTickets = input.nextInt();
        input.nextLine();

        System.out.println("Sisesta koha number: Rida 1-3, kohad 1-20");
        String selectedSeat = input.nextLine();


        for (int i = 0; i < 3; i++) {
            if (selectedMovie == i) {
                System.out.println("Valisid filmi: "+movieList[i]);
            }
        }
        System.out.println("Valisid kuupäeva:" + selectedDate);
        System.out.println("Valisid " + numberOfTickets + " piletit");
        System.out.println("Valisid koha:" + selectedSeat);

    }
}
