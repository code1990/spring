package org.aopalliance.aop;

/**
 * AspectException 是切面异常，是所有aop异常的超类，用户不应该强制捕获
 * @author code1990
 * @date 2018-10-21 15:06
 */
public class AspectException extends RuntimeException {

    /**
     * 构造器
     * @param message
     * @return
     */
    public AspectException(String message){
        super(message);
    }
    /**
     * 构造器
     * @param message
     * @param cause
     * @return
     */
    public AspectException(String message,Throwable cause){
        super(message,cause);
    }
}
