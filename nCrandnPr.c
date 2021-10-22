#include<stdio.h>
int factorial(int n);
int nPr(int n, int r);
int nCr(int n, int r);
void main()
{
    int n,r;
    printf("enter the valu of n and r\n");
    scanf("%d %d",&n,&r);
    int p=nPr(n,r);
    int c=nCr(n,r);
    printf("nPr=%d\nnCr=%d",p,c);
}
int factorial(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    else
    {
        return n*factorial(n-1);
    }
    
}
int nPr(int n, int r)
{
    return factorial(n)/factorial(n-r);
}
int nCr(int n, int r)
{
    return nPr(n,r)/factorial(r);
}