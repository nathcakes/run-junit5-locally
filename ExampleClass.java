/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */
public class ExampleClass {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b){
        if ( (a <=0) || (b <= 0) ){
            throw new IllegalArgumentException("Integers should be greater than 0");
        }
        return a - b;
    }

    public static boolean isEven(int a){
        boolean result;
        if (a % 2 == 0){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
