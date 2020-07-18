
def find_triplets(l):
	length = len(l)
	triplets_list = []
	l.sort()
	for i in range(0, length-2):
		if((l[i+1] == l[i]+1) and(l[i+2] == l[i]+2)):
			triplets_list.append([l[i], l[i+1], l[i+2]])
	print(triplets_list)

def main():
	#l = [1,2,3,4,12,34,32,21,0,34,6,56,7,34,23,99,66,77,44,33,66,77,98,97]
	l = [1,2,3,4,5,6,7,8,9]
	find_triplets(l)

main()





