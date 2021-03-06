package com.company;
import com.company.AbstractFactory.TestAbstractFactory;
import com.company.Builder.TestBuilder;
import com.company.FactoryMethod.TestFactoryMethod;
import com.company.Singleton.TestSingleton;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        TestSingleton testSingleton = new TestSingleton();
        testSingleton.singletone();

        TestBuilder testBuilder = new TestBuilder();
        testBuilder.builder();

        TestFactoryMethod testFactoryMethod = new TestFactoryMethod();
        testFactoryMethod.FactoryMethod();

        TestAbstractFactory testAbstractFactory = new TestAbstractFactory();
        testAbstractFactory.AbstractFactory();
    }
}
