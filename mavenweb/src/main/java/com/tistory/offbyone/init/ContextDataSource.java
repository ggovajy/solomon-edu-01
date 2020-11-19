package com.tistory.offbyone.init;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 데이터베이스 설정
 */
@Configuration
// 아노 테이션 기반 트랜잭션 관리를 사용  <tx:annotation-driven>
@EnableTransactionManagement
public class ContextDataSource {
	
	/**
	 * 데이터소스 등록
	 * @return
	 */
	@Bean(destroyMethod="close")
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC");
		dataSource.setUsername("testdbadm");
		dataSource.setPassword("testdbadm");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}
	
	/**
	 * 트랜잭션 매니저 등록
	 * @return
	 */
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
