package com.loto.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

// 搜索结果
public class SearchResult implements Serializable {
    private long recordCount;          // 总记录数
    private int totalPages;            // 总页数
    private List<SearchItem> itemList;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<SearchItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<SearchItem> itemList) {
        this.itemList = itemList;
    }

}
