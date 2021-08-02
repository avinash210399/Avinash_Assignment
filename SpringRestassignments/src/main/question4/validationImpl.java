package question4;

import javax.naming.NameAlreadyBoundException;

import org.springframework.stereotype.Component;

@Component
public class validationImpl implements validationInteface{

	@Override
	public String check(String name,String num) {
		String result="null";
		if(name.equalsIgnoreCase("American Express"))
		{
			if(num.length()==16)	
			{	
				int n=Integer.parseInt(num.substring(0, 6));
				if((n>=601100 && n<=601109)|| 
					(n>=601120 && n<=601149)||
					(n==601174)||
					(n>=601177 && n<=601179)||
					(n>=601186 && n<=601199)|| 
					(n>=644000 && n<=659999) )
				{
					result="Congratulation..!valid User";
				}
			}
			else result="Invalid Card number";
			
		}
		else if(name.equalsIgnoreCase("enroute"))
		{
			if(num.length()==15)	
			{	
				int n=Integer.parseInt(num.substring(0, 4));
				if((n==2014)||(n==2149))
				{
					result="Congratulation..!valid User";
				}
			}
			else result="Invalid Card number";
		}
		else if(name.equalsIgnoreCase("JCB"))
		{
			if(num.length()>=16 && num.length()<=19)	
			{	
				int n=Integer.parseInt(num.substring(0, 4));
				if(n>=3528 && n<=3598)
				{
					result="Congratulation..!valid User";
				}
			}
			else result="Invalid Card number";
		}
		else if(name.equalsIgnoreCase("Mastercard"))
		{
			if(num.length()==16)	
			{	int n=Integer.parseInt(num.substring(0, 5));
				int n1=(num.charAt(0)-'0');
				
				if(n1==5) {
					if(n>=510000 && n<=559999)result="Congratulation..!valid User";
				}
				if(n1==2) {
					if(n>=222100 && n<=272099)result="Congratulation..!valid User";
				}
			}
			else result="Invalid Card number";
		}
		else if(name.equalsIgnoreCase("visa"))
		{
			if(num.length()==19)
			{
				int n1=(num.charAt(0)-'0');
				if(n1==4)result="Congratulation..!valid User";
			}
			else result="Invalid Card number";
		}
		else
		return "Invalid Entry...!";
	return result;
	}
	

}
