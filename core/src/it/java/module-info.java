
module com.foo.core.it {
    requires com.foo.core;

    requires org.junit.jupiter.api;
    requires org.assertj.core;

    exports com.foo.core.it to org.junit.platform.commons;

   uses com.foo.core.CarFactory;
}
