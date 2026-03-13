#include <iostream>
#include <cstring> // Required for strlen and strcpy

using namespace std;

// class student {
// protected:  // data members
//     int student_id; // Added missing semicolon
//     char* name;
//     int age;
//     float theory_marks;

// public:
//     student() { // Default constructor
//         cout << "default constructor " << endl; // Fixed <<<
//         student_id = 0; // Changed 'id' to 'student_id'
//         name = nullptr;
//         age = 0;
//         theory_marks = 0.0f;
//     }

//     // Changed to 'const char*' to safely accept string literals like "Alice"
//     student(const char* c, int id, int a, float f) {  
//         cout << "parameterized constructor " << endl;
//         student_id = id;
//         age = a;
//         theory_marks = f;
//         name = new char[strlen(c) + 1]; // Allocate memory for the string
//         strcpy(name, c);
//     }

//     student(const student &s) { // Copy constructor
//         cout << "copy const" << endl;
//         student_id = s.student_id;
//         age = s.age;
//         theory_marks = s.theory_marks;
        
//         // Removed unsafe 'delete name'. In a copy constructor, 'name' is uninitialized.
//         name = new char[strlen(s.name) + 1];
//         strcpy(name, s.name);
//     }

//     virtual ~student() { // Fixed typo "virtaul"
//         cout << "destructor student..." << endl;
//         delete[] name; // Prevent memory leak
//     }

//     virtual void conductExam() = 0; // pure virtual 
//     virtual float calTotal() = 0;   // pure virtual 
//     virtual void display() = 0;     // Added pure virtual display to allow polymorphic calls from main

//     void display_student() { 
//         cout << "Student details : " << endl;
//         cout << "Student ID   : " << student_id << endl;
//         cout << "Name         : " << (name ? name : "None") << endl;
//         cout << "AGE          : " << age << endl;
//         cout << "Theory Marks : " << theory_marks << endl;
//     }
// };

// class SportsStudents : public student {
// protected:
//     char *Sport;
//     int credits;

// public:
//     SportsStudents() {
//         Sport = nullptr;
//         credits = 0;
//         cout << "const for sports" << endl;
//     }

//     SportsStudents(const char* c, int id, int a, float f, const char* s, int credits) : student(c, id, a, f) {
//         cout << "para constructor...Sports " << endl;
//         Sport = new char[strlen(s) + 1]; // Added missing '='
//         strcpy(Sport, s);                // Added missing semicolon
//         this->credits = credits;         // Fixed shadowed variable logic
//     }

//     ~SportsStudents() {
//         cout << "destructor sports..." << endl;
//         delete[] Sport; // Prevent memory leak
//     }

//     void conductExam() override {
//         cout << "Marks =  :  " << endl;
//     }

//     float calTotal() override {
//         return theory_marks + (credits * 0.1f);
//     }

//     void display() override {
//         display_student();
//         cout << "Sports   : " << (Sport ? Sport : "None") << endl;
//         cout << "Credits  : " << credits << endl; // Show actual credits, not calTotal()
//     }
// };

// class Sciencestudent : public student {
// protected:
//     char* subject;
//     float practical_marks;

// public:
//     Sciencestudent() {
//         cout << "default constructor " << endl; // Added missing semicolon
//         subject = nullptr;
//         practical_marks = 0.0f;
//     }

//     // Fixed extra comma in the initializer list: student(n, id, a, f)
//     Sciencestudent(const char* n, int id, int a, float f, const char* sub, float p) : student(n, id, a, f) {
//         cout << "para constructor...Science " << endl;
//         subject = new char[strlen(sub) + 1];
//         strcpy(subject, sub);
//         practical_marks = p; // Fixed typo "PracticalMarks"
//     }

//     ~Sciencestudent() {
//         cout << "destructor...Science " << endl;
//         delete[] subject; // Prevent memory leak
//     }

//     void conductExam() override {
//         cout << "exam " << endl;
//     }

//     float calTotal() override {
//         return theory_marks + practical_marks;
//     }

//     void display() override {
//         display_student();
//         cout << "Subject : " << (subject ? subject : "None") << endl;
//         cout << "Practical marks : " << practical_marks << endl; // Fixed typo
//     }
// };

// int main() {
//     // FIX: You cannot instantiate an array of abstract classes. 
//     // You must use an array of base class pointers.
//     student* list[2];

//     // Corrected class names and passed the correct number of arguments (included ID)
//     list[0] = new SportsStudents("Alice", 101, 20, 75.0, "Cricket", 2);
//     list[1] = new Sciencestudent("Bob", 102, 21, 80.0, "Chemistry", 15.5);

//     for(int i = 0; i < 2; i++) {
//         list[i]->display(); // Use pointer arrow '->'
//         cout << "Total Marks: " << list[i]->calTotal() << endl;
//         cout << "------------------------------------" << endl;
//     }

//     // Clean up memory
//     for(int i = 0; i < 2; i++) {
//         delete list[i]; 
//     }
    
//     return 0;
// }



// #include<iostream>





// }