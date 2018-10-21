package org.aopalliance.intercept;

import java.lang.reflect.AccessibleObject;

/**
 * @Description Joinpoint是通用接口，运行时的切入点
 * @Author code1990
 * @Date 2018-10-21 14:16
 */
public interface Joinpoint {

    /**
     * 在拦截链当中获取下一个对象
     * @return
     * @throws Throwable 拦截器抛出的异常
     */
    Object proceed() throws Throwable;
    
    /**
     *获取当前正在只有切入点的对象
     * @param
     * @return
     */
    Object getThis();
    
    /**
     *获取一个静态的切入点
     * @param
     * @return
     */
    AccessibleObject getStaticPart();
}
