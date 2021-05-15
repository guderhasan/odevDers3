package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
User user1=new User();
user1.setId(1);
user1.setUserName("Hasan");
user1.seteMail("hasan@gmail.com");

User user2=new User(2,"Özgür","ozgur@gmail.com");

User[] users= {user1,user2};

UserManager userManager=new UserManager();
userManager.addUsers(users);

Instructor instructor1=new Instructor();
instructor1.setDersProgrami("Kalıtım,Abstract Class");
instructor1.setDersAnlatimi("Kalıtım üst sınıfların alt sınıflara bazı özelliklerini miras bırakmasıdır.Dede ve torunları gibi.");
instructor1.setVerilenOdev("Bu derste ki konuları detaylı araştırınız");

InstructorManager instructorManager=new InstructorManager();
instructorManager.ekle(instructor1);


Student student1=new Student();
student1.setYapilanOdev("Kalıtım Araştırıldı.");
student1.setDegerlendirme("Ders Çok İyiydi");
student1.setYoklama(true);
student1.setTamamlamaOrani(50);


StudentManager studentManager=new StudentManager();
studentManager.ekle(student1);


	}
	
	

}
