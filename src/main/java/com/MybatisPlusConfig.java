package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sdyang
 * @create 2017-12-12 16:53
 **/
@Configuration
@MapperScan("com.mapper*")
public class MybatisPlusConfig {


}
