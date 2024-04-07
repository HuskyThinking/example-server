package com.husky.model;

import com.husky.config.HuskyConfig;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.generator.Generator;
import com.jfinal.plugin.druid.DruidPlugin;

import javax.sql.DataSource;


public class _Generator {

    public static DataSource getDataSource() {
        DruidPlugin dp = HuskyConfig.createDruidPlugin();
        dp.start();
        return dp.getDataSource();
    }

    public static void main(String[] args) {

        // model 所使用的包名 (MappingKit 默认使用的包名)
        String modelPackageName = "com.husky.model";
        // base model 所使用的包名
        String baseModelPackageName = modelPackageName + ".base";
        // base model 文件保存路径
        String baseModelOutputDir = System.getProperty("user.dir")+ "/server-jfinal" + "/src/main/java/" + baseModelPackageName.replace('.', '/');
        // model 文件保存路径 (MappingKit 与 DataDictionary 文件默认保存路径)
        String modelOutputDir = baseModelOutputDir + "/..";

        // 创建生成器
        Generator gen = new Generator(getDataSource(), baseModelPackageName, baseModelOutputDir, modelPackageName, modelOutputDir);

        // 排除
//        gen.addExcludedTable("course");

        // 设置数据库方言
        gen.setDialect(new MysqlDialect());
        // 是否在Model中生成dao对象
        gen.setGenerateDaoInModel(true);
        // 是否设置生成字典文件
        gen.setGenerateDataDictionary(false);
        // 在 getter、setter 方法上生成字段备注内容
        gen.setGenerateRemarks(true);
        // 开始生成代码
        gen.generate();

    }

}
