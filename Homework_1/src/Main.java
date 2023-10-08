public class Main {
    public static void main(String[] args)
    {
        final int R = 5;
        for (int row = 1; row < R; row ++)
        {
            for (int i = 1; i < 6; i ++)
                System.out.print(i + " ");
            System.out.println();
        }
        System.out.println();
        // or
        // for (int row = 1; row < R; row ++
        // System.out.println("1 2 3 4 5");
        // also works but without nested loops

        // part 2.
        for (int row = 1; row <= R; row ++)
        {
            for (int i = row; i <= row + 4; i ++)
                System.out.print(i + " ");
            System.out.println();

        }
    }
}