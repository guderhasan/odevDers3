package odev3;

public class StudentManager {
	public void goster(Student student) {
		System.out.println(
				student.getYapilanOdev()+" "+
				student.getDegerlendirme()+" "+
				student.getTamamlamaOrani()+" "+
				student.getYoklama()
				
				);
				
	}
public void ekle(Student student) {
	System.out.println("Ödevler Yapýldý");
	System.out.println("Yoklama Alýndý");
	System.out.println("Deðerlendirildi");
	System.out.println("Tamamlama Oraný Belirlendi");

	goster(student);
	
}
}
