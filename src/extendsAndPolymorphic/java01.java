package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/25 - 23:02.
 */
public class java01 {
    public static void main(String[] args) {

master m = new master();
m.feed(new school(),new food());
m.feed(new classRoom(),new bone());
m.feed(new student(),new meat());


    }
}
class school {
    public void ask (food f) {
        System.out.println("这里是"+f.getFood());
    }
}
class classRoom extends school {
    public void ask (food f) {
        System.out.println("这里是"+f.getFood());
    }
}

class student extends  school {
    public void ask (food f) {
        System.out.println("他叫"+f.getFood());
    }
}

//测试emoji
class food {
    public String getFood () {
        return "吃的";
    }
}

class bone extends  food {
    public String getFood () {
        return "骨头";
    }
}

class meat extends  food {
    public String getFood () {
        return  "肥肉";
    }
}

//主人类
class master {
    public void feed (school s,food f) {
        s.ask(f);
    }
}
