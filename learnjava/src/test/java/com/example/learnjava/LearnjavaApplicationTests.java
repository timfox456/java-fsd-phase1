package com.example.learnjava;


import org.junit.jupiter.api.Test;

class LearnjavaApplicationTests {

    @Test
    public void QuickSortTest()
    {
        SearchSortExample searchSortExample = new SearchSortExample();
        searchSortExample.LinearSearch();
        searchSortExample.BinarySearch();
        searchSortExample.BubbleSort();
        searchSortExample.TestQuickSort();
    }

}
