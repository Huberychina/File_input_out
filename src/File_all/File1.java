package File_all;
import java.io.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
/* 思路介绍：
 * 1.首先我想建一个文件，这个文件如果存在我就直接读取数据，如果不存在，则进行创建
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
				
				System.out.println("创建文件异常");
			}
			
		}
	}
	}
	
	
	
