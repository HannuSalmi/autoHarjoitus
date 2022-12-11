
public class Auto {
	public String merkki;
	public String malli;
	public int bensanMaara;
	public int tankkausMaara;
	
	public void jarruta()
	{
		System.out.println("auto jarruttaa");
	}
	
	public void kiihdyta()
	{
		if (bensanMaara > 0)
		{
		System.out.println("auto kiihdyttää");
		bensanMaara--;
		}
	}
	public void naytaTiedot()
	{
		System.out.println(malli+ " " +  merkki + " " + bensanMaara);
	}
	public void tankkaa()
	{
		System.out.println("tankissa bensaa " + bensanMaara);
		bensanMaara = bensanMaara + tankkausMaara;
		System.out.println("tankkauksen jälkeen " + bensanMaara);
	}
}
