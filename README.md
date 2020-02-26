# CodeCraft
Welcome to CodeCraft, a discussion board about Computer Science for Lei and Yoon-G.

Although one of them is chasing warm sunshine, and the other one is embracing freezing winters, they both believe that learning & practice makes life better.

---Lei
___________________________________
2020-2-21
* Discussed the problem of finding the minimum length of subarray s.t. the summation of all the elements in the subarray is no less than a given s.

---Lei

-----------------------------------
2020-2-22
* Discussed the combination problem
* Lei committed the solution for some Leetcode problems, but not those problems Yoon-G had assigned
* Yoon-G introduced the trie concept and word break problem

---Lei

p.s. Yoon-G, try making some footprints here.

-----------------------------------
2020-2-23
* Yoon-G provided 3 problems to be discussed
	
	(1) Implement Trie(Prefix tree): https://www.lintcode.com/problem/implement-trie-prefix-tree/description
	
	(2) Binary Tree Postorder Traversal: https://www.lintcode.com/problem/binary-tree-postorder-traversal/description
	
	(3) Internal working of Hashmap in Java: https://www.geeksforgeeks.org/internal-working-of-hashmap-java/
* Good luck to Yoon-G's proposal and presentation and Lei's project and paper reading!

---Lei

Hello World!

---Yoon-G

* Lei uploaded his solution for Implement Trie, and realized that his solution for Find_min_rotated_sorted_array is less than acceptable.

* Yoon-G decided to work on binary search questions on the following days

-----------------------------------
2020-2-24

* Yoon-G has assigned 3 binary search questions

* Lei is working on his Network Programming project and Yoon-G is working on the proposal for Software Engineering. They're both regretful for not having finished those work earlier. They're both trying hard to finish their handy jobs ASAP s.t. they may have time to exercise as well as to keep working on daily challenges

* Good luck for Lei's project and Yoon-G's proposal and presentation

----------------------------------
2020-2-25

* Lei is working on the project of computer networks, and Yoon-G is working on the proposal and presentation. So the daily discussion has been interrupted for one day.

* Lei felt depressed for not able to finish his project of networks, but this may act as a reminder for him that he has to work harder on daily things if he's expecting for more payback.

* Congratulations for Yoon-G! Got the mobile phone interview email! Good luck!

* Lei and Yoon-G discussed 3 questions in Lintcode

	(1)
 
	(2) Find the largest number in a mountain series
		$ be careful with the situation that the series are monotocal

	(3) Calculate the k-diff pairs
		$ space complexity: O(n)
		$ time complexity: O(n^2)
		$ solution (by Lei)
			I. Notate the given array as arr, and build another 2 arrays a[] and c[], a[] notating the elements that have shown up in the array by increasing order of the content, and c[] notating the corresponding times of each element showing up in the array arr. Also notate num of the number of how many different number have shown up in the arr[].
			II. Outer loop: traverse the array arr, for each element arr[i], use binary search to find the index (returned as position) in a[0...num-1] s.t. position is the smallest index that satisfying a[1..position-1] are all smaller or equal to arr[i]. Then we detect if there's already an element in the array with this number arr[i], if so, increment c[i], otherwise create a new element and insert it the index of position. This calls for nlogn times of searching and n^2 time of element moving (worst case).
			III. Traverse the array of a[], detecting the k-diff pairs. If k=0, then we only calculate the number of numbers with showing up times c[i]>1. If k>0, then for each a[i], we can use binary search to find the exact i' that i'-i=k, if there's such i, then we increment the counting number.

		$ Yoon-G has solution with time complexity of O(nlogn) and Space Comlexity of O(M), M=10^7. Seems better.

----------------------------------
2020-2-26

* 
