package com.zzyl.framework.interceptor;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.zzyl.common.core.domain.model.LoginUser;
import com.zzyl.common.utils.SecurityUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.zzyl.common.utils.SecurityUtils.getLoginUser;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "createTime", Date.class, new Date());
        strictInsertFill(metaObject, "createBy", String.class, String.valueOf(loadUserId()));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("updateBy", String.valueOf(loadUserId()), metaObject);
//        strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
//        strictUpdateFill(metaObject, "updateBy", String.class, String.valueOf(loadUserId()));
    }

    /**
     * 获取当前登录人的ID
     * @return  登录人ID
     */
    public Long loadUserId() {
        LoginUser loginUser = getLoginUser();
        if (loginUser != null) {
            return loginUser.getUserId();
        }
        return 1L;
    }
}