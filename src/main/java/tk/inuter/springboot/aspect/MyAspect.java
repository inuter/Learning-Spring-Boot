package tk.inuter.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* tk.inuter.springboot.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void before() {
        System.out.println("Before ...");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("After ...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("After Returning ...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("After Throwing ...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around before ...");
        joinPoint.proceed();
        System.out.println("Around after ...");
    }
}
