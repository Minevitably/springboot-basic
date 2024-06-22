package fun.mycat.demo06aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class HelloAop {
    @Pointcut("execution (* fun.mycat.demo06aop.demos.web.BasicController.hello(..))")
    public void log() {

    }

    @Before("log()")
    public void beforeRun() {
        log.info("hello aop: before run");
    }

    @After("log()")
    public void afterRun() {
        log.info("hello aop: after run");
    }
}