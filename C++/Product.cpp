#include<iostream>
using namespace std;

class Product {
	protected:
	 string name;
	 float cost;
	public :
		Product() 
		{ 
		   name="unknown"; cost = 0.0f; 
		}
		Product(string nm, float c) 
		{ 
		   name = nm ; cost = c; 
		}
		virtual float getTotalCost() = 0;   // pure virtual
		virtual void printPackingDetails() = 0;  //pure virtual
    };
    
    class Toy : public Product 
    {
    	float disc;
    	public:
    		Toy() { disc = 0.0f; }
    		Toy(string nm, float c, float d) : Product(nm, c)
    		{
    			disc = d;
			}
			float getTotalCost()
			{
				float d = cost * disc / 100;
			    return cost - d;
			}
			void printPackingDetails()
			{
				cout<<"\n packing is done in a card-board box, which costs nothing";	
			}	
	};

	class Laptop : public Product
	{
		float packcharges;
		float gst;
		public:
			Laptop()
			{
				packcharges = 0.0f;
				gst = 0.0f;
			}
			Laptop(string nm, float c, float pc, float g) : Product(nm, c)
			{
				packcharges = pc;
				gst = g;
			}
			
			float getTotalCost()
			{
				float gs = cost * gst/100;
				return cost + packcharges + gs;
			}
			
			void printPackingDetails()
			{
				cout<<" \n its packing is done with cushioning bubble plastic in a cardboard box";
			}
	};	

int main()                                                                                                                                                                      
{
	//This line should give compile time error like "Cant create object of abstract class" 
	//Product *p =  new Product() ;
	//Every product has different packing mechanism. 
    //My Toy name is "Doll" and its packing is done in a card-board box, which costs nothing, but has some   discount.          
	Product *toyPtr = new Toy("Doll", 250.0f, 15.0f); //15% discount
	cout<<"\n Toy Cost = "<<toyPtr->getTotalCost(); //TotalCost of a toy product is Cost - discount 
	delete toyPtr;

	//My Laptop name is "Dell Laptop" and its packing is done with cushioning bubble plastic in a cardboard box which costs Rs. x
    Product	*laptopPtr = new Laptop("Dell Laptop", 55000.00f, 500, 13.5f);
	cout<<"\n Laptop Cost = "<<laptopPtr->getTotalCost();//TotalCost of a laptop product is Cost + packingCharges + gst
	delete laptopPtr;
	//Print the details of toy/laptop in your own way by calling display functions.
	Toy t1("Car",140.0f, 10.0f);
    Laptop l1("Asus",50000.00f,450,13.5f);
	//t1.display();
      //        l1.display();
        t1.printPackingDetails(); // should print packing details of toy
        l1.printPackingDetails(); // should print packing details of laptop
        return 0;
}

