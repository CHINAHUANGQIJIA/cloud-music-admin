package com.soft1851.music.admin.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.soft1851.music.admin.domain.entity.SongType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SongTypeMapperTest {
    @Resource
    private SongTypeMapper songTypeMapper;

    /**
     * 根据根据 entity 条件，删除记录,QueryWrapper实体对象封装操作类（可以为 null）
     * 下方获取到queryWrapper后
     * 删除的条件为song_count小于1000并且type_name非空的数据
     * isNull,isNotNull,ge,le,eq,like,or,and,between,orderBy,orderByDesc,groupBy,exists,first,last,having,in
     */
    @Test
    public void delete() {
        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("type_name")
                .le("song_count", 1000);
        int delete = songTypeMapper.delete(queryWrapper);
        System.out.println("delete return count = " + delete);
    }


    /**
     * 根据 entity 条件，查询一条记录,
     * 这里和上方删除构造条件一样，只是selectOne返回的是一条实体记录，当出现多条时会报错
     */
    @Test
    public void selectOne() {
        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_name", "流行");
        SongType songType = songTypeMapper.selectOne(queryWrapper);
        System.out.println(songType);
    }

    /**
     * 根据 Wrapper 条件，查询总记录数
     */
    @Test
    public void selectCount() {
        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type_name", "流行");
        Integer count = songTypeMapper.selectCount(queryWrapper);
        System.out.println(count);
    }

    /**
     * 查询全部记录
     */
    @Test
    public void selectList() {
        List<SongType> list = songTypeMapper.selectList(null);
        System.out.println(list);
    }

    /**
     * 根据 Wrapper 条件，查询全部记录
     */
    @Test
    public void selectMaps() {
        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("type_name");
        List<Map<String, Object>> maps = songTypeMapper.selectMaps(queryWrapper);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    /**
     * 根据 entity 条件，查询全部记录（并分页）
     * 需要在项目中配置分页插件PaginationInterceptor
     */
    @Test
    public void selectPage() {
        Page<SongType> page = new Page<>(1, 10);
        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
        IPage<SongType> songTypePage = songTypeMapper.selectPage(page, queryWrapper);
        System.out.println(songTypePage);
    }


//    /**
//     * 根据 Wrapper 条件，查询全部记录（并分页）
//     */
//    @Test
//    public void selectMapsPage() {
//        Page<SongType> page = new Page<>(1, 5);
//        QueryWrapper<SongType> queryWrapper = new QueryWrapper<>();
//        IPage<Map<String, Object>> mapIPage = songTypeMapper.selectMapsPage(page, queryWrapper);
//        System.out.println(mapIPage);
//    }


    /**
     * 根据 whereEntity 条件，更新记录
     */
    @Test
    public void update() {
        //修改值
        SongType songType = new SongType();
        songType.setTypeName("测试类型名称");
        //修改条件
        UpdateWrapper<SongType> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.eq("type_id", "b1bb59e0815e11ea8cd1b4b686bbf77b");
        int update = songTypeMapper.update(songType, userUpdateWrapper);
        System.out.println(update);
    }
}