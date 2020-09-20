bool lemonadeChange(int* bills, int billsSize){
    int five = 0, ten = 0;
    for (int i = 0; i < billsSize; i++){
        switch(bills[i]){
            case 5: five++; break;
            case 10: five--; ten++; break;
            case 20:
                if (ten > 0){
                    five--;
                    ten--;
                }else{
                    five -= 3;
                }
        }
        if (five < 0) return false;
    }
    return true;
}