/** 
 * projectName:Java����ʵս���� 
 * fileName:PackageDemo.java 
 * packageName:com.java.development.eight.packagedemo 
 * date:2018��9��29������10:04:48 
 * copyright(c) 2017-2020 xxx��˾
 */
package com.java.development.eight.packagedemo;

class Demo {
    public String getInfo() {
        return "Hello World!!!";
    }
}

/**   
 * @title: PackageDemo.java 
 * @package com.java.development.eight.packagedemo 
 * @description: TODO
 * @author: zxsn
 * @date: 2018��9��29�� ����10:04:48 
 * @version: V1.0   
*/
public class PackageDemo {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018��9��29�� ����10:04:48
     *@param args
     *@throws 
     */
    public static void main(String[] args) {
        System.out.println(new Demo().getInfo());

    }

}
