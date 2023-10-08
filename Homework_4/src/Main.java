public class Main {
    public static void main(String[] args)
    {
        final int R = 6;
        for (int row = 1; row <= R; row ++)
        {
            String ch = "*";
            for (int sym = 6; sym >= row; sym --)
                System.out.print(ch);
            System.out.println();
        }
        System.out.println();

        // Part 2
        final int r = 6;
        for (int row = 1; row <= r; row ++)
        {
            String ch = "*";
            for (int sym = 1; sym <= row; sym ++)
                System.out.print(ch);
            System.out.println();
        }
    }
}