public class Runner
{
       public static void main(String[] args)
       {
              int[] list1 = {5,2,6,4,1,3};
              InPlaceSorts.insertionSort(list1);
              double[] list2 = {1.5,1.2,1.6,1.4,1.1,1.3};
              InPlaceSorts.selectionSort(list2);
              String[] list3 = {"b","f","c","e","a","d"};
              InPlaceSorts.bubbleSort(list3);
       }
}
