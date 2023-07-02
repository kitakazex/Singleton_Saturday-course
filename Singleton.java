public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // コンストラクタをprivateにすることで、外部からのインスタンス生成を禁止する。
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}