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


    // QuickSort Code

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }



    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);


            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[])
    {

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();


    }

    public void TestQuickSort()
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        this.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}


