package com.husky.config;

import com.husky.HuskyRoutes;
import com.husky.model._MappingKit;
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

public class HuskyConfig extends JFinalConfig {
    /**
     * 配置JFinal常量值
     *
     * @param me
     */
    @Override
    public void configConstant(Constants me) {
        /*配置开发模式，true为开发模式*/
        me.setDevMode(true);

        /*配置依赖注入 */
//        me.setInjectDependency(true);
    }

    /**
     * 配置访问路由
     *
     * @param me
     */
    @Override
    public void configRoute(Routes me) {
        //路由扫描,扫描后才可通过浏览器获取结果
//        me.scan("com.husky.controller.");
        me.setMappingSuperClass(true);
        me.add(new HuskyRoutes());
    }

    /**
     * 配置模板引擎
     *
     * @param me
     */
    @Override
    public void configEngine(Engine me) {
        me.setBaseTemplatePath("webapp");
        me.setToClassPathSourceFactory();
    }

    /**
     * 配置插件
     *
     * @param me
     */
    @Override
    public void configPlugin(Plugins me) {
        DruidPlugin dp = createDruidPlugin();
        me.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        me.add(arp);
        _MappingKit.mapping(arp);
    }

    public static DruidPlugin createDruidPlugin() {
        DruidPlugin dp = new DruidPlugin("jdbc:mysql://39.99.81.240:3306/school_exercise?useUnicode=true&characterEncoding=UTF-8", "root", "X14Lidx52!yu");
        dp.setFilters("start,wall");
        return dp;
    }

    /**
     * 配置拦截器
     *
     * @param me
     */
    @Override
    public void configInterceptor(Interceptors me) {
        /*创建了一个登录拦截器，但拦截规则还未配置
        me.add(new LogInterceptor());
         */
    }

    /**
     * 接管所有web请求
     *
     * @param me
     */
    @Override
    public void configHandler(Handlers me) {

    }

}
