package odev3;

public class Instructor extends User{
private String dersProgrami;
private String dersAnlatimi;
private String verilenOdev;

public String getDersProgrami() {
	return dersProgrami;
}
public void setDersProgrami(String dersProgrami) {
	this.dersProgrami = dersProgrami;
}
public String getDersAnlatimi() {
	return dersAnlatimi;
}
public void setDersAnlatimi(String dersAnlatimi) {
	this.dersAnlatimi = dersAnlatimi;
}
public String getVerilenOdev() {
	return verilenOdev;
}
public void setVerilenOdev(String verilenOdev) {
	this.verilenOdev = verilenOdev;
}
}
