#include <iostream>
using namespace std;
class ABC
{
    private:
    	static int ref;
        static ABC* self;
        ABC()
        {
        	cout<<"\n constructor.."<<endl;
        }

    public:
~ABC{
        cout<<"des";
    }
        static ABC* getInstance();
        static int getref();

    };
int ABC::getref()
{
	return ref;
}

ABC* ABC::getInstance()
{
    if (self == 0)
    {
      //  ref=1;
		self = new ABC();
    }
    ref=ref+1;
    return self;
}


ABC* ABC::self;
int ABC::ref=0;
int main()
{
    //ABC obj;
    ABC* ptr = ABC::getInstance();
    ABC* sptr = ABC::getInstance();
    ABC* pptr = ABC::getInstance();
    ABC* ppptr = ABC::getInstance();
     
    std::cout << ptr << std::endl;
    std::cout << sptr << std::endl;
    std::cout << ABC::getref();
}


//

