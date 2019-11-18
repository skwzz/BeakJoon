package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leet1222_QueensThatCanAttackTheKing {
	static int[] nX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] nY = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) {
		Leet1222_QueensThatCanAttackTheKing l1222 = new Leet1222_QueensThatCanAttackTheKing();
		int[][] q = {{0,1}, {1,0}, {4,0}, {0,4}, {3,3}, {2,4}};
		int[] k = {0, 0};
		List<List<Integer>> answer = new ArrayList<>();
		answer = l1222.qatk(q, k);
		for(int i=0; i<answer.size(); i++) {
			for(int j=0; j<answer.get(i).size(); j++) {
				System.out.print(answer.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}
	
	public List<List<Integer>> qatk(int[][] queens, int[] king){
		int[][] arr = new int[8][8];
		List<List<Integer>> ret = new ArrayList<>();
		
		arr[king[0]][king[1]] = 5;
		for(int i=0; i<queens.length; i++) {
			arr[queens[i][0]][queens[i][1]] = 1;
		}
		/*
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}*/
		
		int kX = king[0];
		int kY = king[1];
		
		for(int i=0; i<8; i++) {
			int cX = kX;
			int cY = kY;
			while(true) {
				cX += nX[i];
				cY += nY[i];
				if(cX<0 || cY<0 || cX>=8 || cY>=8) {
					break;
				}else {
					if(arr[cX][cY]==1) {
						List<Integer> li = new ArrayList<>();
						li.add(cX);
						li.add(cY);
						ret.add(li);
						break;
					}
				}
			}
		}
		
		return ret;
	}
}
