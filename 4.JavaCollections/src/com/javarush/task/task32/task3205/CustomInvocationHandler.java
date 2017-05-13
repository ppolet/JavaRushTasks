package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Mike on 06.05.2017.
 */
public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods someInterfaceWithMethods;

    public CustomInvocationHandler(SomeInterfaceWithMethods someInterfaceWithMethods) {
        this.someInterfaceWithMethods = someInterfaceWithMethods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        someInterfaceWithMethods = new SomeInterfaceWithMethodsImpl();
        if (method.getName().endsWith("WithIntArg")) {
            System.out.println(method.getName() + " in");
            method.invoke(someInterfaceWithMethods, args);
            System.out.println(method.getName() + " out");
        }
        if (method.getName().endsWith("MethodWithoutArgs")) {
            System.out.println(method.getName() + " in");
            method.invoke(someInterfaceWithMethods);
            System.out.println(method.getName() + " out");
        }
        return null;
    }
}