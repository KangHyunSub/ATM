import java.util.Scanner;

public class InsertCard {
    public String insertCard(){

        System.out.println("카드를 삽입하세요.\n");

        Scanner scanner = new Scanner(System.in);
        String pinnum = scanner.nextLine();

        return pinnum;

    }
}
