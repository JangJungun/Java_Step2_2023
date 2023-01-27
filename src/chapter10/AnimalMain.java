package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Bear b = new Bear();
		Lion lion = new Lion();
		Spider spider = new Spider();
		System.out.println("-------곰-------");
		System.out.println("눈 : "+b.getEye());
		System.out.println("다리 : "+b.getLeg());
		System.out.println("특징 : "+b.woong);
		
		System.out.println("-------사자-------");
		System.out.println("눈 : "+lion.getEye());
		System.out.println("다리 : "+lion.getLeg());
		System.out.println("특징 : "+lion.galgi);
		
		System.out.println("-------거미-------");
		System.out.println("눈 : "+spider.getEye());
		System.out.println("다리 : "+spider.getLeg());
		System.out.println("특징 : "+spider.web);
		
		
	}

}
