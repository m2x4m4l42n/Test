package test;


public class Test{

  public static int euclid(int a, int b){
    if(b == 0) return a;
    else return euclid(b, a % b);
  }

  public static int modulo(int a, int mod){
    if(mod<=0) return -1;
    if(a<0) return modulo(a+mod,mod);
    if(a<mod) return a;
    else return modulo(a-mod,mod);
  }
}
