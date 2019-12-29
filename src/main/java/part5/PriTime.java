package part5;


import jdk.nashorn.internal.ir.CallNode;

public abstract class PriTime {
    abstract long time();
    abstract void priTime(long state,long end);
    private Service service;

    public PriTime(Service service) {
        this.service = service;
    }

    public void doPriTime(){
        long l = time();
        service.doSomeThing();
        long l1 = time();
        priTime(l,l1);
    }
    static class DoPri extends PriTime{

        public DoPri(Service service) {
            super(service);
        }
        long time() {
            return System.currentTimeMillis();
        }

        void priTime(long state, long end) {
            System.out.println("DoPri.priTime:"+(end - state));
        }
    }




}
