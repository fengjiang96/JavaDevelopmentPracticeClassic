/** 
 * projectName:Java����ʵս���� 
 * fileName:StaticDemo08.java 
 * packageName:com.java.development.five.staticeg 
 * date:2018��9��14������12:12:49 
 * copyright(c) 2017-2020 xxx��˾
 */
package com.java.development.five.staticeg;

/**   
 * @title: StaticDemo08.java 
 * @package com.java.development.five.staticeg 
 * @description: TODO
 * @author: zxsn
 * @date: 2018��9��14�� ����12:12:49 
 * @version: V1.0   
*/
public class StaticDemo08 {

    /**
     *@title main 
     *@description: TODO
     *@author: zxsn
     *@date: 2018��9��14�� ����12:12:49
     *@param args
     *@throws 
     */
    public static void main(String[] args) { //�˳���ֻ�����ն�����
        if (args.length != 3) {
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("��" + (i + 1) + "��������" + args[i]);

        }

    }

}
