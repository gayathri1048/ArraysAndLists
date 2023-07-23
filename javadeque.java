// Question 9: Java Dequeue

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-dequeue/problem


import java.util.*;
    public class javadeque {
        static Scanner in=new Scanner(System.in);
        static Deque<Integer> deque = new ArrayDeque<>();
        static HashSet<Integer> hs = new HashSet<>();
        static int n = in.nextInt();
        static int m = in.nextInt();
        static int[] nums = new int[n];
        static int maxuniquenumber()
        {
            int count=0;
            for(int i = 0 ; i < n ; i++){
                deque.add(nums[i]);
                if(deque.size()>m){
                    int removed = deque.removeFirst();
                    if(!deque.contains(removed)){
                        hs.remove(removed);
                    }
                }
                hs.add(nums[i]);
                if(hs.size()>count){
                    count = hs.size();
                }
            }
            return count;
        }
        public static void main(String[] args) {
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            int count=maxuniquenumber();
            System.out.println(count);
        }
    }
                

