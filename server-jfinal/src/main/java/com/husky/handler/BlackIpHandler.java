package com.husky.handler;


import com.husky.common.DataUtils;
import com.jfinal.handler.Handler;
import com.jfinal.kit.Ret;
import com.jfinal.render.RenderManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlackIpHandler extends Handler {
    @Override
    public void handle(String s, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, boolean[] booleans) {
        System.out.println(httpServletRequest);
        String ip = DataUtils.getRemoteIP(httpServletRequest);
        if ("127.0.0.1".equals(ip)) {
            RenderManager.me().getRenderFactory().getJsonRender(Ret.fail("msg", ip + "被拦截")).setContext(httpServletRequest, httpServletResponse).render();
            return;
        }

        next.handle(s, httpServletRequest, httpServletResponse, booleans);
    }

}
