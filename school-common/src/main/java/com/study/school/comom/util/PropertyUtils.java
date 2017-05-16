/**
 *
 */
package com.study.school.comom.util;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ghost pop文件加载
 */

public class PropertyUtils {

    private static ConcurrentHashMap<String, Properties> pool        = new ConcurrentHashMap<String, Properties>();

    private static Properties init(String file) {
        try {
            InputStream in = PropertyUtils.class.getClassLoader().getResourceAsStream(file);
            Properties prop = new Properties();
            prop.load(in);
            Properties temp = pool.putIfAbsent(file, prop);
            if (temp == null) {
                return prop;
            }
            return temp;
        } catch (Exception e) {
            throw new RuntimeException("Read properties failed!");
        }
    }

    public static String getProperty(String key, String file) {
        if (pool.containsKey(file)) {
            return (String) pool.get(file).get(key);
        } else {
            return (String) init(file).get(key);
        }
    }

}
