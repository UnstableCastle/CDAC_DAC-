#include <iostream>
#include <string>
using namespace std;

// Base Abstract Class
class Product {
protected:
    string name;
    float base_cost;

public:
    Product() {
        name = "Unknown";
        base_cost = 0.0f;
    }

    Product(string n, float b) {
        this->name = n;
        this->base_cost = b;
    }

    // Fixed typo: virtual
    virtual ~Product() {
        cout << "Destructor for Product" << endl;
    }

    // Pure virtual function makes this class Abstract
    virtual void TotalCost() = 0; 
    virtual void package_details() = 0;

    virtual void get_Product() {
        cout << "\n--- Product Details ---" << endl;
        cout << "Product NAME : " << name << endl;
        cout << "Base Cost    : " << base_cost << endl;
    }
};

class Toy : public Product {
protected:
    float discount;

public:
    Toy(string n, float b, float d) : Product(n, b) {
        this->discount = d;
    }

    ~Toy() {
        cout << "Destructor for Toy" << endl;
    }

    // Implementing pure virtual function
    void TotalCost() override {
        float final_price = base_cost - (base_cost * discount / 100);
        cout << "Total Cost (after " << discount << "% discount): " << final_price << endl;
    }

    void package_details() override {
        get_Product();
        TotalCost();
        cout << "Packaging: Cardboard box (Free)." << endl;
    }
};

class Laptop : public Product {
protected:
    float packaging_charge;
    float gst;

public:
    Laptop(string n, float b, float p, float g) : Product(n, b) {
        this->packaging_charge = p;
        this->gst = g;
    }

    ~Laptop() {
        cout << "Destructor for Laptop" << endl;
    }

    void TotalCost() override {
        float final_price = base_cost + (base_cost * gst / 100) + packaging_charge;
        cout << "Total Cost (GST + Packaging): " << final_price << endl;
    }

    void package_details() override {
        get_Product();
        TotalCost();
        cout << "Packaging: Bubble wrap & Cardboard box (Cost included)." << endl;
    }
};

int main() {
    // Use pointers of base class type to achieve polymorphism
    Product* ptr1 = new Toy("Doll", 250.0f, 15.0f);
    ptr1->package_details();
    delete ptr1; // Calls Toy then Product destructor

    cout << "\n----------------------------\n";

    Product* ptr2 = new Laptop("DELL", 55000.0f, 500.0f, 18.0f);
    ptr2->package_details();
    delete ptr2;

    return 0;
}
