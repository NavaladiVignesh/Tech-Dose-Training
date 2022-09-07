#include<stdio.h>

int Swap(int *a,int *b){
  int temp = *a;
  *a = *b;
  *b = temp;
}

int main(){
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
  }
  for(int i=n-1;i>0;i--){
    for(int j=0;i<n;j++){
      if(arr[j]>arr[j+1]){
        Swap(arr[j],arr[j+1]);
    }
  }
  for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
  }
}
