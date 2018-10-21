package org.aopalliance.intercept;

import java.lang.reflect.Constructor;

/**
 * ConstructorInvocation 描述一个切入点或者拦截点的构造器
 * @author code1990
 * @date 2018-10-21 15:07
 */
public interface ConstructorInvocation extends Invocation {

    /**
     * 回调时候的 获取构造器
     * @param:
     * @return:
     */
    Constructor<?> getConstructor();
}