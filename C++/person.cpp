#include<iostream>
using namespace std;

class person
{  protected:  
    int person_id;
    string name;
    int age;
     public:
     	person()
     	{
     		person_id = 0;
     		name = "unknown";
     		age = 1;
		}
		person(int d, string nm, int a)
     	{
     		person_id = d;
     		name = nm;
     		age = a;
		}
		~person() { 
		
		}
		void display()
		{
			cout<<"\n Person id = "<<person_id;
			cout<<"\n Name = "<<name;
			cout<<"\n Age = "<<age;
		}
     
        virtual void talk() = 0;
       // virtual void display_identity() = 0;
  };
  class doctor : public person
  {       
    string  specialization;
    float OPD_charges;
    public:
   	doctor()
   	{
   		specialization = "NA";
   		OPD_charges = 0.0f;
	}
	doctor(int d, string nm, int a, string sp, float opdch) : person( d,  nm,  a)
	{
	    specialization = sp;
   		OPD_charges = opdch;	
	} 
   	~doctor() {
   		
	   }
	   void display()
	   {
	   	   person::display();
	   	   cout<<"\n Specialization = "<<specialization;
	   	   cout<<"\n OPD charges = "<<OPD_charges;
	   }
      
    void talk()
    {
    	cout<<"\n My specialization is "<< specialization << " and charges are "<<OPD_charges;
	}
      
  };
  class teacher : public person
  { 
         string subject;
         float rate_per_hr;
  	  public:
      	 teacher() { 
      	 subject = "NA";
      	 rate_per_hr = 0.0f;
		 }
		teacher(int d, string nm, int a, string sub, float rph):person(d,nm,a) { 
      	 subject = sub;
      	 rate_per_hr = rph;
		   }
	
	void display()
	{
	   	person::display();
	    cout<<"\n Subject = "<<subject;
	   	cout<<"\n Rate = "<<rate_per_hr;
	}   
	void talk()
	{
	    cout<<"\n I am a teacher, I teach "<<subject<< "I charge "<<rate_per_hr <<" per hr ";
	}
  };
  class student : public person
  {        string courseName;
     
     public:
     	student() { courseName = "NA";
		 }
		 
	student(int d, string nm, int a, string cn):person(d,nm,a) 
	{
	  courseName = cn;
	}
      void display()
	  {
	  	person::display();
	  	cout<<"\n Course Name = "<<courseName;
	   } 
       void talk()
       {
	      cout<<"I am a "<< courseName<<" student "<<age<<" old, I enjoy learning new concepts";
       }
  };   


int main()
{
	person *p = new student(12,"Pooja",23,"PGCPAC");
	
	p->talk();
	
	person *p1[3];
	p1[0] = new doctor(12,"Lokesh",54,"Cardiologist",1200.00f);
	p1[1] = new student(10,"Pooja",20,"BE");
	p1[2] = new teacher(11,"Savita",45,"CoreJava",1200.00f);
	for(int i = 0 ;i <3 ; i++)
	    p1[i]->talk();
	return 0;
}
