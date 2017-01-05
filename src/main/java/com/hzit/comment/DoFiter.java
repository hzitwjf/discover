package com.hzit.comment;

import com.hzit.dao.vo.CheckVo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/1/5.
 */
public class DoFiter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 获取初始化参数
        String site = filterConfig.getInitParameter("stuNameFilter");

        // 输出初始化参数
        System.out.println(site);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
            CheckVo checkVo= (CheckVo) request.getSession().getAttribute("checkVo");
            if (checkVo==null){
                response.sendRedirect("/index.jsp");
            }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("学生过滤器销毁");
    }
}
