/*
 * Classname             Q_1921
 *
 * Version information   1.0
 *
 * Date                  20/04/22
 *
 * author                Vinícius Silva Mendes
 * Copyright notice      Resolution of URI Judge Problems 
 * Problem name          Guilherme and His Kites
 * Link                  https://www.beecrowd.com.br/judge/en/problems/view/1921
 */
import java.io.IOException;
import java.util.Scanner;

public class Q_1921 {
	
    public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		long N = read.nextLong();
		long answer = (N * (N - 3)) / 2;
		System.out.println(answer);
    }
	
}