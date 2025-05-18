package org.example.basics.comment;

/**
 * 文档注释：除了单行注释和多行注释，还有文档注释。
 * <p>
 * 文档注释主要是针对于类/方法/类变量等的描述
 */
@SuppressWarnings("unused")
public class DocumentationComment {

    /**
     * 类属性的文档注释
     */
    private int property;

    /**
     * 方法上的文档注释除了对方法本身的逻辑进行描述之外，
     * 一般还会对方法的入参/返回值进行描述
     *
     * @param args 方法的入参
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
