package toss;

public class Toss1 {
	public long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        long answer = 0;
        long tax = 0;
        long vat = 0;
        if(serviceFee == 0) {
        	tax = orderAmount - taxFreeAmount;
        	if(tax == 1) {
        		vat = 0;
        		answer = vat;
        		return answer;
        	}
        	vat = (long) (tax * 0.1);
        }else if(serviceFee != 0 && taxFreeAmount + serviceFee <= orderAmount){
        	orderAmount = orderAmount - serviceFee;
        	tax = orderAmount - taxFreeAmount;
        	if(tax == 1) {
        		vat = 0;
        		answer = vat;
        		return answer;
        	}
        	vat = (long) (tax * 0.1);
        }
        answer = (long) Math.ceil(vat);
        return answer;
    }
}
//orderAmount : 주문금액
// taxFreeAmount : 비과세금액
// serviceFee : 봉사료