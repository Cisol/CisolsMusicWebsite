package com.cisol.cisolsmusicwebsite.entity;

/**
 * Created by Cisol on 2017/5/13 0013.
 */
public class SingerEntity {
    private Long singerId;
    private String singerName;

    public Long getSingerId() {
        return singerId;
    }

    public void setSingerId(Long singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "SingerEntity{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                '}';
    }
}
