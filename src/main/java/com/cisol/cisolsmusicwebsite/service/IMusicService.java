package com.cisol.cisolsmusicwebsite.service;

import com.cisol.cisolsmusicwebsite.entity.MusicEntity;

import java.util.List;

/**
 * Created by Cisol on 2017/5/20 0020.
 */
public interface IMusicService {

    List<MusicEntity> getMusicList(Long musicId, String musicName, Long singerId, Long albumId);

    MusicEntity getMusicById(Long musicId);

    boolean addMusic(MusicEntity musicEntity);

    boolean deleteMusic(MusicEntity musicEntity);
}
