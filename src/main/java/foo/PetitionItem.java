package foo;

import java.util.HashSet;

public class PetitionItem {
	public String ID = null;
	public String theme = null;
	public String titre = null;
	public String description = null;
	public String date = null;
	public String proprietaire = null;
    public String nomProprietaire = null;
	public int nbSignataire = 0;
	public int objectifSignataire = 0;
	public HashSet<String> tag = null;
	public String tag_string = null;
	public String img_url = null;
	
	
	public PetitionItem() {}
}
