package com.hee;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class QnaBoard2Application {
    // 스프링부트 프로젝트가 실행될 때, 프로젝트 내부와 외부의 설정 파일을 모두 불러온다.
    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
//            + "/Users/heejeong/app/config/webservice/real-application.yml";
            + "/app/config/webservice/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(QnaBoard2Application.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }
}
