package pack_JavaStudy_2;

public class FCT_05 {

	public static void main(String[] args) {
		/*해설
		어떤 공장에서는 단기 알바생들에게 각자 다른 방식으로 임금을 지급하고 있습니다.
		 각 알바생이 지급받는 임금은 다음과 같은 요소에 의해 결정됩니다.
		 임금 지급 간격: 공장에서 임금을 지급하는 간격(일수)입니다.
		 1회 임금 비용: 한번에 지급받는 임금의 금액입니다.
		 
		임금 지급 간격이 2일이고 1회 임금 비용이 150 달러인 알바생이 지급받는 금액은 다음 표와 같습니다.
		일차	지급 금액	누적 지급 금액
		 1	0		0
		 2	150		150
		 3	0		150
		 4	150		300
		 ...	...		...
		 
		 당신은 이 공장의 관리자로, 공장을 특정 일수만큼만 가동한 뒤 중지하려고 합니다.
		 노동법을 준수하기 위해서, 마지막으로 임금을 지급받고(혹은 한번도 임금을 지급받지 않은 상태에서)
		 하루라도 일했던 사람들한테는 공장 가동을 중지할 때 1회 임금 비용만큼의 임금을 더 지급하기로 했습니다.
		 알바생들의 임금 정보를 나타내는 2차원 배열 salaries와 공장을 가동할 일수 days가 매개변수로 주어집니다.
		 모든 알바생들에게 지급할 총 임금(USD)을 return 하도록 solution 함수를 완성해주세요.
		 salaries의 행의 길이는 1 이상 100 이하입니다.
		 salaries의 각 행은 [interval, single] 2개의 정수로 이루어져 있으며, 이는 각 알바생의 임금 지급 간격(일)과 1회
		 임금 비용(USD)을 의미합니다.
		 interval은 1 이상 365 이하입니다.
		 single은 1 이상 1,000 이하입니다.
		 days는 1 이상 3,650 이하입니다.
		 예시
		 salaries										days		result
		 [[2,100],[3,120],[4,180],[7,250]]	6			1150
		 [[2,1],[3,2],[4,3],[5,4]]					1			10
		 [[1,1000],[1,1000]]						3650		7300000
		*/
		int[][] salaries = {{2,100},{3,120},{4,180},{7,250}};
		int days = 6;
		System.out.println(solution(salaries,days));
	}
		public static int solution(int[][] salaries, int days) {
			int answer = 0;
			for (int i = 1; i <= days; i++) {
				for (int[] salary : salaries) {
					if (i % salary[0] == 0)
						answer += salary[1];
					else if (i == days)
						answer += salary[1];
				}
			}
			return answer;
		}
}
