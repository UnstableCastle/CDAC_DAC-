#include <iostream>
#include <string>
using namespace std;

class Vehicle{
protected:
string model;
int no_of_days;

public:
Vehicle()
{
cout<<"default constructor ...vehicle "<<endl;
}

Vehicle(string n , int d)
{
cout<<"para constructor ...vehicle "<<endl;
this-> model = n;
this-> no_of_days = d; 
}

virtual ~ Vehicle()
{
cout<<"destructor ... vehicle"<<endl;
}

virtual float CalRent()= 0;

virtual void ShowSpecs(){};

};

class Car : public Vehicle{
protected : 
string fuel_type;
int car_rent;

public:
Car()
{
cout<<"default constructor ... car"<<endl;
}

Car(string f , int r,string n , int d) :Vehicle(n,d)
{
cout<<"para constructor ... car"<<endl;
this->fuel_type = f;
this->car_rent = r;

}
~Car(){
cout<<"destructor ... car"<<endl;
 
}

void ShowSpecs(){
    cout<<"\n";
    cout<<"Vehicle Details"<<endl;
    cout<<"Model       : "<<model;
    cout<<"Fuel Type   : "<<fuel_type;
    cout<<"\n";
}

float CalRent(){
    if(fuel_type == "D"){
        car_rent = 1000 * no_of_days + 500;
        cout<<"diesel car maintenance"<<endl;
      }
    else{
         car_rent = car_rent * no_of_days;
    }
return car_rent;

}

};

class Bike : public Vehicle{
protected:
int cc;
int bike_rent;

public:
Bike()
{
cout<<"default constructor ...bike"<<endl;
}

Bike(int c , int br,string n , int d) :Vehicle(n,d)
{
cout<<"default constructor ...bike"<<endl;
this->cc = c;
this->bike_rent = br;
}

~Bike()
{
cout<<"destructor ...bike"<<endl;
}


void ShowSpecs(){
    cout<<"\n";
    cout<<"Vehicle Details"<<endl;
    cout<<"Model       : "<<model;
    cout<<"CC   : "<<cc;
    cout<<"\n";
}

float CalRent(){
    if(cc <= 250){
        bike_rent = 200 * no_of_days + 100;
        cout<<"higher cc bike "<<endl;
      }
    else{
         bike_rent = bike_rent * no_of_days;
    }
return bike_rent;

}



};



    int main() {
    // Car constructor: Car(FuelType, DailyRent, ModelName, Days)
    // v1: Diesel car (D), base rent 1000, model "Thar", 4 days
    Vehicle* v1 = new Car("D", 1000, "Thar", 4);

    // v2: Petrol car (P), base rent 1200, model "Swift", 3 days
    Vehicle* v2 = new Car("P", 1200, "Swift", 3);

    // Bike constructor: Bike(CC, DailyRent, ModelName, Days)
    // v3: High CC bike (500cc), base rent 300, model "Bullet", 3 days
    Vehicle* v3 = new Bike(500, 300, "Bullet", 3);

    // v4: Standard bike (150cc), base rent 200, model "Pulsar", 3 days
    Vehicle* v4 = new Bike(150, 200, "Pulsar", 3);

    // Display and Calculate
    cout << "\n--- Processing Vehicle 1 ---" << endl;
    v1->ShowSpecs();
    cout << "Total Rent: " << v1->CalRent() << endl;

    cout << "\n--- Processing Vehicle 2 ---" << endl;
    v2->ShowSpecs();
    cout << "Total Rent: " << v2->CalRent() << endl;

    cout << "\n--- Processing Vehicle 3 ---" << endl;
    v3->ShowSpecs();
    cout << "Total Rent: " << v3->CalRent() << endl;

    cout << "\n--- Processing Vehicle 4 ---" << endl;
    v4->ShowSpecs();
    cout << "Total Rent: " << v4->CalRent() << endl;

    // Correct cleanup: each pointer needs its own delete line
    delete v1;
    delete v2;
    delete v3;
    delete v4;

    return 0;
}


// Vehicle * v1 = new Car("CAR1","D",4);

// Vehicle * v2 = new Car("CAR2","F",3);


// Vehicle * v3 = new Bike("CAR2",255,3);

// Vehicle * v4 = new Bike("CAR2",255,3);

// v1->ShowSpecs();
// v1->CalRent();


// v2->ShowSpecs();
// v2->CalRent();

// v3->ShowSpecs();
// v3->CalRent();


// v4->ShowSpecs();
// v4->CalRent();

// delete v1;
// delete v2;
// delete v3;
// delete v4;

