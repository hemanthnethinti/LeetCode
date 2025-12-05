class Solution {
    public int[] asteroidCollision(int[] asteroids) {
           Stack<Integer> s = new Stack<>();

        for (int a : asteroids) {
            // Process collisions
            while (!s.isEmpty() && s.peek() > 0 && a < 0) {
                int top = s.peek();
                if (Math.abs(top) < Math.abs(a)) {
                    s.pop();   // top explodes → continue checking
                    continue;
                } else if (Math.abs(top) == Math.abs(a)) {
                    s.pop();   // both explode
                }
                a = 0;  // current asteroid destroyed
                break;
            }

            if (a != 0) {  
                s.push(a);   // no collision → add to stack
            }
        }

        // Convert stack to array
        int[] result = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            result[i] = s.get(i);
        }

        return result;
}
}