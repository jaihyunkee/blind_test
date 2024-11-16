package com.codingrecipe.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {
    private int page; // current page
    private int maxPage;  //
    private int startPage; // start page based on current page
    private int endPage; // last page based on current page
}
