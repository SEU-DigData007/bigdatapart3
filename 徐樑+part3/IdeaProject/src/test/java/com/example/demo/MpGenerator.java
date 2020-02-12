package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MpGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 1.全局配置
        GlobalConfig gConfig = new GlobalConfig();
        gConfig.setAuthor("Xl");
        gConfig.setOutputDir("D://IdeaProject/src/main/java");// 生成路径
        gConfig.setFileOverride(false);// 是否覆盖同名文件，默认是false
        gConfig.setIdType(IdType.AUTO);//主键策略
        gConfig.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gConfig.setBaseResultMap(true);
        gConfig.setBaseColumnList(true);
        mpg.setGlobalConfig(gConfig);

        // 2.数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL);
        dsConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dsConfig.setUsername("root");
        dsConfig.setPassword("xl961230");
        dsConfig.setUrl("jdbc:mysql://localhost:3306/part3?serverTimezone=UTC");
        mpg.setDataSource(dsConfig);

        // 3.策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setTablePrefix(new String[] { "stu_" });// 此处可以修改为您的表前缀
        stConfig.setNaming(NamingStrategy.no_change);// 表名生成策略
        stConfig.setInclude(new String[] { "student" }); // 需要生成的表
        mpg.setStrategy(stConfig);

        // 4.包名策略
        PackageConfig pcConfig = new PackageConfig();
        pcConfig.setParent("com");
        pcConfig.setModuleName("example.demo");
        pcConfig.setController("controller");
        pcConfig.setEntity("entity");
        pcConfig.setMapper("mapper");
        pcConfig.setService("service");
        pcConfig.setServiceImpl("serviceImpl");
        pcConfig.setXml("mapperXml");
        mpg.setPackageInfo(pcConfig);

        String templatePath = "/templates/mapper.xml.ftl";
        mpg.execute();
    }
}