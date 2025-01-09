package com.example.search;

public class SearchClient {
    private Search searchAlogrithm;

    public SearchClient(Search searchAlgorithm) {
        this.searchAlogrithm = searchAlgorithm;
    }

    public int performSearch(int[] arr, int target) {
        return searchAlogrithm.search(arr, target);
    }
}
