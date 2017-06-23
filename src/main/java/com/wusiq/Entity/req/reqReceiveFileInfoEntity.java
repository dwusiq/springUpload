package com.wusiq.Entity.req;

/**
 * 文件管理的入参实体类
 */
public class reqReceiveFileInfoEntity {
    private String describe1;
    private String describe2;

    public String getDescribe1() {
        return describe1;
    }

    public void setDescribe1(String describe1) {
        this.describe1 = describe1;
    }

    public String getDescribe2() {
        return describe2;
    }

    public void setDescribe2(String describe2) {
        this.describe2 = describe2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"describe1\":\"")
                .append(describe1).append('\"');
        sb.append(",\"describe2\":\"")
                .append(describe2).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
