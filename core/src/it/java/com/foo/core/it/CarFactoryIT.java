
package com.foo.core.it;

import com.foo.core.Brand;
import com.foo.core.CarFactory;
import java.util.ServiceLoader;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * We test JPMS service!
 *
 * @author PavelTurk
 */
public class CarFactoryIT {

    @Test
    public void createCar_validBrand_success() {
        JpmsUtils.printEnvironment(false);
        var iterator = ServiceLoader.load(CarFactory.class);
        var provider = iterator.findFirst();
        assertThat(provider.isPresent()).isTrue();
        assertThat(provider.get().createCar(Brand.BMW).getBrand()).isSameAs(Brand.BMW);
    }
}
