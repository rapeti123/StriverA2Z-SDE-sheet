class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {  
        Long [] arr=new Long[2];
        Long gcd=findGcd(A,B);
        Long lcm=(A*B)/gcd;   
        arr[0]=lcm;
        arr[1]=gcd;
        return arr;
    } 
    static Long findGcd(Long a,Long b){ 
        if(b==0) 
           return a;
        return findGcd(b,a%b);
    }
};
