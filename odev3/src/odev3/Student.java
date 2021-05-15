package odev3;

public class Student extends User{
private String yapilanOdev;
private String degerlendirme;
private boolean yoklama;
private double tamamlamaOrani;


public String getYapilanOdev() {
	return yapilanOdev;
}
public void setYapilanOdev(String yapilanOdev) {
	this.yapilanOdev = yapilanOdev;
}
public String getDegerlendirme() {
	return degerlendirme;
}
public void setDegerlendirme(String degerlendirme) {
	this.degerlendirme = degerlendirme;
}
public boolean getYoklama() {
	return yoklama;
}
public void setYoklama(boolean yoklama) {
	this.yoklama = yoklama;
}
public double getTamamlamaOrani() {
	return tamamlamaOrani;
}
public void setTamamlamaOrani(double tamamlamaOrani) {
	this.tamamlamaOrani = tamamlamaOrani;
}

}
