#include <iostream>


bool palindrom(int num){
    std::string val = std::to_string(num);
    int size = val.length();
    bool pali = true;
    
    for(int i = 0; i < size/2; i ++){
        if(val[i] != val[size-i-1]){
            pali = false;
        }
    }
    return(pali);
}


int main(){
    
    int temp = 0;
    int num1 = 999;
    int num2 = 999;
    int sol = 0;

    while(99 < num1){
        num2 = num1;
        while(99 < num2){
            temp = num1 * num2;
            //check palindromic prop
            if(palindrom(temp) && (sol < temp)){
                sol = temp;
            }
            num2 = num2 - 1;
        }
        num1 = num1 - 1;
    }
    std::cout<< "Solution: " << sol <<"\n"; 
    return(0);
}

