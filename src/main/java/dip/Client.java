package dip;

//高层模块
public class Client {
     public static void main(String[] args) {
       IDriver xiaoLi = new Driver();
       ICar benz = new Benz();
      //小李开奔驰车
      xiaoLi.drive(benz);
   }
}