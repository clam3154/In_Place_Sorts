public class InPlaceSorts
{
    public static void insertionSort(int[] list1)
    {
        int swapPosition = 0;
        int min = 0;
        for(int i = 1; i < list1.length; i++)
        {
            swapPosition = i;
            min = list1[i];
            int temp = min;
            for(int x = i-1; x>0; x--)
            {
                if(list1[x]>temp)
                {
                    list1[x+1] = list1[x];
                    list1[x] = temp;
                    swapPosition = x;
                }
            }
        }
    }
    public static void selectionSort(double[] list1)
    {
        int swapPosition = 0;
        double min = 0;
        for(int i = 0; i < list1.length; i++)
        {
            swapPosition = i;
            min = list1[i];
            for(int x = i+1; x< list1.length; x++)
            {
                if(list1[x]<min)
                {
                    double temp = min;
                    min = list1[x];
                    list1[x] = temp;
                    swapPosition = x;
                }
            }
        }
    }
    public static void bubbleSort(String[] list1)
    {
        int swap = 0;
        while(swap!=0)
        {
            swap = 0;
            for(int i = 0; i< list1.length -1; i++)
            {
                swap++;
                String temp = list1[i];
                list1[i] = list1[i+1];
                list1[i+1] = temp;
            }
        }
    }

}
