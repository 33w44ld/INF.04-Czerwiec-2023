internal class Program
{
    static void BubbleSort(int[] tab)
    {
        for(int i=0; i<tab.Length; i++)
        {
            for(int j=i; j<tab.Length; j++)
            {
                if (tab[j] < tab[i])
                {
                    int current = tab[j];
                    tab[j] = tab[i];
                    tab[i] = current;
                }
            }
        }

        foreach(int i in tab)
        {
            Console.WriteLine(i);
        }
    }
    private static void Main(string[] args)
    {
        int[] ints = new int[100];
        Random random = new Random();
        for(int i=0; i<ints.Length; i++)
        {
            ints[i] = random.Next(0, 1000);
        }

        Console.WriteLine("Liczby posortowane rosnąco:");
        BubbleSort(ints);

    }
}