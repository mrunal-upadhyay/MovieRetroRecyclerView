package com.example.mrunalupadhyay.movieretrorecyclerview.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mrunal.upadhyay on 11/29/17.
 */

public class MovieResponse {

    @SerializedName("page")
    private Integer page;

    @SerializedName("results")
    private List<Movie> results;

    @SerializedName("total_results")
    private Integer totalResults;

    @SerializedName("total_pages")
    private Integer totalPages;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
