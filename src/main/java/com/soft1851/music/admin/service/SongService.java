package com.soft1851.music.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft1851.music.admin.domain.entity.Song;


/**
 * @author 小半吻
 */
public interface SongService extends IService<Song> {
    /**
     * 导出数据
     */
    void exportData();
}
