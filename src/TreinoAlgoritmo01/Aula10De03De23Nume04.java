package Exercicio04;
//esqueleto matriz
public class Aula10De03De23Nume04 {
	public static void main(String[] args) {
		int matriz [] [] = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = i + j;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
