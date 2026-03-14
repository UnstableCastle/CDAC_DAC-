#include <iostream>
#include <string>
using namespace std;

class Emp {
    protected:
        string ename;
        float sal;
        int eno;

    public:
        Emp() {
            cout<<"\n emp default \n";
            this->ename = "na";
            this->eno = 0;
            this->sal = 00.0f; 
        }

        Emp(string e, int n, int s) {
            cout<<" \n emp para constructor"<<endl;
            ename = e;
            eno = n;
            sal = s;
            cout<<"\nEmployee Name: "<<ename;
            cout<<"\nEmployee No. : "<<eno;
            cout<<"\nEmployee Salary : "<<sal;
        } 

        virtual ~Emp() {
            cout<<"\nEmp destructor";
        }

        virtual float cal_sal() = 0;
};

class Manager : public Emp {
    protected:
        float allowance;

    public:
        Manager() {
            cout<<"\nManager default constructor";
            this->allowance = 0.00f;
        }

        Manager(string e, int n, int s, int a) : Emp(e,n,s) {
            cout<<"\nManager para constructor";
            allowance = a;
        }

        ~Manager() {
             cout<<"\nManager destructor";
        }
};

class Admin : public Emp {
    public:
        Admin() {
            cout<<"\nAdmin default constructor";
        }

        Admin(string e, int n, int s) : Emp(e,n,s) {
            cout<<"\nAdmin para constructor";
        }

        ~Admin() {
            cout<<"\nAdmin destructor";
        }
};

class Office : public Admin {
    protected: 
        int addallowance = 0;

    public: 
        Office() {
            cout<<"\noffice default constructor";
            this->addallowance = 0;
        }

        Office(string e, int n, int s, int a) : Admin(e,n,s) {
            cout<<"\nOffice para constructor";
            addallowance = a;
        }

        ~Office() {
            cout<<"\noffice destructor";
        }

        float cal_sal() override {
            float basesal;
            basesal = sal + addallowance;
            return basesal;
        }
};

class Lab : public Admin {
    protected:
        int incentive;
        int hours;

    public:
        Lab() {
            cout<<"\nLab default constructor";
            incentive = 0;
            hours = 0;
        }

        Lab(string e, int n, int s, int i, int h) : Admin(e,n,s) {
            cout<<"\nLab para constructor";
            incentive = i;
            hours = h;
        }

        ~Lab() {
            cout<<"\nLab destructor";
        }

        float cal_sal() override {
            float LabSal;
            LabSal = sal + incentive * hours;
            return LabSal;
        }
};

class HR : public Manager {
    protected:
        float target;

    public:
        HR() {
            cout<<"\nHR default constructor";
            target = 0;
        }

        HR(string e, int n, int s, int a, int t) : Manager(e,n,s,a) {
            cout<<"\nHR para constructor";
            target = t;
        }

        ~HR() {
            cout<<"\nHR destructor";
        }

        float cal_sal() override {
            float hrSal;
            hrSal = sal + allowance + ((float)15/100 * target);
            return hrSal;
        }
};

class Accounts : public Manager {
    protected:
        int overTime;

    public:
        Accounts() {
            cout<<"\nAccounts default constructor";
            overTime = 0;
        }

        Accounts(string e, int n, int s, int a, int o) : Manager(e,n,s,a) {
            cout<<"\nAccounts para constructor";
            overTime = o;
        }

        ~Accounts() {
            cout<<"\nAccounts destructor";
        }

        float cal_sal() override {
            float acSal;
            acSal = sal + allowance + overTime * 1500;
            return acSal; 
        }
};

class Clerk : public Emp {
    public:
        Clerk() {
            cout<<"\nClerk default constructor";
        }

        Clerk(string e, int n, int s) : Emp(e,n,s) {
            cout<<"\nClerk para constructor";
        }

        ~Clerk() {
            cout<<"\nClerk destructor";
        }

        float cal_sal() override {
            return sal;
        }
};

class Security : public Emp {
    public:
        Security() {
            cout<<"\nSecurity default constructor";
        }

        Security(string e, int n, int s) : Emp(e,n,s) {
            cout<<"\nSecurity para constructor";
        }

        ~Security() {
            cout<<"\nSecurity destructor";
        }

        float cal_sal() override {
            return sal;
        }
};

int main() {
    Emp *e = new HR("ABC",1,25000,1500,5000);
    cout<<"\nHR Salary: "<<e->cal_sal();
    delete e;
    cout<<"\n--------------------------------------";

    Emp *e1 = new Office("XYZ",2,28000,2000);
    cout<<"\nOffice Salary: "<<e1->cal_sal();
    delete e1;
    cout<<"\n--------------------------------------";

    Emp *e2 = new Accounts("PQR",3,17200,2000,5);
    cout<<"\nAccounts Salary: "<<e2->cal_sal();
    delete e2;
    cout<<"\n--------------------------------------";

    Emp *e3 = new Lab("AXW",4,55000,500,5);
    cout<<"\nLab Salary: "<<e3->cal_sal();
    delete e3;
    cout<<"\n--------------------------------------";

    Emp *e4 = new Clerk("SQL",5,96000);
    cout<<"\nClerk Salary: "<<e4->cal_sal();
    delete e4;
    cout<<"\n--------------------------------------";

    Emp *e5 = new Security("MLO",6,52000);
    cout<<"\nSecurity Salary: "<<e5->cal_sal();
    delete e5;
    
    cout << "\n";
    return 0;
}