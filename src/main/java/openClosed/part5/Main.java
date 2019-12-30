package openClosed.part5;

public class Main {
    //模板模式实现类似AOP打印执行方法消耗时间
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        PriTime doPri = new PriTime.DoPri(service);
        doPri.doPriTime();
    }
}
