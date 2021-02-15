package com.example.learnjava;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.ArrayList;
import java.util.Random;

public class SearchSortExample {

    public int LinearSearch() {


        System.out.println("Searching for number 1000 in arraylist");
        int numToSearch = 1000;
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(1000);

        for (int i : al) {
            if (i == numToSearch) {
                System.out.println("Found " + i);
                return (i);
            }

        }
        return 0;
    }

    public int BinarySearch() {

        System.out.println("Searching for number 4 in arraylist");
        int numToSearch = 4;
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        int i = al.size() / 2;

        while (i < al.size() && i > 0) {
            if (al.get(i) == numToSearch) {
                System.out.println("Found it! " + al.get(i));
                return al.get(i);
            } else if (al.get(i) < numToSearch) {
                i += ((al.size() - i) / 2);
                System.out.println("Too Large! setting i=" + i);


            } else {
                i -= (i / 2);
                System.out.println("Too Small! setting i=" + i);

            }
        }
        return (0);
    }

    public void BubbleSort() {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(1);
        al.add(4);
        al.add(2);
        al.add(5);

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.size() - 2; j++) {
                if (al.get(j) > al.get(j + 1)) {
                    int oldj = al.get(j);
                    al.set(j, al.get(j + 1));
                    al.set(j + 1, oldj);
                }
            }
        }

        System.out.println(al);


    }

    private ArrayList<Integer> list = new ArrayList<Integer>();


    private void InitializeList() {
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(5);
    }


    int partition(ArrayList<Integer> inputArray, int start,int end){
        System.out.println("\n---------Iteration Starts----------");
        System.out.println("\nSorting Window from index number:"+start+" to "+end);

        int init = start;
        int length = end;

        Random r = new Random();
        int pivotIndex = nextIntInRange(start,end,r);
        int pivot = inputArray.get(pivotIndex);

        System.out.println("Pivot Element "+pivot+" at index:"+pivotIndex);

        while(true){
            while(inputArray.get(length)>pivot && length>start){
                length--;
            }

            while(inputArray.get(init)<pivot && init<end){
                init++;
            }

            if(init<length){
                int temp;
                temp = inputArray.get(init);
                inputArray.set(init,inputArray.get(length));
                inputArray.set(length,temp);
                length--;
                init++;

                System.out.println("\nAfter Swapping");
                for(int i=start;i<=end;i++){
                    System.out.print(inputArray.get(i)+" ");
                }
            }else{
                System.out.println("\n---------Iteration Ends---------");
                return length;
            }
        }

    }


    // Below method is to just find random integer from given range
    static int nextIntInRange(int min, int max, Random rng) {
        if (min > max) {
            throw new IllegalArgumentException("Cannot draw random int from invalid range [" + min + ", " + max + "].");
        }
        int diff = max - min;
        if (diff >= 0 && diff != Integer.MAX_VALUE) {
            return (min + rng.nextInt(diff + 1));
        }
        int i;
        do {
            i = rng.nextInt();
        } while (i < min || i > max);
        return i;
    }

    public void QuickSort(ArrayList<Integer> myList, int low, int high) {

        if (low < high) {
            int pi = this.partition(myList,low, high);

            QuickSort(myList, low, pi);
            QuickSort(myList, pi + 1, high);
        }
    }

    public void TestQuickSort() {
        System.out.println("Testing Quicksort....");
        QuickSort(list, 0, list.size());
        System.out.println(list);
    }


}
