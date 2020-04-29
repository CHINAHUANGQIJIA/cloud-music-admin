package com.soft1851.music.admin.controller;

import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.domain.entity.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ValidateController
 * @Description TODO
 * @Author mq_xu
 * @Date 2020/4/25
 * @Version 1.0
 */
@RestController
@Slf4j
public class ValidateController {
    /**
     * 走参数校验注解
     *
     * @param userDTO
     * @return
     */
    @PostMapping("/save/valid")
    public ResponseResult save(@RequestBody @Validated UserDto userDTO) {
        System.out.println(userDTO);
//        userService.save(userDTO);
        return ResponseResult.success(userDTO);
    }


}
