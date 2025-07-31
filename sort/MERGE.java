public class MERGE {
  int[] a;
  MERGE(int[] a){
    this.a=a;
    mergesort(0,a.length-1);
  }
  public void mergesort(int low,int high){
       if(low==high) return;
       int mid=(low+high)/2;
       mergesort(low, mid);
       mergesort(mid+1, high);
      merge(low,mid,high);

       

  }
  public void merge(int low,int mid,int high){
    int i=low,j=mid+1,k=0;
    int[] b=new int[high-low+1];
    while(i<=mid && j<=high){
      if(a[i]<=a[j])b[k++]=a[i++];
      else b[k++]=a[j++];
    }
    while(i<=mid)b[k++]=a[i++];
    while(j<=high)b[k++]=a[j++];
    k=0;
    for(i=low;i<=high;i++){
        a[i]=b[k++];
    }
  }
  
  
}
