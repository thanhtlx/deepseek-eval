class Problem {
    public static ArrayList<Long> rollingMax(ArrayList<Long> numbers) {
Deque<Long> deque = new ArrayDeque<>();
ArrayList<Long> result = new ArrayList<>();

for (int i = 0; i < numbers.size(); i++) {
    while (!deque.isEmpty() && numbers.get(i) >= deque.peekLast()) {
        deque.pollLast();
    }
    deque.offerLast(numbers.get(i));
    
    if (i >= numbers.size() - 3) {
        result.add(deque.peekFirst());
    }
}

return result;
	}
}