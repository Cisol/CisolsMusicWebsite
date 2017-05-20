package com.cisol.cisolsmusicwebsite.service.impl;

import com.cisol.cisolsmusicwebsite.dao.IMusicDao;
import com.cisol.cisolsmusicwebsite.entity.MusicEntity;
import com.cisol.cisolsmusicwebsite.service.IMusicService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class MusicService implements IMusicService{
    private IMusicDao musicDao;

    public MusicService(IMusicDao musicDao) {
        this.musicDao = musicDao;
    }


    @Override
    public List<MusicEntity> getMusicList(Long musicId, String musicName, Long singerId, Long albumId) {
        return musicDao.getMusicList(musicId, musicName, singerId, albumId);
    }

    @Override
    public MusicEntity getMusicById(Long musicId) {
        return null;
    }

    @Override
    public boolean addMusic(MusicEntity musicEntity) {
        return false;
    }

    @Override
    public boolean deleteMusic(MusicEntity musicEntity) {
        return false;
    }
}
