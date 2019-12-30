package dip;

//将司机模块抽象为一个接口
public interface IDriver {
     //是司机就应该会驾驶汽车
     //依赖注入可以通过构造器和get/set方法
     void drive(ICar car);

}









