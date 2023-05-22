package org.jay.service;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ArrayList;
// 代码自动生成器
public class Main {
    public static void main(String[] args) {
        // 需要构建一个 代码自动生成器 对象
        AutoGenerator mpg = new AutoGenerator();
        // 配置策略
        // 1、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath+" 路径");
        gc.setOutputDir(projectPath+"/api/src/main/java");//项目路径
        gc.setAuthor("Jay");//作者
        gc.setOpen(false);//是否打开文件夹
        gc.setFileOverride(false); // 是否覆盖
        gc.setServiceName("%sService"); // 去Service的I前缀
        gc.setIdType(IdType.ID_WORKER);//Id策略
        gc.setDateType(DateType.ONLY_DATE);//时间类型
        //        gc.setSwagger2(true);//是否开启swagger2
        mpg.setGlobalConfig(gc);//自动生成器
        //2、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/oes?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        //3、包的配置
        PackageConfig pc = new PackageConfig();
        //        pc.setModuleName("blog"); 模块 可以不用
        pc.setParent("org.jay.api");
//        pc.setEntity("model");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        //      strategy.setInclude("blog_tags","course","links","sys_settings","user_record"," user_say"); // 设置要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true); // 自动lombok；
        strategy.setLogicDeleteFieldName("deleted");
        // 自动填充配置
        //        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        //        TableFill gmtModified = new TableFill("gmt_modified",FieldFill.INSERT_UPDATE);
        //        ArrayList<TableFill> tableFills = new ArrayList<>();
        //        tableFills.add(gmtCreate);
        //        tableFills.add(gmtModified);
        //        strategy.setTableFillList(tableFills);
        // 乐观锁
        //        strategy.setVersionFieldName("version");
        //        strategy.setRestControllerStyle(true);
        //        strategy.setControllerMappingHyphenStyle(true);
        //localhost:8080/hello_id_2
        mpg.setStrategy(strategy);
        mpg.execute(); //执行
    }
}

