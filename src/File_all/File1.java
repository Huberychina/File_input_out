package File_all;
import java.io.*;

/* 思路介绍：
 * 1.首先我想建一个文件，这个文件如果存在我就直接读取数据，如果不存在，则进行创建
 * 2.如果文件不是空文件，则读取其中数据，之后，将文件清空；并将“I Love Java”写入，并输出提示“I have written appointed data”；
 * 	 如果文件开始就是空文件，直接将“I Love Java”写入，并读出；
 *   
 *   
 */
class File1{
	
	public static void main(String[] Args) throws Exception{
		
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
		//这里开始将开始实现第二部分文件读写功能
				if(f.length()==0 ){
					System.out.println("this file is empty!");
					try{
					//write data, use FileOutStream
					
					FileOutputStream fos = new FileOutputStream(f,false);  //只能一个字节一个字节写入,替换掉原来的东西
					//定义DataOutputStream类
					DataOutputStream dos = new DataOutputStream(fos); //这样是为了将数据传入流中，相当于数据流的入口
					
					dos.writeUTF("I don't Love Java"); 
					System.out.println("the file has been writteen");
					fos.close();
					dos.close();
					}catch(Exception e){
						
						System.out.println("the file write not correctly");
						
					}
					
				} 
				else{
					System.out.println("the file's length is: "+f.length()+"byte");
					try{
						//clear data
						
						FileOutputStream fos = new FileOutputStream(f,false);  //只能一个字节一个字节写入,替换掉原来的东西
						//定义DataOutputStream类
						DataOutputStream dos = new DataOutputStream(fos); //这样是为了将数据传入流中，相当于数据流的入口
						
						dos.write(new String("").getBytes()); //z这里就是为了清空文档
						System.out.println("the file has been cleared，it is an empty file now");
						fos.close();
						dos.close();
						}catch(Exception e){
							
							System.out.println("the file clear not correctly");
							
						}
					
					try{
						//write data, use FileOutputStream
						
						FileOutputStream fos = new FileOutputStream(f,false);  //只能一个字节一个字节写入,替换掉原来的东西
						//定义DataOutputStream类
						DataOutputStream dos = new DataOutputStream(fos); //这样是为了将数据传入流中，相当于数据流的入口
						
						dos.writeUTF("I Love Java"); //这个地方读入字符串
						System.out.println("the file has been writteen");
						
						dos.close();
						}catch(Exception e){
							
							System.out.println("the file write not correctly");
							
						}
					try{  
					//read data, use FileInputStream
					
						
					FileInputStream fis = new FileInputStream(f);  //只能一个字节一个字节读
					//定义DataOutputStream类
					DataInputStream dis = new DataInputStream(fis); //这样是为了将数据传入流中，相当于数据流的入口
					
					System.out.println("the file's content is: "+dis.readUTF());
					
					fis.close();
					dis.close();
				
						}catch(IOException e){
							System.out.println("the file can't read correctly");
						}
					
				}			
	}
	}
	
	
	
