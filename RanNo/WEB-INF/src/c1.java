import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Random;

public class c1 extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException
	{
		Random ran = new Random();
		Boolean flag = new Boolean("false");
		PrintWriter out = res.getWriter();
		int x = ran.nextInt(10);
		String[] paramvalues=req.getParameterValues("game");
		String chk = String.valueOf(x);
	//or...	String chk = Integer.toString(x);
		for(int i=0; i<paramvalues.length; i++)
		{
			if(paramvalues[i].equals(chk) && flag==false)
			{
				out.println("Congratulations! " + chk + " was the number this time");
				flag=true;
			}
		}
		if(flag==false){
			out.println("Lottery number was: "+ chk +" Better Luck Next time!");
		}
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException
	{
			doGet(req, res);
	}
}
