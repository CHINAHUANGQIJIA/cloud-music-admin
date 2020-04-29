package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.domain.entity.SongList;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 小半吻
 *
 */
public interface SongListService extends IService<SongList> {
    /**
     * 热门歌单
     *
     * @return
     */
    List<SongList> getTopSongList();

    /**
     * 导出歌单
     */
    void exportData();
}
