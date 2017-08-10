package extendsAndPolymorphic;

/*
* @author zhaoyingxiang
* @description  匿名内部类是局部内部类的一种特殊形式，也就是没有变量名指向这个类的实例，而且具体的类实现会写在这个内部类里面。
* @Date Createed in  2017/8/10 19:46
* @modidied by 
*/public final class java05 {
    public  static void main(String []args) {
        teache t = new teache();
        t.setName("汉江师范");
        t.work();
        driver d = new driver();
        d.setName("小城");
        d.work();
    }

}
//定义一个抽象类
abstract class peo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象方法
    public abstract void work();

}

class teache extends peo {
//必须实现该方法
    public void work () {
        System.out.println("我的名字叫："+this.getName()+"我正在讲课请大家不要东张西望");
    }
}
class driver extends  peo {
    //必须实现该方法
    public void work() {
        System.out.println("我的名字叫"+this.getName()+"我正在开车不要接听电话");
    }
}