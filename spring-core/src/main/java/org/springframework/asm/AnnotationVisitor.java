package org.springframework.asm;

/**
 * AnnotationVisitor  观察者来观察Java注解
 * @author code1990
 * @date 2018-10-21 19:20
 */
public abstract class AnnotationVisitor {

    protected final int api;
    protected AnnotationVisitor av;

    public AnnotationVisitor(final int api) {
        this.api = api;
    }
}
