/** 
 * projectName:Java开发实战经典 
 * fileName:InterfaceCaseDemo04.java 
 * packageName:com.java.development.six.absandinf 
 * date:2018年9月25日下午6:13:43 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.six.absandinf;

/**   
 * @title: InterfaceCaseDemo04.java 
 * @package com.java.development.six.absandinf 
 * @description: TODO工厂设计模式
 * @author: zxsn
 * @date: 2018年9月25日 下午6:13:43 
 * @version: V1.0   
*/
public class InterfaceCaseDemo04 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月25日 下午6:13:43
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        Fruit f = null;
        f = Factory.getInstance("apple");
        f.eat();

    }

}
