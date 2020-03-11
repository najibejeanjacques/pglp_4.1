# pglp_4.1

1) Representons les personnels par une classe immuable Personnel en nous appuyant sur le pattern Builder:

-Créons la classe Personnel

    public class Personnel
    {
        private String nom;
        private String prenom;
        private String fonction;
        private LocalDate dateNaissance;
        //private List<String> annuaireTelephonique;
    
        private Personnel(PersonnelBuilder builder)
        {
              this.nom = builder.nom;
              this.prenom = builder.prenom;
              this.dateNaissance = builder.dateNaissance;
              //this.annuaireTelephonique = builder.annuaireTelephonique;
        }
        
        public String getNom()
        {
            return nom;
        }
        
        public String getPrenom()
        {
            return prenom;
        }
        
        public LocalDate getDAteNAissance()
        {
            return dateNaissance;
        }
        
        /***
        public List<String> getAnnuaire()
        {
    	    return annuaireTelephonique;
        }
        ***/
        
         public static class PersonnelBuilder
         {
            private String nom;
            private String prenom;
            private String fonction;
            private LocalDate dateNaissance;
            //private List<String> annuaireTelephonique
          
            public PersonnelBuilder(String nom, String prenom,LocalDate dateNaissance)
            {
              this.nom = nom;
              this.prenom = prenom;
              this.dateNaissance = dateNaissance;
              //this.annuaireTelephonique = annuaire;
            }
          
            public PersonnelBuilder fonction(String fonction)
            {
              this.fonction = fonction;
              return this;
            }
          
            public PersonnelBuilder build()
            {
              return new Personnel(this);
            }
      
        }
    
    }
    
    
2) Définissons la notion de groupe de personnels (Annuaire de personnes) en nous appuyant sur le pattern Composite:

           public interface Annuaire
           {
                public void printAnnuaireName();
           }
           
           
           public class PersonnelAnnuaire implements Annuaire 
           {

	            private String nameAnnuaire;
	            private List<Personnel> listPersonnels = new ArrayList<Personnel>();
	
	            @Override
	            public void printAnnuaireName() 
                {
		            // TODO Auto-generated method stub
		            System.out.println("Annuaire de "+nameAnnuaire);
	            }
	
	            public PersonnelAnnuaire(String nom)
	            {
		            this.nameAnnuaire = nom;
	            }
	
	            public void addPersonnel(Personnel personnel)
	            {
		            listPersonnels.add(personnel);
	            }
	
	            public void removePersonnel(Personnel personnel)
	            {
		            listPersonnels.remove(personnel);
	            }
	
	            public void getPersonnel()
	            {
		
	            }
		
        }
        
3) Implementons deux types d'affichage en définissant deux stratégies de parcours de la structure:

            public Iterator<Personnel> getPersonnelIterator()
	        {
	            while(this.listPersonnels.iterator().hasNext())
		        {
			        System.out.println("Nom: "+this.listPersonnels.iterator().toString());
		        }
		
		        return this.listPersonnels.iterator();
	        }
	
	        public List<Personnel> getPersonnelIterable()
	        {
		        return this.listPersonnels;
	        }

