package com.cisol.cisolsmusicwebsite.servlet;

import com.cisol.cisolsmusicwebsite.dao.impl.MusicDao;
import com.cisol.cisolsmusicwebsite.entity.MusicEntity;
import com.cisol.cisolsmusicwebsite.service.impl.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Cisol on 2017/5/20 0020.
 */
@WebServlet(
        name = "musicServlet",
        urlPatterns = {"/music"}
)
public class MusicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取对应的请求参数
        String method = req.getParameter("method");
        //根据请求参数调用相应的方法
        switch (method) {
            case "add":
                add(req, resp);
                break;
            case "delete":
                delete(req, resp);
                break;
            case "list":
                list(req, resp);
                break;
            default:
                break;
        }
    }

    private void list(HttpServletRequest req, HttpServletResponse resp) {
        List<MusicEntity> musicList;
        Long musicId = Long.valueOf(req.getParameter("musicId"));
        String musicName = req.getParameter("musicName");
        Long mSingerId = Long.valueOf(req.getParameter("mSingerId"));
        Long mAlbumId = Long.valueOf(req.getParameter("mAlbumId"));
        MusicService musicService = new MusicService(new MusicDao());
        musicList = musicService.getMusicList(musicId, musicName, mSingerId, mAlbumId);
        for(MusicEntity music : musicList) {
            System.out.println(music);
        }
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("add");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("delete");
    }
}
