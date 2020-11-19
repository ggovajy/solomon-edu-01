package com.tistory.offbyone.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 루트 컨텍스트 설정파일
 */
@Configuration
@Import({
  ContextDataSource.class
, ContextSqlMapper.class
})
@ComponentScan(basePackages = {"com.tistory.offbyone.service.impl"})
public class RootContextConfiguration {
}
