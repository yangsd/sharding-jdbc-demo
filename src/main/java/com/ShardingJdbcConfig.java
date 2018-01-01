package com;

import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author sdyang
 * @create 2018-01-01 8:36
 **/
@Configuration
public class ShardingJdbcConfig {

    @Bean("defautKeyGenerator")
    public DefaultKeyGenerator getKeyGenerator() {
        return new DefaultKeyGenerator();
    }


//    @Bean
//    public TableRuleConfiguration getTableRuleConfiguration() {
//        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
//        orderTableRuleConfig.setLogicTable("t_order");
//        orderTableRuleConfig.setActualDataNodes("ds_0.t_order_0, ds_0.t_order_1");
//        orderTableRuleConfig.setTableShardingStrategyConfig(new ComplexShardingStrategyConfiguration("order_id", "com.MyTableShardingAlgorithm"));
//
//        return orderTableRuleConfig;
//    }
//
//    @Bean
//    public ShardingRuleConfiguration getShardingRuleConfiguration() {
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//
//        shardingRuleConfig.getTableRuleConfigs().add(getTableRuleConfiguration());
//
//        shardingRuleConfig.setDefaultKeyGeneratorClass("io.shardingjdbc.core.keygen.DefaultKeyGenerator");//主键生成策略
//        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new ComplexShardingStrategyConfiguration("order_id", "com.MyTableShardingAlgorithm"));
//        return shardingRuleConfig;
//    }

}
