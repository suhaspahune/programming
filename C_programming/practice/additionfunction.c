# include <stdio.h>

int Addition (int iNo1 , int iNo2)
{
    int Result = 0;
    Result = iNo1 + iNo2 ;
    return Result ;
    
}
int main ()
{
    int i = 0, j = 0 ,Ans = 0 ;
    printf("Enter first number :\n");
    scanf("%d", &i);

    printf("Enter second number :\n");
    scanf("%d", &j);

    Ans = Addition(i,j);

    printf("Additon is %d \n", Ans);

    return 0;
}