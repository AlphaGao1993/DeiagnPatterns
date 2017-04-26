package singleton;

/**
 * Created by Alpha on 2017/4/26.
 * 双重检查锁定单例模式（Double check lock）
 * 在需要时才初始化单例，第一次调用反应稍慢
 * 能保证线程安全
 * 初始化之后不再需要同步，节省同步资源开销
 * 在高并发或 JDK 1.6 以下使用可能会导致 DCL 失效
 * DCL 失效可以通过给 instance 加 volatile 关键字解决，但是会略微影响性能
 */
public class DCLSingleton {

    private static DCLSingleton instance = null;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
