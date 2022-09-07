int singleNumber(int* nums, int numsSize){
  int mask = 0;
  for(int i=0;i<numsSize;i++){
    mask ^= i;
    return mask;
  }
}
