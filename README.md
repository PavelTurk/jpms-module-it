# jpms-module-it
IT tests for JPMS module

When IT test is executed it prints environment:

    ...
    BOOT LAYER:
    com.foo.core              <-- This is a JPMS module under test
    com.foo.core.it           <-- This is a JPMS module with IT tests
    net.bytebuddy
    org.apiguardian.api
    org.assertj.core
    org.junit.jupiter.api
    org.junit.platform.commons
    org.opentest4j

Another note - if you comment `uses com.foo.core.CarFactory` in `src/it/java/module-info.java` then test will fail.