## 阶段三  MyBatis-Plus框架应用

#### 数据库

#### 使用MySQL数据库，数据库名为part3,表student的结构：

create table student

(

​        id  int  auto_increment  primary key  not null,

​        name  varchar(20)  null,

​        age  int  null,

​        height int null

);

#### 代码生成器

SpringBoot集成MyBatis-Plus，配置application.properties文件，在test/java/com.example.demo下面新建并配置MpGenerator文件，使用代码生成器完成实体组件、Mapper组件（包含XML）、Service组件、Controller组件的自动生成。

#### Service CRUD

在test/java/com.example.demo下面新建StudentTest文件，完成基本数据操作，使用条件构造器QueryWrapper完成条件查询。

#### 数据分页查询

新建配置MyBatisPlusConfig.java文件，编写Mapper文件，通过修改Page的页码当前页和页面显示数量两个参数进行分页查询，在StudentTest进行单元测试。





