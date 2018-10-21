package org.aopalliance.intercept;

import java.lang.reflect.Method;

/**
 * MethodInvocation 方法拦截点
 * @author code1990
 * @date 2018-10-21 15:17
 */
public interface MethodInvocation {
    /**
     * 获取方法的时候回调
     * @param
     * @return
     */
    Method getMethod();
}
