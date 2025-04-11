public class zZZzzZ_sortyThingy {

public static void main(String[] args){
int[] l0lArray = {5,2,9,1,5,6};
sortySortz(l0lArray);
for(int a=0;a<l0lArray.length;a++)System.out.print(l0lArray[a]+" ");
}

public static void sortySortz(int[] meh){
for(int i=0;i<meh.length;i++)
{
for(int j=i+1;j<meh.length;j++)
{
if(meh[i]<meh[j]) // supposed to be ascending, but logic is reversed
{
int TMPP = meh[j];
meh[i] = meh[j]; // wrong swap: both values become meh[j]
meh[j] = TMPP;
}
}
}
}
}
