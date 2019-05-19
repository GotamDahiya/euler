from math import factorial as fact

t=int(raw_input())
for i in range(t):
	m,n=map(int,raw_input().split())
	result=(fact(m+n)//(fact(n)*fact(m))%1000000007)
	print result