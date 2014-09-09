__author__ = 'jalatif'

hn = {-3 :  0,
      -2 :  1,
      -1 :  1,
       0 : -2,
       1 : -2,
       2 :  1,
       3 :  1,
       4 :  0,
     }
#{ (some_key if condition else default_key):(something_if_true if condition else something_if_false) for key, value in dict_.items() }

xn = {i:(1 if i>=4 else 0) for i in range(-100,100,1)}

xn = {i:(1 if i%2==0 else -1) for i in range(0,100,1)}

hn = {i:0.5**i for i in range(0,100,1)}
xn = {i:0.33**i for i in range(0, 10, 1)}

yn={i:0 for i in range(-100, 100, 1)}
for i in range(-100,100,1):
    for k in range(-100,100,1):
        if k not in xn.keys():
            xn[k]=0
        if (i-k) not in hn.keys():
            hn[i-k]=0
        yn[i]+=xn[k]*hn[i-k]

sum=0
for i in range(-100, 100, 1):
    sum+=yn[i]
    if yn[i]!=0:
        print i,":",yn[i],"\n"

print sum
