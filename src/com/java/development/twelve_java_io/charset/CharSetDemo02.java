
/**  
* @Title: CharSetDemo02.java
* @Package com.java.development.twelve_java_io.charset
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Administrator
* @date 2018��10��28��
* @version V1.0  
*/

package com.java.development.twelve_java_io.charset;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
* @ClassName: CharSetDemo02
* @Description: ʹ��ISO8859-1����
* @author Administrator
* @date 2018��10��28��
*
*/

public class CharSetDemo02 {

    /**
     * @throws Exception 
        * @Title: main
        * @Description: TODO(������һ�仰�����������������)
        * @param @param args    ����
        * @return void    ��������
        * @throws
        */

    public static void main(String[] args) throws Exception {
        File f = new File("d:" + File.separator + "a.txt");
        OutputStream out = new FileOutputStream(f);//ʵ���������
        byte b[] = "�й�����ã�".getBytes("ISO8859-1");//ָ��ISO8859-1����
        out.write(b);//����ת��֮�������
        out.close();//�ر������
    }

}
