
/**  
* @Title: GenericsDemo01.java
* @Package com.java.development.ten_generics
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月16日
* @version V1.0  
*/

package com.java.development.ten_generics;

/**
* @ClassName: GenericsDemo01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author Administrator
* @date 2018年10月16日
*
*/

public class GenericsDemo02 {

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10.5f);//利用自动装箱操作：float-->Float-->Object
        p.setY(20.6f);
        float x = (Float) p.getX();//取出数据时先变为Float，之后自动拆箱
        Float y = (Float) p.getY();
        System.out.println("小数表示，X的坐标为：" + x);
        System.out.println("小数表示，Y的坐标为：" + y);

    }

}
