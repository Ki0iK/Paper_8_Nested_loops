public class Main {
    public static void main(String[] args)
    {
        String[] flights = {"AY047", "BA047", "AF110", "LH554", "AF003", "BA116", "AY101"};
        String[] airlines = {"AY", "UA", "LH"};
        System.out.print("flights: ");
        for (String f : flights) // have the same structure so maybe a better way to write it
            System.out.print(f + " ");
        System.out.println();
        System.out.print("airlines: ");
        for (String a : airlines)
            System.out.print(a + " ");
        System.out.println();

        for (String a : airlines)   // going through the airlines
                                    // 'a' was a local variable so only visible in the loop (up) thus can reuse here
        {
            System.out.print(a + ": ");
            for (String f : flights) // going through flights
                if (f.startsWith(a)) // if ex. AY664 starts with AY
                    System.out.print(f + " ");
            System.out.println(); // a new line
        }
    }
}