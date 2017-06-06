package com.cisol.cisolsmusicwebsite.dao.impl;

import com.cisol.cisolsmusicwebsite.dao.IMusicDao;
import com.cisol.cisolsmusicwebsite.entity.MusicEntity;
import com.cisol.cisolsmusicwebsite.utils.DriverManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cisol on 2017/5/20 0020.
 */
public class MusicDao implements IMusicDao {
    private static DriverManager driverManager = DriverManager.getInstance();
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet result = null;

    @Override
    public List<MusicEntity> getMusicList(Long musicId, String musicName, Long singerId, Long albumId) {
        List<MusicEntity> musicList = new ArrayList<MusicEntity>();
        MusicEntity musicEntity = new MusicEntity();
        try {
            conn = driverManager.getConnection();
            String sql = "select * from musics";
            pst = conn.prepareStatement(sql);
            result = pst.executeQuery();
            while (result.next()) {
                musicEntity.setMusicId(result.getLong("musicId"));
                musicEntity.setMusicName(result.getString("musicName"));
                musicEntity.setmSingerId(result.getLong("mSingerId"));
                musicEntity.setmAlbumId(result.getLong("mAlbumId"));
                musicEntity.setmUrl(result.getString("mUrl"));
                musicList.add(musicEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musicList;
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
