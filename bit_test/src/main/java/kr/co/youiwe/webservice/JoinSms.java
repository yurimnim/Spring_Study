package kr.co.youiwe.webservice;

public class JoinSms {
	
	public static String sendMsg(String to, String from, String msg) {
//		BufferedReader in;
//	    in = new BufferedReader(new InputStreamReader(System.in));
	    
		String send ="";
		String smsID= "rola";	
		String smsPW="bit123400";
		//010 9687 3487
		//010 9062 3445
			
		ServiceSMSSoapProxy sendsms = new ServiceSMSSoapProxy();
		try{
			String senderPhone= "01096873487";
			String receivePhone= to;
			String smsContent= msg;
			String test1 = (smsID+smsPW+receivePhone);
			CEncrypt encrypt = new CEncrypt("MD5",test1);
			send=sendsms.sendSMS(smsID,encrypt.getEncryptData(), senderPhone, receivePhone, smsContent);
	 		System.out.println("결과코드:"+send);
		}catch(Exception e){
			System.out.println("Exception in main:" +e);
		}
		
		return send;
	}

}
