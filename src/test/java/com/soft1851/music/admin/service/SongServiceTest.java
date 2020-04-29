package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SongServiceTest {
    @Resource
    private SongService songService;

    @Test
    void exportData() {
        songService.exportData();
    }
}