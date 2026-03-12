#include <iostream>
#include <cstring>
using namespace std;

// Abstract Base Class
class Animal {
protected:
    char name[50];
    int age;

public:
    Animal(const char* n, int a) {
        strcpy(name, n);
        age = a;
    }

    // Pure virtual function
    virtual void talk() = 0;

    char* getName() {
        return name;
    }

    virtual ~Animal() {}
};

// Dog class
class Dog : public Animal {
public:
    Dog(const char* n, int a) : Animal(n, a) {}

    void talk() {
        cout << "Dog " << name << " says: Bark Bark!" << endl;
    }
};

// Cat class
class Cat : public Animal {
public:
    Cat(const char* n, int a) : Animal(n, a) {}

    void talk() {
        cout << "Cat " << name << " says: Meow Meow!" << endl;
    }

    bool operator==(Dog &d) {
        return name == d.getName();
    }

   bool operator==(Cat &other) {
        return strcmp(this->name, other.name) == 0;
    }
};

int main()
{
    Animal *dogPtr = new Dog("Boss", 15);
    dogPtr->talk();
    delete dogPtr;

    Cat c1("Puppy", 3);
    Cat c2("Sweety", 4);
    Dog d1("tom", 5);

    if(c1 == d1)
        cout<<"Both are same!"<<endl;
    else
        cout<<"Both are different!"<<endl;

    c1.talk();

    return 0;
}
