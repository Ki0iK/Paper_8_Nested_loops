public class Main {
    public static void main(String[] args)
    {
        final int R = 8; // number of rows
        for (int row = 1; row <= R; row ++)
        {
            String ch; // ch = character - or *
            if (row % 2 == 0) // checking if even or not
                ch = "-";
            else
                ch = "*";

            for (int sym = 1; sym <= row; sym ++) // sym = symbols (number of symbols)
                System.out.print(ch); // not ln
            System.out.println(); // to go to the next line (empty space)
        }
    }
}