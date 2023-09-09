import sem1.Task1;
import sem1.Task2;

public class Main {
    public static void main(String[] args) {
        Task1.run();
        int[] arr = new int[]{1, 1, 1, 1, 1, 1};
        int a = Task2.run(arr);
        System.out.println(a);
    }
}
