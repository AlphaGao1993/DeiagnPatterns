package singleton;

/**
 * Created by Alpha on 2017/4/26.
 * <p>
 * 基本的单例模式，饿汉单例模式
 */
public class HungarySingleton {
    //维持一个静态变量，在类加载的时候就初始化
    private static final HungarySingleton instance = new HungarySingleton();

    //构造方法私有化
    private HungarySingleton() {
    }

    //暴露获取唯一实例的方法
    public static HungarySingleton getInstance() {
        return instance;
    }
}
