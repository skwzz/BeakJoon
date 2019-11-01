package codingtest.synapsoft;

public class Quiz {
	static int[][] arr = new int[1081][1921];
	public static void main(String[] args){
<<<<<<< HEAD
		
=======
		arr = new int[1080][1920];
>>>>>>> refs/remotes/origin/master
		String[] str = {"1 0 4 2"
				       ,"8 3 9 4"
				       ,"2 3 5 7"
				       ,"4 6 7 8"
				       ,"3 1 6 5"
				       ,"1 8 4 10"
				       ,"7 2 9 5"
				       ,"8 8 10 9"
				       ,"1 4 2 6"};
		
<<<<<<< HEAD
		int pxCnt = 0;
		
		for(int i=0; i<str.length; i++) {			
=======
		int answer = 0;
		
		for(int i=0; i<str.length; i++) {
			
>>>>>>> refs/remotes/origin/master
			String[] temp = str[i].split(" ");
			
			int a = Integer.valueOf(temp[0]);
			int b = Integer.valueOf(temp[1]);
			int c = Integer.valueOf(temp[2]);
			int d = Integer.valueOf(temp[3]);
			
<<<<<<< HEAD
=======
			// 입력된 직사각형을 반복문으로 돌리면서 총면적(answer)을 늘려주며, 이미 총 면적에 대해 늘어난적이 있으면 면적을 늘려주지 않음
>>>>>>> refs/remotes/origin/master
			for(int j=b; j<d; j++) {
				for(int k=a; k<c; k++) {
					if(arr[j][k]==0) {
						pxCnt++;
					}
					arr[j][k]++;
				}
			}
		}
		System.out.println(pxCnt);
		
	}
}
