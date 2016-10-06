#include <iostream>
#include <exception>

using namespace std;

void swap(char *arr, int i, int j);
void reverse(char* arr, int start, int end);
void rotatestr(char* arr, int length, int rotLength)
        throw();

int main()
{
 char str[] = "abcd";
 
 int rotLength = 2;
 cout << "The orig string was " << str << endl;
 
 try
 { 
  rotatestr(str,strlen(str),2);
  cout << "The rotated string is " << str << endl;
 }
 catch(exception& e)
 {
  cout << "exception!" << endl;
 }

 return 0;
}

void rotatestr(char* arr, int length, int rotLength)
        throw() //Use a generic exception.
{
     if(!arr || rotLength > length)
     {
        throw exception();
     }

     //reverse the first part till rot length.
     reverse(arr,0,rotLength-1);
     reverse(arr,rotLength,length-1);
     reverse(arr,0,length-1);
}


void reverse(char* arr, int start, int end)
{
 while(end>start)
 {
    swap(arr,start++,end--);
 }

}

void swap(char *arr, int i, int j)
{
  arr[i] = arr[i] ^ arr[j]; 
  arr[j] = arr[i] ^ arr[j];
  arr[i] = arr[j] ^ arr[i];
}
