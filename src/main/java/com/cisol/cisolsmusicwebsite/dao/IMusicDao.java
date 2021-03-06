package com.cisol.cisolsmusicwebsite.dao;

import com.cisol.cisolsmusicwebsite.entity.MusicEntity;

import java.util.List;

/**
 * Created by Cisol on 2017/5/13 0013.
 */
public interface IMusicDao {

    List<MusicEntity> getMusicList(Long musicId, String musicName, Long singerId, Long albumId);

    MusicEntity getMusicById(Long musicId);

    boolean addMusic(MusicEntity musicEntity);

    boolean deleteMusic(MusicEntity musicEntity);

}
