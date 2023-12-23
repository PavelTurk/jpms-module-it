
package com.foo.core.impl;

import com.foo.core.Brand;
import static com.foo.core.Brand.BMW;
import com.foo.core.Car;
import com.foo.core.CarFactory;

/**
 *
 * @author PavelTurk
 */
public class CarFactoryProvider implements CarFactory {

    @Override
    public Car createCar(Brand brand) {
        switch (brand) {
            case BMW:
                return new Bmw();
            default:
                throw new AssertionError();
        }
    }
}
