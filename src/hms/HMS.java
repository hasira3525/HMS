package hms;

public class HMS {

    public static void main(String[] args) {
       Patient p1= new Patient("22","Naveen","03232");
       Patient p2= new Patient("23","Sandaru","032932");
       Patient p3= new Patient("2","Hasira","030232");

      PatientList plist= new PatientList();
      plist.Insert(p1);
      plist.Insert(p2);
      plist.Insert(p3);
      
      Doctor d1= new Doctor("20","Amaya","09221","Eye",1500);
      Doctor d2= new Doctor("28","Vilanya","00881","Ear",800);
      Doctor d3= new Doctor("21","Osini","03299","Heart",2000);
      
      DoctorsList dlist = new DoctorsList();
      dlist.Insert(d1); 
      dlist.Insert(d2); 
      dlist.Insert(d3);
      
     dlist.AllDoctorInfo(null);
        System.out.println(dlist.searchByID("20").getName()+"    "+dlist.searchByID("21").getFees());
     
        CheckUpList cu1 = new CheckUpList();
        Checkup c1 = new Checkup(d1,p1,3,"A","55");
        Checkup c2 = new Checkup(d1,p1,3,"B","58");
        Checkup c3 = new Checkup(d1,p1,3,"C","60");
        Checkup c4 = new Checkup(d1,p1,3,"D","52");
        Checkup c5 = new Checkup(d1,p1,3,"E","50");
        cu1.Enqueue(c1);
        cu1.Enqueue(c2);
        cu1.Enqueue(c3);
        cu1.Enqueue(c4);
        cu1.Enqueue(c5);
        cu1.Print();
        
        //System.out.println(plist.searchById("22").getcContact());

      //System.out.println(plist.searchByContact("03232").getName());
       }
    }
    
    
    
    

