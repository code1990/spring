package org.aopalliance.intercept;

/**
 * MethodInterceptor 方法拦截器
 * @author code1990
 * @date 2018-10-21 15:15
 */
@FunctionalInterface
public interface MethodInterceptor extends Interceptor{

    /**
     * 在方法的拦截之前或者之后可以被调用
     * @param invocation
     * @return
     * @throws  Throwable 异常
     */
    Object invoke(MethodInvocation invocation) throws Throwable;
}
