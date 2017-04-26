package singleton;

/**
 * Created by Alpha on 2017/4/26.
 * 枚举单例
 *
 * 写法简单
 * 默认枚举实例的创建是线程安全的
 * 在任何情况下都保证是同一个实例（其他单例模式在反序列化时会生成另一个对象）
 * 其他单例若要在反序列化时生成同一个对象需要重写 readSolve() 方法
 */
public enum EnumSingleton {

    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
