import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> memenuhi = new LinkedList<>();
        Queue<Integer> tidakMemenuhi = new LinkedList<>();

        String input = sc.nextLine();
        String[] data = input.split(" ");

        for (String s : data) {
            queue.add(Integer.valueOf(s));
        }

        while (!queue.isEmpty()) {
            int umur = queue.remove();

            if (umur >= 20 && umur <= 118) {
                memenuhi.add(umur);
            } else {
                tidakMemenuhi.add(umur);
            }
        }

        while (!memenuhi.isEmpty()) {
            System.out.print(memenuhi.remove() + " ");
        }

        System.out.println();

        while (!tidakMemenuhi.isEmpty()) {
            System.out.print(tidakMemenuhi.remove() + " ");
        }
    }
}