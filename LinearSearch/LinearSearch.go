package main

import "fmt"

func main(){
	fmt.Println("Linear Search in Go")
	myArr := []int{1,2,3,4,5}
	index := linearSearch(myArr, 4)
	fmt.Println(index)
}

func linearSearch(arr []int, target int) int {

	for i := range len(arr) {
		if arr[i] == target {
			return i
		}
	}

	return -1
}
