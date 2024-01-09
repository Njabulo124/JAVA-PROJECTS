package nestedloopie;

public class NestedLoopie {

	public static void main(String[] args) {
		String nMdunjana[][] = {{"NJABULO","NJABS","MJE","f","f","dd"},{"MDUNJANANA","LAWU","NDENZA","kkk","lllll","ffffff"}};
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<6; j++) {
				System.out.println(nMdunjana[i][j]);
			}
		}
	System.out.println("-------------------------------------------------------------------");
	for(int i = 0; i<1; i++) {
		for(int j = 0; j<5; j++) {
			System.out.println("i = "+i+","+ "J = "+j);
		}
	}
	}
}
