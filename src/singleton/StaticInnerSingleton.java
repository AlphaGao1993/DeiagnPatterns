package singleton;

/**
 * Created by Alpha on 2017/4/26.
 * 静态内部类单例模式
 * <p>
 * 对 DCL 单例的改进
 * 第一次加载类时不会初始化
 * 第一次调用 getInstance 才会初始化
 * 第一次调用 getInstance 会使虚拟机加载 SingletonHolder 类
 * 确保单例对象的唯一性
 * 延迟了单例的实例化
 * <p>
 * 推荐使用
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    //静态内部类
    private static class SingletonHolder {
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }
}
