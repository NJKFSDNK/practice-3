package word2_2;

public class Word2_2 {
	public static void main(String[] args) {
		String a = "6516489";
		String b ="";
		int j=a.length();
		
		for(int i = 0; i<a.length(); i++) {
			if(a.length()>12) {
				break;
			}
			switch (a.charAt(i)) {
			case '1':
				b=b+"壹";
				break;
			case '2':
				b=b+"贰";
				break;
			case '3':
				b=b+"叁";
				break;
			case '4':
				b=b+"肆";
				break;
			case '5':
				b=b+"伍";
				break;
			case '6':
				b=b+"陆";
				break;
			case '7':
				b=b+"柒";
				break;
			case '8':
				b=b+"捌";
				break;
			case '9':
				b=b+"玖";
				break;

			default:
				break;
			}
			switch (j) {
			case 1:
				b=b+"元";
				break;
			case 2:
				b=b+"拾";
				break;
			case 3:
				b=b+"仟";
				break;
			case 4:
				b=b+"万";
				break;
			case 5:
				b=b+"拾万";
				break;
			case 6:
				b=b+"佰万";
				break;
			case 7:
				b=b+"仟万";
				break;
			case 8:
				b=b+"亿";
				break;
			case 9:
				b=b+"拾亿";
				break;
			case 10:
				b=b+"佰亿";
				break;
			case 11:
				b=b+"仟亿";
				break;
			case 12:
				b=b+"万亿";
				break;

			default:
				break;
			}
			j--;
		}
		System.out.println(b);
		
	}

}
