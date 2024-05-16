class Solution {
    public int romanToInt(String s) {
        char Arr[]=s.toCharArray();
        int len=s.length();
        int a=s.length();
        int i=0;
        int I=0,V=0,X=0,L=0,C=0,D=0,M=0;
        while(len>0){
            if(Arr[i]=='I'){
                if(i+1<a){
                    if(Arr[i+1]=='V'){
                        V=V+4;
                        i++;
                        len--;
                    }
                    else if(Arr[i+1]=='X'){
                        X=X+9;
                        i++;
                        len--;
                    }
                    else{
                        I=I+1;
                    }
                }
                else{
                    I=I+1;
                }
                
            }
            else if(Arr[i]=='V'){
                V=V+5;
            }
            else if(Arr[i]=='X'){
                if(i+1<a){
                    if(Arr[i+1]=='L'){
                        L=L+40;
                        i++;
                        len--;
                    }
                    else if(Arr[i+1]=='C'){
                        C=C+90;
                        i++;
                        len--;
                    }
                    else{
                        X=X+10;
                    }
                }
                else{
                    X=X+10;
                }
            }
            else if(Arr[i]=='L'){
                L=L+50;
            }
            else if(Arr[i]=='C'){
                if(i+1<a){
                    if(Arr[i+1]=='D'){
                        L=L+400;
                        i++;
                        len--;
                    }
                    else if(Arr[i+1]=='M'){
                        C=C+900;   
                        i++;
                        len--;
                    }
                    else{
                        C=C+100;
                    }
                }
                else{
                    C=C+100;
                }
            }
            else if(Arr[i]=='D'){
                L=L+500;
            }
            else if(Arr[i]=='M'){
                L=L+1000;
            }
            len--;
            i++;
        }
        return I+V+X+L+C+D+M;
    }
}
