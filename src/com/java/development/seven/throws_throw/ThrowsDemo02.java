/** 
 * projectName:Java开发实战经典 
 * fileName:ThrowsDemo01.java 
 * packageName:com.java.development.seven.throws_throw 
 * date:2018年9月28日下午4:23:57 
 * copyright(c) 2017-2020 xxx公司
 */
package com.java.development.seven.throws_throw;

/**   
 * @title: ThrowsDemo02.java 
 * @package com.java.development.seven.throws_throw 
 * @description: TODO
 * @author: zxsn
 * @date: 2018年9月28日 下午4:23:57 
 * @version: V1.0   
*/
public class ThrowsDemo02 {

    /**
     * @throws Exception 
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018年9月28日 下午4:23:57
     *@param args
     *@throws 
     */
    public static void main(String[] args) throws Exception {
        Math m = new Math();
        System.out.println("除法操作：" + m.div(10, 2));

    }

}
