package org.aopalliance.intercept;

/**
 * Invocation 是一个拦截点，可以被拦截器拦截
 * @author code1990
 * @date 2018-10-21 15:08
 */
public interface Invocation extends Joinpoint {
    
    /**
     * 获取拦截点的参数
     * @param:
     * @return:
     */
    Object[] getArguments();
}
