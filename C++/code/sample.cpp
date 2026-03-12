#include <iostream>
#include <string>
using namespace std;

// First, we define the Hospital class so it can be contained inside Doctor
class Hospital {
private:
    string hospName;
    string city;

public:
    // No-args constructor
    Hospital() {
        hospName = "Unassigned";
        city = "Unassigned";
    }

    // Parameterized constructor
    Hospital(string name, string c) {
        hospName = name;
        city = c;
    }

    void accept() {
        cout << "Enter Hospital Name: ";
        cin >> hospName;
        cout << "Enter Hospital City: ";
        cin >> city;
    }

    void display() const {
        cout << "Hospital Name: " << hospName << " | City: " << city << endl;
    }
};

// Now, we define the Doctor class containing the Hospital object
class Doctor {
private:
    int docId;
    float fees[3];
    float avgFees;
    Hospital hospitalObj; // This is the contained object (Composition)

public:
    // No-args constructor
    Doctor() {
        docId = 0;
        avgFees = 0.0;
        for (int i = 0; i < 3; i++) {
            fees[i] = 0.0;
        }
        // hospitalObj's default constructor is called automatically here
    }

    // Parameterized constructor
    // Notice the initializer list: ': hospitalObj(hName, hCity)' 
    // This is how we pass arguments to the contained object's constructor
    Doctor(int id, float f[], string hName, string hCity) : hospitalObj(hName, hCity) {
        docId = id;
        for (int i = 0; i < 3; i++) {
            fees[i] = f[i];
        }
        calculateAvg(); // Calculate average automatically upon creation
    }

    // Function to calculate the average fees
    void calculateAvg() {
        float sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += fees[i];
        }
        avgFees = sum / 3.0;
    }

    void accept() {
        cout << "\n--- Enter Doctor Details ---" << endl;
        cout << "Enter Doctor ID: ";
        cin >> docId;

        for (int i = 0; i < 3; i++) {
            cout << "Enter Fee " << i + 1 << ": ";
            cin >> fees[i];
        }

        // Call the accept method of the contained Hospital object
        hospitalObj.accept(); 
        
        // Calculate the average after getting the new fees
        calculateAvg();
    }

    void display() {
        cout << "\n--- Doctor Information ---" << endl;
        cout << "Doctor ID: " << docId << endl;
        cout << "Fees structure: [ ";
        for (int i = 0; i < 3; i++) {
            cout << fees[i] << " ";
        }
        cout << "]" << endl;
        cout << "Average Fees: " << avgFees << endl;
        
        // Call the display method of the contained Hospital object
        hospitalObj.display(); 
    }
};

int main() {
    // 1. Testing the No-Args Constructor & Accept Method
    cout << "Creating Doctor 1 (Using default constructor & accept method):";
    Doctor d1;
    d1.accept();
    d1.display();

    // 2. Testing the Parameterized Constructor
    cout << "\nCreating Doctor 2 (Using parameterized constructor):" << endl;
    float myFees[3] = {500.0, 600.0, 550.0};
    Doctor d2(101, myFees, "City Care Hospital", "Pune");
    d2.display();

    return 0;
}