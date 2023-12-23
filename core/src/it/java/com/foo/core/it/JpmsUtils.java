
package com.foo.core.it;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author PavelTurk
 */
public class JpmsUtils {

    public static void printEnvironment(boolean showStandard) {
        String[] splits = null;
        List<String> list = new ArrayList<>();

        if (System.getProperty("jdk.module.path") != null) {
            splits = System.getProperty("jdk.module.path").split(":");
            System.out.println(System.lineSeparator() + "MODULE PATH:" );
            for (String split : splits) {
                list.add(split);
            }
        }
        print(list);

        System.out.println(System.lineSeparator() + "CLASS PATH:");
        splits = System.getProperty("java.class.path").split(":");
        for (String split : splits) {
            list.add(split);
        }
        print(list);

        System.out.println(System.lineSeparator() + "BOOT LAYER:");
        if (showStandard) {
            ModuleLayer.boot().modules().stream().forEach(m -> {
                list.add(m.getName());
            });
        } else {
            ModuleLayer.boot().modules().stream().forEach(m -> {
                if (!m.getName().startsWith("java") && !m.getName().startsWith("jdk")) {
                    list.add(m.getName());
                }
            });
        }
        print(list);
        System.out.println("");
    }

    private static void print(List<String> list) {
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        list.clear();
    }
}
