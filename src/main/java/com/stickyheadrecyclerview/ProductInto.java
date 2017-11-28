package com.stickyheadrecyclerview;

/**
 * Created by HaoPz on 2017/11/28.
 */

public class ProductInto {
    private String type ;
    private String areaName;
    private String aredId;

    public ProductInto(String type, String areaName, String aredId) {
        this.type = type;
        this.areaName = areaName;
        this.aredId = aredId;
    }

    public String getType() {
        return type;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getAredId() {
        return aredId;
    }
}
