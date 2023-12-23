
package com.foo.core.impl;

import com.foo.core.Brand;
import com.foo.core.Car;

/**
 *
 * @author PavelTurk
 */
public class Bmw implements Car {

    public Bmw() {

    }

    @Override
    public Brand getBrand() {
        return Brand.BMW;
    }

    String startEngine() {
        return "brbrbr";
    }
}
