public class student{
    private String name ;
    private String address;
    private String email;
    private int roll;
    private int physics;
    private int chemistry;
    private int biology;
    private int phylab;
    private int chemlab;
    private int biolab;
    public void setdetails(String name , String address , String email ,int roll , int physics , int chemistry , int biology , int phylab , int chemlab , int biolab){
        this.name = name;
        this.address = address;
        this.email = email;
        this.roll = roll;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.phylab = phylab;
        this.chemlab = chemlab;
        this.biolab = biolab;
    }
    public String getname(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public int getroll(){
        return roll;
    }
    public int getPhysics(){
        return physics;
    }
    public int getChemistry(){
        return chemistry;
    }
    public int getBiology(){
        return biology;
    }
    public int getPhylab(){
        return phylab;
    }
    public int getChemlab(){
        return chemlab;
    }
    public int getBiolab(){
        return biolab;
    }
}