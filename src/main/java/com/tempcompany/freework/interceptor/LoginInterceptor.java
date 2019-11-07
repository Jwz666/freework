package com.tempcompany.freework.interceptor;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tempcompany.freework.component.RetData;
import com.tempcompany.freework.entity.UserInfo;
import com.tempcompany.freework.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author jayMamba
 * @date 2019/11/7
 * @time 11:04
 * @desc
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag=false;
        String openId=request.getHeader("OpenId");
        if(StringUtils.isEmpty(openId)) {
            return flag;
        }
        UserInfo userInfo=new UserInfo();
        userInfo.setOpenid(openId);
        QueryWrapper<UserInfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.setEntity(userInfo);
        UserInfo user = userInfoMapper.selectOne(queryWrapper);
        if(user==null) {
            response.setContentType("application/json; charset=utf-8");
            PrintWriter printWriter = response.getWriter();
            String retJson= JSON.toJSONString(new RetData().fail("401", "未授权"));
            printWriter.write(retJson);
        } else {
            flag=true;
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
