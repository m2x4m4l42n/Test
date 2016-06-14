package test;


public class Test{

  public static int euclid(m, n){
    if(n % m == 0) return m;
    else return euclid(n % m, m);
  }
}
