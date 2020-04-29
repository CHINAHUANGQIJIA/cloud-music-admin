package com.soft1851.music.admin.controller;


import com.soft1851.music.admin.domain.entity.SongList;
import com.soft1851.music.admin.service.SongListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mq_xu
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/songList")
public class SongListController {
    @Resource
    private SongListService songListService;

    @GetMapping(value = "/all")
    public List<SongList> getSongList() {
        return songListService.getTopSongList();
    }

    @GetMapping(value = "/export")
    public void export() {
        songListService.exportData();
    }
}
