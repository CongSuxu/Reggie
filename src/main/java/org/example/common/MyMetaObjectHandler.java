package org.example.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject){
        log.info("公共字段自动填充[insert]。。。");
        log.info(metaObject.toString());
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("createUser", 1L);
        metaObject.setValue("updateUser", 1L);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("公共字段自动填充[insert]。。。");
        log.info(metaObject.toString());
    }
}
