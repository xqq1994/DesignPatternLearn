package openClosed.part5;

public class ServiceImpl implements Service {
    public void doSomeThing() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
