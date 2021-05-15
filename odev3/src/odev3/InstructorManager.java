package odev3;

public class InstructorManager {
	public void goster(Instructor instructor) {
		System.out.println(
				"Ödeviniz:"+instructor.getVerilenOdev()+
				" Ders Ýçeriði:"+instructor.getDersAnlatimi()+
				" Ders Programý:"+instructor.getDersProgrami());
	}
public void ekle(Instructor instructor) {
	System.out.println("Ödev Eklendi");
	System.out.println("Ders Anlatýldý");
	System.out.println("Ders Programý Yayýnlandý");
	goster(instructor);
	
}

}
