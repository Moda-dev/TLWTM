#include<stdlib.h>
#include<stdio.h>
int a,c;float d;
int main(){
float b[5];b[0]=1.1;b[1]=2.2;b[2]=3.3;b[3]=4.4;b[4]=5.5;
for(a=0;a<5;a++){if(a!=0) printf(", ");printf("%g",b[a]);}printf("\n");
for(d=0.0,c=0;c<5;c++) d+=b[c];d/=5;printf("%g\n",d);
return 0;}
