package com.example;

import com.example.search.BinarySearch;
import com.example.search.SearchClient;

public class App {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3};
        int target = 8;

        BinarySearch binarySearch = new BinarySearch();
        SearchClient searchClient = new SearchClient(binarySearch);

        int res = searchClient.performSearch(arr, target);
        System.out.println(res);
    }
}
