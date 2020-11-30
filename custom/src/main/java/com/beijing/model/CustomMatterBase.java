package com.beijing.model;

import lombok.Data;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  20:09
 */
@Data
public class CustomMatterBase {
    String rowguid;
    String cdBatch;

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public String getCdBatch() {
        return cdBatch;
    }

    public void setCdBatch(String cdBatch) {
        this.cdBatch = cdBatch;
    }

    public CustomMatterBase(String rowguid, String cdBatch) {
        this.rowguid = rowguid;
        this.cdBatch = cdBatch;
    }

    @Override
    public String toString() {
        return "CustomMatterBase{" +
                "rowguid='" + rowguid + '\'' +
                ", cdBatch='" + cdBatch + '\'' +
                '}';
    }
}
