#include <iostream>
#include <string>
#include <vector> // FIX: Added the vector library
using namespace std;

class Character {
protected:
    string name;
    int health;

public:
    Character() {
        cout << "Default constructor of character.." << endl;
    }

    Character(string n, int h) {
        cout << "Parameterized constructor of character.." << endl;
        this->name = n;
        this->health = h;
    }

    virtual ~Character() {
        cout << "Destructor of character.." << endl;
    }

    // Pure virtual function makes Character an abstract class
    virtual void attack() = 0;

    virtual void displayStats() {
        cout << "--- Character Details ---" << endl;
        cout << "Name: " << name << ", Health: " << health << endl;
    }
};

class Warrior : public Character {
protected:
    int strength;

public:
    Warrior() {
        cout << "Constructor of Warrior" << endl;
    }

    Warrior(string n, int h, int st) : Character(n, h) {
        cout << "Parameterized constructor of Warrior" << endl;
        this->strength = st;
    }

    ~Warrior() {
        cout << "Destructor of Warrior" << endl;
    }

    void attack() override {
        cout << name << " swings a heavy broadsword, dealing " << (strength * 2) << " physical damage!" << endl;
    }

    void displayStats() override {
        Character::displayStats(); 
        cout << "Strength: " << strength << endl;
    }
};

class Mage : public Character {
protected:
    int mana;

public:
    Mage() {
        cout << "Constructor of Mage" << endl;
    }

    Mage(string n, int h, int m) : Character(n, h) {
        cout << "Parameterized constructor of Mage" << endl;
        this->mana = m;
    }

    ~Mage() {
        cout << "Destructor of Mage ...." << endl;
    }

    void attack() override {
        if (mana >= 10) {
            cout << name << " casts a Fireball, dealing massive magical damage!" << endl;
            mana -= 10;
        } else {
            cout << name << " is out of mana and fizzles!" << endl;
        }
    }

    void displayStats() override {
        Character::displayStats(); 
        cout << "Mana: " << mana << endl;
    }
};

int main() {
    cout << "--- Game Start ---" << endl << endl;

    // 1. Create a vector of Character pointers
    vector<Character*> party;

    // 2. Dynamically allocate derived objects and add them to the vector
    party.push_back(new Warrior("Thorin", 150, 20));
    party.push_back(new Mage("Gandalf", 80, 50));
    party.push_back(new Mage("Rincewind", 50, 5));

    cout << "\n--- Battle Begins ---" << endl;

    // 3. Loop through the vector and trigger polymorphic behavior
    for (int i = 0; i < party.size(); i++) {
        party[i]->displayStats();
        party[i]->attack();
        cout << "-------------------------" << endl;
    }

    cout << "\n--- Cleaning up memory ---" << endl;

    // 4. Delete dynamically allocated memory to prevent memory leaks
    for (int i = 0; i < party.size(); i++) {
        delete party[i]; 
    }
    
    party.clear(); 

    return 0;
}