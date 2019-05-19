t=int(raw_input())
for _ in range(t):
	n=int(raw_input())
	exp=pow(2,n)
	result=0
	while exp:
		result+=exp%10
		exp//=10
		pass
	print result
	pass