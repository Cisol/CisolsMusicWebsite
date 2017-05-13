package com.cisol.cisolsmusicwebsite.entity;

import java.io.Serializable;

/**
 * Created by Cisol on 2017/5/13 0013.
 */
public class MusicEntity implements Serializable{
    private static final long SerialVersionUID = 1L;

    private Long musicId;
    private String musicName;
    private Long mSingerId;
    private Long mAlbumId;
    private String mUrl;

    public Long getMusicId() {
        return musicId;
    }

    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public Long getmSingerId() {
        return mSingerId;
    }

    public void setmSingerId(Long mSingerId) {
        this.mSingerId = mSingerId;
    }

    public Long getmAlbumId() {
        return mAlbumId;
    }

    public void setmAlbumId(Long mAlbumId) {
        this.mAlbumId = mAlbumId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    @Override
    public String toString() {
        return "MusicEntity{" +
                "musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", mSingerId=" + mSingerId +
                ", mAlbumId=" + mAlbumId +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
