/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruben
 */
public class Funcs {
    public String fibonacci(int steps){
        String text = "";
        for(int n = 1, npre = 0, i = 0; i < steps;i++){
            text += npre+" ";
            int aux = npre;
            npre = n;
            n += aux;
        }
        return text;
    }
    
    public String factorial(int n){
        if(n == 0)return 1+"";
        int res = n;
        while(--n > 0){
            res *=n;
        }
        return res+"";
    }
    public String mypow(int base, int exp){
        if(exp == 0)return 1+"";
        int res = base;
        while(--exp > 0){
            res*=base;
        }
        return res+"";
    }
    public long rfactorial(long n){
        if(n == 0)return 1;
        else return n * rfactorial(n-1);
    }
    public String rfibonacci(long n){
        return rfib(n,0,1);
    }
    public String rfib(long steps, long n, long nn){
        String res = "";
        n = n != 0? n : 0;
        nn = nn != 1? nn : 1;
        if(steps-- > 0){
            res = n + " ";
            res += rfib(steps,nn,nn+n);
        }
        return res;
    }
    public long rpow(long base, long exponente){
        if(exponente < 1)return 1;
        return base *= rpow(base, --exponente);
    }
    
}
