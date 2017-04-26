package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alpha on 2017/4/26.
 * 多个单例的管理者
 * <p>
 * 在程序的开始，将多种实现的单例注入到这个统一的管理类中
 * 在使用的时候根据 key 获取对象实例
 * 可以管理多种类型的单例
 * 通过统一的接口降低使用用户的使用成本
 * 对用户隐藏了具体实现，降低了耦合度
 */
public class SingletonManager {

    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerSingleton(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return objectMap.get(key);
    }
}
