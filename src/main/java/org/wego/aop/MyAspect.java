package org.wego.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lst
 * @date 2023年11月10日 15:12
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("@annotation(org.wego.aop.MyLog)")
    private void pt() {
    }

    @Around("pt()")
    public Object calTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + "执行时间：" + (endTime - startTime) + "ms");
        return object;
    }
}
