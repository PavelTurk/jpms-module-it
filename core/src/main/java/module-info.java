
module com.foo.core {

    exports com.foo.core;

    provides com.foo.core.CarFactory with com.foo.core.impl.CarFactoryProvider;
}
