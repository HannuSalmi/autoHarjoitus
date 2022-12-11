
public class Auto {
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public void jarruta()
	{
		System.out.println("auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		System.out.println("auto kiihdyttää");
		bensanMaara--;
	}
	public void naytaTiedot()
	{
		System.out.println(malli + merkki + bensanMaara);
	}
}
