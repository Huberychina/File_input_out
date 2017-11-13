package File_all;
import java.io.*;

/* ˼·���ܣ�
 * 1.�������뽨һ���ļ�������ļ���������Ҿ�ֱ�Ӷ�ȡ���ݣ���������ڣ�����д���
 * 2.����ļ����ǿ��ļ������ȡ�������ݣ�֮�󣬽��ļ���գ�������I Love Java��д�룬�������ʾ��I have written appointed data����
 * 	 ����ļ���ʼ���ǿ��ļ���ֱ�ӽ���I Love Java��д�룬��������
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
				
				System.out.println("�����ļ��쳣");
			}
		}
		//���￪ʼ����ʼʵ�ֵڶ������ļ���д����
				if(f.length()==0 ){
					System.out.println("this file is empty!");
					try{
					//write data, use FileOutStream
					
					FileOutputStream fos = new FileOutputStream(f,false);  //ֻ��һ���ֽ�һ���ֽ�д��,�滻��ԭ���Ķ���
					//����DataOutputStream��
					DataOutputStream dos = new DataOutputStream(fos); //������Ϊ�˽����ݴ������У��൱�������������
					
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
						
						FileOutputStream fos = new FileOutputStream(f,false);  //ֻ��һ���ֽ�һ���ֽ�д��,�滻��ԭ���Ķ���
						//����DataOutputStream��
						DataOutputStream dos = new DataOutputStream(fos); //������Ϊ�˽����ݴ������У��൱�������������
						
						dos.write(new String("").getBytes()); //z�������Ϊ������ĵ�
						System.out.println("the file has been cleared��it is an empty file now");
						fos.close();
						dos.close();
						}catch(Exception e){
							
							System.out.println("the file clear not correctly");
							
						}
					
					try{
						//write data, use FileOutputStream
						
						FileOutputStream fos = new FileOutputStream(f,false);  //ֻ��һ���ֽ�һ���ֽ�д��,�滻��ԭ���Ķ���
						//����DataOutputStream��
						DataOutputStream dos = new DataOutputStream(fos); //������Ϊ�˽����ݴ������У��൱�������������
						
						dos.writeUTF("I Love Java"); //����ط������ַ���
						System.out.println("the file has been writteen");
						
						dos.close();
						}catch(Exception e){
							
							System.out.println("the file write not correctly");
							
						}
					try{  
					//read data, use FileInputStream
					
						
					FileInputStream fis = new FileInputStream(f);  //ֻ��һ���ֽ�һ���ֽڶ�
					//����DataOutputStream��
					DataInputStream dis = new DataInputStream(fis); //������Ϊ�˽����ݴ������У��൱�������������
					
					System.out.println("the file's content is: "+dis.readUTF());
					
					fis.close();
					dis.close();
				
						}catch(IOException e){
							System.out.println("the file can't read correctly");
						}
					
				}			
	}
	}
	
	
	
