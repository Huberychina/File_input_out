package File_all;
import java.io.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
/* ˼·���ܣ�
 * 1.�������뽨һ���ļ�������ļ���������Ҿ�ֱ�Ӷ�ȡ���ݣ���������ڣ�����д���
 *   
 *   
 *   
 */
class File1{
	
	public static void main(String[] Args){
		File f = new File("f:\\finding_job\\Github\\File_input_out\\src\\File_all\\abc.txt");
		
		if(f.exists()){
			System.out.println("this file has existed!");
		}
		else {
			try{
			f.createNewFile();
			System.out.println("this file doesn't exist,but it has been created");
			}catch(IOException e){
				
				System.out.println("�����ļ��쳣");
			}
			
		}
	}
	}
	
	
	
