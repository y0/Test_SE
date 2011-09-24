package com.kharlin.testse;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: y0
 * Date: 24.09.11
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main (String[] args) {
        System.out.println("test");

    }
}

class CollectionTest<String> implements CollectionReturnInterface {

    public Collection<java.lang.String> getElementsList() {
        return new ArrayList<java.lang.String>();
    }
}