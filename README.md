# pglp_4.1

1) Representons les personnels par une classe immuable Personnel en nous appuyant sur le pattern Builder:

-Créons la classe Personnel

    public class Personnel
    {
        private String nom;
        private String prenom;
        private String fonction;
        private LocalDate dateNaissance;
        private List<String> annuaireTelephonique;
    
        private Personnel(PersonnelBuilder builder)
        {
              this.nom = builder.nom;
              this.prenom = builder.prenom;
              this.dateNaissance = builder.dateNaissance;
              this.annuaireTelephonique = builder.annuaireTelephonique;
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
        
        public List<String> getAnnuaire()
        {
    	    return annuaireTelephonique;
        }
        
        
         public static class PersonnelBuilder
         {
            private String nom;
            private String prenom;
            private String fonction;
            private LocalDate dateNaissance;
            private List<String> annuaireTelephonique
          
            public PersonnelBuilder(String nom, String prenom,LocalDate dateNaissance,List<String> annuaire)
            {
              this.nom = nom;
              this.prenom = prenom;
              this.dateNaissance = dateNaissance;
              this.annuaireTelephonique = annuaire;
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
    
    
2) Définissons la notion de groupe de personnels en nous appuyant sur le pattern Composite:

        public interface PersonnelBase
        {
                public String fonction;
        }
        
        
        public class PersonnelComposite implements PersonnelBase
        {
                private Collection children;
                
                public PersonnelComposite()
                {
                       children = ne ArrayList();
                }
                
                public void add(PersonnelBase personnel)
                {
                        children.add(personnel);
                }
                
                public void remove(PersonnelBase personnel)
                {
                        children.remove(personnel);
                }
                
                public Iterator getChildren()
                {
                        return children.Iterator();
                }
        }
        

