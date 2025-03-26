class MobileDriver{
	public static void main(String[] args) {
		Mobile M1=new Mobile();
		M1.Brand="Apple";
		M1.Model="Iphone 16";
		M1.Processor="A17 Bionic";
		M1.NoOfCamera=2;
		M1.Price=70000;
		M1.Storage=128;

		System.out.println(M1);
		System.out.println(M1.Brand);
		System.out.println(M1.Model);
		System.out.println(M1.Processor);
		System.out.println(M1.NoOfCamera);
		System.out.println(M1.Price);
		System.out.println(M1.Storage);
		System.out.println("_________________________");


		Mobile M2=new Mobile();
		M2.Brand="Vivo";
		M2.Model="V15";
		M2.Processor="Snapdragon";
		M2.NoOfCamera=4;
		M2.Price=21000;
		M2.Storage=256;


		System.out.println(M2);
		System.out.println(M2.Brand);
		System.out.println(M2.Model);
		System.out.println(M2.Processor);
		System.out.println(M2.NoOfCamera);
		System.out.println("_________________________");


		Mobile M3=new Mobile();
		M3.Brand="IQOO";
		M3.Model="Z3";
		M3.Processor="Snapdragon 8 Gen 3";
		M3.NoOfCamera=3;
		M3.Price=20000;
		M3.Storage=256;

		
		System.out.println(M3);
		System.out.println(M3.Brand);
		System.out.println(M3.Model);
		System.out.println(M3.Processor);
		System.out.println(M3.NoOfCamera);
		System.out.println("_________________________");
	}
}