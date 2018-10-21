package org.aopalliance.intercept;

import java.lang.reflect.Constructor;

/**
 * ConstructorInterceptor  拦截器构造器
 * @author code1990
 * @date 2018-10-21 15:07
 */
public interface ConstructorInterceptor extends Interceptor {

    /**
     * 回调时候的 获取构造器
     * @param invocation 切入点
     * @return
     * @throws Throwable 异常
     */
    Object construct(ConstructorInvocation invocation) throws Throwable;
}
