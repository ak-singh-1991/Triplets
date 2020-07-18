
def count_stairs(n, ways, index):
	if(n < 0):
		pass
	elif(n == 0):
		print_ways(ways, index)
	else:
		if(n >= 1):
			ways[index] = 1
			index += 1
			count_stairs((n-1), ways, index)
			index -= 1
			if(n >= 2):
				ways[index] = 2
				index += 1
				count_stairs((n-2), ways, index)


def print_ways(ways, index):
	print(ways[0:index])


def main():
	n = input("Enter top stair number:")
	ways = [0]*n
	count_stairs(n, ways, 0)

main()