package org.example.basics.variable;

@SuppressWarnings("all")
public class VariableType {
    // 成员变量
    private int instanceVar;
    // 类变量
    private static int staticVar;

    public void foo(int paramVar) {
        int localVar = 10; // 局部变量

        instanceVar = localVar;
        staticVar = paramVar;

        System.out.println("成员变量：" + instanceVar);
        System.out.println("静态变量：" + staticVar);
        System.out.println("参数变量：" + paramVar);
        System.out.println("局部变量：" + localVar);
    }

    public static void main(String[] args) {
        VariableType variableType = new VariableType();
        variableType.foo(20);
    }
}
