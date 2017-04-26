package singleton;

/**
 * Created by Alpha on 2017/4/26.
 * 懒汉单例模式，
 * 只在第一次调用的时候初始化
 * 不使用的时候会节省一定资源
 * 即使已经实例化仍然同步增加开销
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    //多线程下保证实例唯一，即使已经被初始化，会增加额外的资源负担，第一次调用的时候反应稍慢
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
