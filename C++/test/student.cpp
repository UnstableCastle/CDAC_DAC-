#include<iostream>
#include<cstring>
using namespace std;

class student
  {      
    protected:
        int student_id;
        char *name;
        int age;
        float Theory_marks;
    public:

    student()
    {
        student_id = 0;
        name = nullptr;
        age = 0;
        Theory_marks = 0;
        cout<<"Default constructor"<<endl;
    }
    student(int sid, const char *n, int a, float tm)
    {
        student_id=sid;
        name = new char[strlen(n)+1];
        age =a;
        Theory_marks = tm;
        cout<<"Base Parameterized constructor"<<endl;
    }

    virtual ~student()
    {
        delete[] name;
        cout<<"Destructor 1"<<endl;
    }
    virtual void display()
    {
        cout<<"Student id: "<<student_id<<endl;
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
        cout<<"Theory_marks: "<<Theory_marks<<endl;
    }

    virtual void conductExam()=0;
    virtual float calTotal()=0;
    //  constructors - default and parameterized,  destructor,  display, 
    //  conductExam     -  make this function pure virtual function
    //  float calTotal   -  make this function pure virtual function, will return total marks 
  };
   class sportStudent : public student
  { 
    protected:     
    char *sportName; //like Cricket,Basketball,Football,etc.
    int credits;
   public:
    sportStudent()
    {
            sportName = nullptr;
            credits = 0;
            cout<<"Default Constructor"<<endl;
    }
    sportStudent(int Stud_id, const char* n, int a, float tm, const char* sp_name, int cr):student(Stud_id, n,a, tm)
    {
        name = new char[strlen(n)+1];
        strcpy(name,n);
        sportName = new char[strlen(sp_name)+1];
        strcpy(sportName,sp_name);
        credits = cr;
        cout<<"Derived Parameterized constructor"<<endl;
    }
    ~sportStudent()
    {
        delete[] sportName;
        // delete[] name;
        cout<<"Destructor 2"<<endl;
    }
    void display()
    {       
            cout<<"Student id: "<<student_id<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"Age: "<<age<<endl;
            cout<<"Theory_marks: "<<Theory_marks<<endl;
            cout<<"Sport Name: "<<sportName<<endl;
            cout<<"Credits: "<<credits<<endl;
    }
    void conductExam() override
    {
        cout<<"Theory Exam and physical activity needs to be done"<<endl;
    }

    float calTotal() override
        {
            float sum = 0.00f;
            int cr_sum = 0;
            for(int i = 0;i<credits;i++)
            {
                cr_sum +=10;
            }
            sum = Theory_marks + (float)cr_sum;
            return sum;
        }
    //   constructors - default, parameterized,  destructor,  display
    //   override conductExam which displays "Theory Exam and physical activity needs to be done"
    //  override  float calTotal, give 10 marks per credit   
  };

    class ScienceStudent : public student
    {   
        protected:
            char *sp_subject; //like maths, biology, physics, etc.
            float PracticalMarks;
        public:
        ScienceStudent()
        {
            sp_subject = nullptr;
            PracticalMarks = 0.00f;

        }
        ScienceStudent(int Stud_id, const char* n, int a, float tm, const char* sp_sub, float Pr_marks):student(Stud_id, n,a, tm)
        {
            name = new char[strlen(n)+1];
            strcpy(name,n);
            sp_subject = new char[strlen(sp_sub)+1];
            strcpy(sp_subject,sp_sub);
            PracticalMarks = Pr_marks;
            cout<<"Derived Parameterized constructor"<<endl;
        }
        ~ScienceStudent()
        {
            delete[] sp_subject;
            // delete[] name;
            cout<<"Destructor 3";
        }
        void display()
        {   
            cout<<"Student id: "<<student_id<<endl;
            cout<<"Name: "<<name<<endl;
            cout<<"Age: "<<age<<endl;
            cout<<"Theory_marks: "<<Theory_marks<<endl;
            cout<<"Subject Name: "<<sp_subject<<endl;
            cout<<"PracticalMarks: "<<PracticalMarks<<endl;
        }
        void conductExam() override
        {
            cout<<"Theory Exam and Practical exams are need to be conducted"<<endl;
        }
        float calTotal()
        {
            float total= 0.00f;
            total = Theory_marks + PracticalMarks;
            return total;
        }
        // constructors - default, parameterized,  destructor,  display
        // override conductExam which displays "Theory Exam and Practical exams are need to be conducted"
        // override  float calTotal, add PracticalMarks in theory marks   
    };

    int main()
    {
        student* stud = new sportStudent(101,"AAA",22,50,"subject 1",5);
        stud->display();
        stud->conductExam();
        cout<<"Total Calculation: "<<stud->calTotal()<<endl;

        delete stud;


        student* stud1 = new sportStudent(102,"bbb",22,70,"Science",12);
        stud1->display();
        stud1->conductExam();
        cout<<"Total Calculation: "<<stud1->calTotal()<<endl;

        delete stud1;
    }



